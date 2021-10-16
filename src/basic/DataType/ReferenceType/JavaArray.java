package src.basic.DataType.ReferenceType;

public class JavaArray {
    public static void main(String[] args) {

        // int[] nums ; int nums[]; - declare
        // nums new =int[2]; - instantiate
        // int[0] = 7; - initialization
        // int[] {0, 1, 2, 3};

        // One-dimensional array
        int[] intAr = { 07, 01, 88 };
        char[] charAr = { 'a', 'b', 'c' };
        String[] strAr = { "You", "are", "beautiful" };

        System.out.println(intAr[0]);
        System.out.println(charAr.length + "\n");

        for (int i = 0; i < strAr.length; i++) {
            System.out.print(strAr[i] + " ");
        }

        System.out.print("\n");

        for (char i : charAr) {
            System.out.print(i + " ");
        }

        System.out.print("\n");

        // Multidimensional array
        int[][] intArs = { { 07, 01, 88 }, { 16, 02, 93 } };
        for (int i = 0; i < intArs.length; i++) {
            for (int j = 0; j < intArs[i].length; j++) {
                System.out.println(intArs[i][j]);
            }
        }

        System.out.print("\n");

        // Anonymous array
        // new int[] {'1','2','3'};

        // Constant array
        // final char[] charConstant = { 's', 'e', 'r', 'g' };

        // Syntax to Declare an Array in Java
        // dataType[] arr; (or)
        // dataType []arr; (or)
        // dataType arr[];

        // Syntax to Declare Multidimensional Array in Java
        // dataType[][] arrayRefVar; (or)
        // dataType [][]arrayRefVar; (or)
        // dataType arrayRefVar[][]; (or)
        // dataType []arrayRefVar[];
    }

}
