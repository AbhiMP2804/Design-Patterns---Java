package AbstractFactory;

public class WebDeveloperFactory extends EmployeeAbstractFactory{


    @Override
    public Employee createEmployee() {
        
        return new WebDeveloper();
        // throw new UnsupportedOperationException("Unimplemented method 'createEmployee'");
    }
    
}
