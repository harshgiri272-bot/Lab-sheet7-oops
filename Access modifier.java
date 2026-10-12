package demo;
public class AccessDemo {
    public int publicValue = 1;
    protected int protectedValue = 2;
    int defaultValue = 3;
    private int privateValue = 4;
}
package other;
import demo.AccessDemo;
public class OutsideDemo {
    public static void main(String[] args) {
        AccessDemo obj = new AccessDemo();
        System.out.println(obj.publicValue); // Accessible
        // obj.protectedValue; // Not accessible to unrelated class in another package
        // obj.defaultValue;   // Not accessible outside package demo
        // obj.privateValue;   // Not accessible outside AccessDemo
    }
}
