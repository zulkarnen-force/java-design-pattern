package oop;

public class UserBuilder {
    
    User user = null;
    
    public UserBuilder(){}
    
    public UserBuilder(User user) {
        this.user = user;
    }

    public void sayHello(){
        System.out.println("Hello my name is " + user.getUsername());
    }
}
