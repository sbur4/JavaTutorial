package src.basic.JavaClassObject;

public class JavaClone implements Cloneable {
    {
        int x;
        int y;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
