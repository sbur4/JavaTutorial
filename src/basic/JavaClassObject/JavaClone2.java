package src.basic.JavaClassObject;

public class JavaClone2 {

    int x;
    int y;

    public Object clone() {
        JavaClone2 javaClone2 = new JavaClone2();
        javaClone2.x = this.x;
        javaClone2.y = this.y;
        return javaClone2;
    }
}
