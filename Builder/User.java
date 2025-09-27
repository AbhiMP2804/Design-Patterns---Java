package Builder;

public class User {
    
    private final int userId;
    private final String userName;
    private final String emailId;

    private User(UserBuilder builder){
        //initialise
        this.userId = builder.userId;
        this.userName = builder.userName;
        this.emailId = builder.emailId;
    }

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmailId() {
        return emailId;
    }


    @Override
    public String toString() {
        
        return this.userName + " : " + this.userId + " : " + this.emailId;
    }


    // inner class to create objects
    static class UserBuilder{

        private int userId;
        private String userName;
        private String emailId;

        public UserBuilder()
        {

        }


        // Method chaining
        public UserBuilder setUserId(int userId) {
            this.userId = userId;
            return this;
        }

        public UserBuilder setUserName(String userName) {
            this.userName = userName;
            return this;
        }

        public UserBuilder setEmailId(String emailId) {
            this.emailId = emailId;
            return this;
        }

        public User build()
        {
            //If we not pass this it will nbe null and using this will help us use this to assign object values
            // when build is called "this" is passed to User constructor and this already contains the object with set attributes hence it will set it accordingly
            User user = new User(this); 
            return user;
        }


        // Another way of doing by keeping constructor private make userBuilder private so that no one can use user1 method and are forced to use this method inly
        public static UserBuilder builder()
        {
            return new UserBuilder();
        } 

    }
    
}

/*
 * Builder Design Pattern : 

While creating object when object contain many attributes there are many problems exists :

1. We have to pass many arguments to create object
2. some parameters might be optional
3. Factory class takes all responsibility for creating object, if the object is heavy then all complexity is the part of factory class.

Used for creating immutable objects and helpw to create objects step by tep with not need of remembering all the constraints in sequence as well as optional constraints can be skipped or used.

This is exactly what the **Builder Pattern** does — it lets you **create an object step by step**, setting only the values you care about, instead of writing a long constructor like:

🔑 What is **Method Chaining**?

Method chaining is when you call **multiple methods in a single line** by having each method return the current object (`this`).

- **Method chaining** = returning `this` so you can call the next method in the same line.
- **Advantages** = readability, fluency, less repetition, cleaner code.
- **Here** = it makes the `Builder Pattern` work in a nice, step-by-step style.
 * 
 */