import com.sun.org.apache.bcel.internal.generic.NEW;

public class Main {
    public static void main(String[] args) {

        Customer customer=new Customer();
        Employee employee=new Employee();
        Person person=new Person();
        EmployeeManager employeeManager=  new EmployeeManager();
        CustomerManager customerManager= new CustomerManager();
        customerManager.Add();

    }
}