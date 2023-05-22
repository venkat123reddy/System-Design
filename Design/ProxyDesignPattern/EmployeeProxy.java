package ProxyDesignPattern;

public class EmployeeProxy implements Employee {


    Employee employee = new EmployeeImpl();
    @Override
    public void create(String request, String ID) {

        if(request.equals("ADMIN"))
        {
            employee.create(request,ID);
        }
        else { System.out.println("No Access");
        };

    }

    @Override
    public void print(String request) {

        if(request.equals("ADMIN") || request.equals("USER"))
        {
            employee.print(request);
        }
        else {

            System.out.println("No Access");
        }

    }
}
