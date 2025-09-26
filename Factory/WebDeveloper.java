package Factory;

public class WebDeveloper implements Employee {
    
    public int salary()
    {
        System.out.println("Getting WebDeveloper Salary");
        return 40000;
    }
}
