package src.basic.GOFdesignPatterns.CreationalPatterns.PrototypePatterns;

import java.util.ArrayList;
import java.util.List;

/**
 * Прототип — это порождающий паттерн проектирования, который позволяет копировать объекты,
 * не вдаваясь в подробности их реализации.
 */
public class Prototype implements Cloneable {
    private List<String> empList;

    public Prototype() {
        empList = new ArrayList<String>();
    }

    public Prototype(List<String> list) {
        this.empList = list;
    }

    public void loadData() {
        //read all employees from database and put into the list
        empList.add("Pankaj");
        empList.add("Raj");
        empList.add("David");
        empList.add("Lisa");
    }

    public List<String> getEmpList() {
        return empList;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        List<String> temp = new ArrayList<String>();
        for (String s : this.getEmpList()) {
            temp.add(s);
        }
        return new Prototype(temp);
    }
}
