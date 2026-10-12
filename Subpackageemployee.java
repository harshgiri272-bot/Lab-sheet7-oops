package company.employees;
public class Employee {
    public void display() { System.out.println("Employee details"); }
}
package company.main;
import company.employees.Employee;
public class Main {
    public static void main(String[] args) { new Employee().display(); }
}
