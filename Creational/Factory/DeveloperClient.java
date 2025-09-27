package Factory;

public class DeveloperClient {
    public static void main(String[] args) {
        
        Employee e1 = EmployeeFactory.getEmployee("ANDROID DEVELOPER");

        int salary = e1.salary();
        System.out.println(salary);
    }
}
