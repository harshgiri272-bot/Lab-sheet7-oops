import utils.MathUtils;
public class Main {
    public static void main(String[] args) {
        System.out.println("Add = " + MathUtils.add(8, 2));
        System.out.println("Subtract = " + MathUtils.subtract(8, 2));
        System.out.println("Multiply = " + MathUtils.multiply(8, 2));
    }
}
package utils;
public class MathUtils {
    public static int add(int a, int b) { return a + b; }
    public static int subtract(int a, int b) { return a - b; }
    public static int multiply(int a, int b) { return a * b; }
}
