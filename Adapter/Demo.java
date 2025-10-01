public class Demo{

    public static void main(String[] args)
    {
        System.out.println("Program Started!!");

        AppleCharger charger = new AdapterCharger(new DkCharger());

        Iphone iphone13 = new Iphone(charger);
        iphone13.chargeIphone();
    }

    
}