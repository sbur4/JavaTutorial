package src.basic.JavaOperators.UnaryOperators;

public class UnaryOperator {
    public static void main(String[] args) {
        int n = 7;
        int sumN = ++n; // (1+7)=8
        int sumN1 = 1 + ++n;// 1+(1+8)= 1+9 =10
        int sumN2 = ++n + 2;// (1+9)+2=12
        System.out.println(
                "Increases the value of a variable by 1 BEFORE = " + sumN + "\t" + sumN1 + "\t" + sumN2 + "\n");
        int l = 8;
        int sumL = l++;// 8
        int sumL1 = 1 + l++;// 1+(8+1)= 1+9 =10
        int sumL2 = l++ + 2;// (9+1)+2=12
        System.out
                .println("Increases the value of a variable by 1 AFTER = " + sumL + "\t" + sumL1 + "\t" + sumL2 + "\n");

        int m = 9;
        int sumM = --m; // 8
        int sumM1 = 3 + --m;// 3+(1-8)= 3+7 =10
        int sumM2 = --m + 6;// (1-7)+6=12
        System.out.println(
                "Decreases the value of a variable by 1 BEFORE = " + sumM + "\t" + sumM1 + "\t" + sumM2 + "\n");
        int k = 4;
        int sumK = k--; // 4
        int sumK1 = 3 + k--;// 3+(4-1)= 3+3 =6
        int sumK2 = k-- + 6;// (3-1)+6=8
        System.out
                .println("Decreases the value of a variable by 1 AFTER = " + sumK + "\t" + sumK1 + "\t" + sumK2 + "\n");
    }
}
