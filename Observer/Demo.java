package Observer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo {
    
    public static void main(String[] args) throws NumberFormatException, IOException {
        
        YoutubeChannel channel = new YoutubeChannel();

        Subscriber s1 = new Subscriber("Abhishek");

        Subscriber s2 = new Subscriber("Nachiket");

        channel.subscribe(s1);
        channel.subscribe(s2);

        System.out.println("\nCalling Notified");
        channel.notifyChanges("Observer Design Pattern");


        System.out.println("\nCalling Notified");
        channel.notifyChanges("Springboot");


        BufferedReader bf  = new BufferedReader(new InputStreamReader(System.in));

        while(true)
        {
            System.out.println("Press 1 to upload new video");
            System.out.println("Press 2 to create new subscriber");
            System.out.println("Press 3 to create Unsubscriber");
            System.out.println("Press 4 to exit");

            int c = Integer.parseInt(bf.readLine());
            if(c==1)
            {
                System.out.println("Enter title of New video to be upload : ");
                String heading  = bf.readLine();

                channel.notifyChanges(heading);

            }
            else if(c==2)
            {
                System.out.println("Enter name of new subscriber : ");
                String name = bf.readLine();
                Subscriber sc = new Subscriber(name);
                channel.subscribe(sc);
            }
            else if(c==3)
            {
                System.out.println("Enter name of Unsubscriber : ");
                String name = bf.readLine();

                // Find the subscriber with this name
                Observer unsub = null;
                for (Observer ob : channel.getSubscribers()) {
                    if (ob.getName().equalsIgnoreCase(name)) {
                        unsub = ob;
                        break;
                    }
                }

                if (unsub != null) {
                    channel.unsubscribe(unsub);
                } else {
                    System.out.println("Subscriber with name " + name + " not found.");
                }
                
            }
            else if(c==4)
            {
                System.out.println("Thanks for using observer Design Pattern");
                break;
                
            }
            else
            {
                System.out.println("Wrong Input");
                break;
            }

        }
    }
}
