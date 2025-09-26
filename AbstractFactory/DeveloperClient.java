package AbstractFactory;

public class DeveloperClient {

    public static void main(String[] args) {
        
        //I want to get Android Develoepr
        Employee e1 = EmployeeFactory.getEmployee(new AndroidDeveloperFactory());
        e1.name();
        

        Employee e2 = EmployeeFactory.getEmployee(new WebDeveloperFactory());
        e2.name();

        Employee e3 = EmployeeFactory.getEmployee(new ManagerFactory());
        e3.name();
    }
    
}
