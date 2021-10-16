package src.basic.JavaEnum;

public class Enam {

    public static void main(String[] args) {
        System.out.println(ZeroEnum.class);
        System.out.println(Names.valueOf("NAME_KATE"));
        System.out.println(Names.valueOf("NAME_KATE").ordinal());
        System.out.println(Names.valueOf("NAME_CRISTI").ordinal());
        System.out.println(Names.NAME_KATE);
        System.out.println(Names.NAME_CRISTI.ordinal());

        System.out.println(Cars.NAME_A.getS1());
        System.out.println(Cars.NAME_A.getS());
        System.out.println(Cars.NAME_B.getS1());
        System.out.println(Cars.NAME_B.getS());
        System.out.println(Cars.NAME_A.ordinal());
        System.out.println(Cars.NAME_B.ordinal());

        System.out.println(Cars.NAME_A.toString());
        System.out.println(Cars.NAME_B.toString());

        Cars cars=Cars.NAME_A;

        switch(cars){
            case NAME_A:
                System.out.println("ok");
                break;
            case NAME_B:
                System.out.println("bad");
                break;
            default:
                System.out.println("other way");
        }
    }

    enum ZeroEnum {
    }

    enum Names {
        NAME_KATE,
        NAME_CRISTI;
    }

    enum Cars {
        NAME_A("Aston Martin", "Acura"),
        NAME_B("Bugatti", "Bently");

        private final String s;
        private final String s1;

        Cars(String s1, String s) {
            this.s = s;
            this.s1 = s1;
        }

        public String getS() {
            return s;
        }

        public String getS1() {
            return s1;
        }

        @Override
        public String toString() {
            return "Cars{" +
                    "s='" + s + '\'' +
                    ", s1='" + s1 + '\'' +
                    '}';
        }
    }
}