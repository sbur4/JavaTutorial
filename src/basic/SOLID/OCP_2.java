package src.basic.SOLID;

/**
 * he single responsibility principle states that every Java class must perform a single functionality.
 * Implementation of multiple functionalities in a single class mashup the code and if any modification
 * is required may affect the whole class. It precise the code and the code can be easily maintained.
 * It precise the code and the code can be easily maintained.
 */

public class OCP_2 {
    public static void main(String[] args) {
        Dev d = new Dev();
        d.getDevId();
        d.getDevName();
    }
}

class Dev {
    Integer devId;
    String devName;

    public Dev() {
    }

    public Dev(Integer devId, String devName) {
        this.devId = devId;
        this.devName = devName;
    }

    public Integer getDevId() {
        return devId;
    }

    public String getDevName() {
        return devName;
    }
}

