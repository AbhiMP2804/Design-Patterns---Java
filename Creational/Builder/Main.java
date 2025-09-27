package Builder;

public class Main {

    public static void main(String[] args) {
        
        User u1 = new User.UserBuilder().
                setEmailId("abhimpat63@gmail.com").
                setUserId(57).
                setUserName("Abhishek Patwardhan").
                build();

                System.out.println(u1);


        User u2 = User.UserBuilder.builder().setEmailId("nachi@gmail.com").build();

        System.out.println(u2);

    }
    
}
