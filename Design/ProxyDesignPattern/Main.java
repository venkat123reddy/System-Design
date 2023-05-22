package ProxyDesignPattern;

public class Main {
    public static void main (String ...args)
    {

        Employee employee = new EmployeeProxy();
        employee.create("ADMIN","123");
        employee.print("USER");
        employee.create("USER","123");
        employee.print("CUS");
    }
}
