package src.basic.JavaClassObject;

public class JavaClObj {
    Object O1;
    String str = "Hello Java";
    int a = 35;

    void sayHi() {
        System.out.println("Hi");
    }

    JavaClObj() {
        int b = 17;
    }

    {
        String str2 = "abc";
    }

    public interface InnerMain {
        String sayQQ();
    }

    public static class InnerMain_1 implements InnerMain {
        @Override
        public String sayQQ() {
            return "QQ";
        }
    }

    public static void main(String[] args) {
        Object m1 = new Object();
        JavaClObj m2 = new JavaClObj();
        JavaClObj m3 = m2;
        System.out.println(m1 + "\t" + m2);
        System.out.println(m1.getClass() + "\t" + m2.getClass());
        System.out.println(m2.str);
        System.out.println(m2.a);
        System.out.println(m2.equals(m1) + "\t" + m2.equals(m3));
        System.out.println();
        System.out.println(m1.hashCode() + "\t" + m2.hashCode() + "\t" + m3.hashCode());
        m2.sayHi();
        System.out.println();
        InnerMain_1 in1 = new InnerMain_1();
        System.out.println(in1.sayQQ());
    }
}
