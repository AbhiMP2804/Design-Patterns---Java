public class Main {

    public static void main(String[] args) throws InterruptedException
    {
        System.out.println("Creating object using Prototype design Pattern");

        //First Object used to execute the complex logic
        NetworkConnection networkConnection = new NetworkConnection(null, null);
        networkConnection.setIp("192.168.4.4");
        networkConnection.loadVeryImportantData();

        System.out.println(networkConnection);


        //Creating the clone of above object
        //creating new object without actually creating it

        //we have not loaded the imp data in it but we will get it in the new object
        try {
            NetworkConnection networkConnection2 = (NetworkConnection) networkConnection.clone();

            networkConnection.getDomains().add("www.abhi.com");

            NetworkConnection networkConnection3 = (NetworkConnection) networkConnection.clone();


            System.out.println(networkConnection);

            System.out.println(networkConnection2);

            System.out.println(networkConnection3);
        } catch (CloneNotSupportedException e) {
            
            e.printStackTrace();
        }



    }   

}