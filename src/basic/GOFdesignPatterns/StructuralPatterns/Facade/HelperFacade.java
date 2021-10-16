package src.basic.GOFdesignPatterns.StructuralPatterns.Facade;

import java.sql.Connection;

/**
 * Фасад — это структурный паттерн проектирования, который предоставляет простой интерфейс к
 * сложной системе классов, библиотеке или фреймворку.
 */

public class HelperFacade {
    public static void generateReport(DBTypes dbType, ReportTypes reportType, String tableName) {
        Connection con = null;
        switch (dbType) {
            case MYSQL:
                con = MySqlHelper.getMySqlDBConnection();
                MySqlHelper mySqlHelper = new MySqlHelper();
                switch (reportType) {
                    case HTML:
                        mySqlHelper.generateMySqlHTMLReport(tableName, con);
                        break;
                    case PDF:
                        mySqlHelper.generateMySqlPDFReport(tableName, con);
                        break;
                }
                break;
            case ORACLE:
                con = OracleHelper.getOracleDBConnection();
                OracleHelper oracleHelper = new OracleHelper();
                switch (reportType) {
                    case HTML:
                        oracleHelper.generateOracleHTMLReport(tableName, con);
                        break;
                    case PDF:
                        oracleHelper.generateOraclePDFReport(tableName, con);
                        break;
                }
                break;
        }

    }

    public static enum DBTypes {
        MYSQL, ORACLE;
    }

    public static enum ReportTypes {
        HTML, PDF;
    }
}
