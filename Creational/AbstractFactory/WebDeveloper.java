package AbstractFactory;

public class WebDeveloper implements Employee {
    
    public int salary()
    {
        return 40000;
    }

    public String name()
    {
        System.out.println("I am a Web Developer");
        return "WEB DEVELOPER";
    }
}
