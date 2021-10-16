package src.basic.JavaMath;

public class MyMath {
    public static void main(String[] args) {
        int a = 1;
        int b = -3;
        double c = -5.7;
        int g = 25;
        double e = 25.17;
        double v = 1.1;

        System.out.println("abs " + Math.abs(a));
        System.out.println("abs " + Math.abs(b));
        System.out.println("abs " + Math.abs(c));
        System.out.println("abs.Float.MAX_VALUE " + Math.abs(Float.MAX_VALUE));
        System.out.println("abs.MIN_VALU " + Math.abs(Float.MIN_VALUE));
        System.out.println("abs.NEGATIVE_INFINITY " + Math.abs(Float.NEGATIVE_INFINITY));

        System.out.println("acos " + Math.acos(c));
        System.out.println("acos PI " + Math.acos(-1));// PI

        System.out.println("asin " + Math.asin(c));
        System.out.println("atan " + Math.atan(e));
        System.out.println("atan2 " + Math.atan2(c, e));
        System.out.println("addExact " + Math.addExact(a, b));
        System.out.println("cbrt " + Math.cbrt(g));
        System.out.println("ceil " + Math.ceil(c));
        System.out.println("copySign " + Math.copySign(c, e));
        System.out.println("cos " + Math.cos(e));
        System.out.println("cosh " + Math.cosh(c));
        System.out.println("decrementExact " + Math.decrementExact(b));
        System.out.println("exp " + Math.exp(e));
        System.out.println("expm1 " + Math.expm1(c));
        System.out.println("floor " + Math.floor(e));
        System.out.println("floorDiv " + Math.floorDiv(a, b));
        System.out.println("floorMod " + Math.floorMod(a, b));
        // System.out.println("fma " + Math.fma(c, e, v));
        System.out.println("getExponent " + Math.getExponent(v));
        System.out.println("hypot " + Math.hypot(c, e));
        System.out.println("IEEEremainde " + Math.IEEEremainder(c, e));
        System.out.println("incrementExact " + Math.incrementExact(a));
        System.out.println("log " + Math.log(a));
        System.out.println("log10 " + Math.log10(a));
        System.out.println("log1p " + Math.log1p(a));
        System.out.println("min " + Math.min(a, b));
        System.out.println("max " + Math.max(c, e));
        System.out.println("multiplyExact " + Math.multiplyExact(a, b));
        // System.out.println("multiplyFull " + Math.multiplyFull(b, g));
        System.out.println("nextAfter " + Math.nextAfter(b, c));
        System.out.println("nextUp " + Math.nextUp(c));
        System.out.println("nextDown " + Math.nextDown(c));
        System.out.println("negateExact " + Math.negateExact(a));
        System.out.println("negateExact " + Math.pow(c, e));
        System.out.println("random " + Math.random());
        System.out.println("round " + Math.round(c));
        System.out.println("rint " + Math.rint(c));
        System.out.println("signum " + Math.signum(c));
        System.out.println("sin " + Math.sin(c));
        System.out.println("sinh " + Math.sinh(e));
        System.out.println("sqrt " + Math.sqrt(g));
        System.out.println("tan " + Math.tan(c));
        System.out.println("tanh " + Math.tanh(e));
        System.out.println("toDegrees " + Math.toDegrees(a));
        System.out.println("toRadians " + Math.toRadians(a));
        System.out.println("toIntExact " + Math.toIntExact(1111111));
        System.out.println("ulp " + Math.ulp(a));
        System.out.println("ulp " + Math.ulp(c));
    }
}
