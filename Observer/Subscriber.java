package Observer;

public class Subscriber implements Observer {

    private String name;
   
    Subscriber(String name)
    {
        this.name = name;
    }
    
    @Override
    public void notified(String title) {
        System.out.println("New video "+"'"+title+"'"+" notified to : "+this.name);
    }

    @Override
    public String getName() {
      
        return name;
        
    }

   
    
    
}
