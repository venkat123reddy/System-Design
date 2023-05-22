package ProxyDesignPattern;

public class EmployeeImpl implements Employee{

    @Override
    public void create(String request,String ID) {

        System.out.println("created");
    }

    @Override
    public void print(String request) {

        System.out.println("Displaying the person");

    }
}
