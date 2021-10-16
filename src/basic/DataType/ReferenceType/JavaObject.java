package src.basic.DataType.ReferenceType;

public class JavaObject {
    int myNum = 5; // Attributes
    final int myNum2 = 3;

    public static void main(String[] args) {
        JavaObject myObj = new JavaObject();
        System.out.print(myObj.myNum);
    }
}
