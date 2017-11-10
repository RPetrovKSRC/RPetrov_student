package shop;

public class User {
    String name;
    String password;
    double account;
    
    public User (String name, String password) {
        this.name = name;
        this.password = password;
        account = 0;
    }
    
    @Override
    public boolean equals(Object o) {
        User user = (User) o;
        return this.name.equals(user.name);
    }
    
    @Override
    public int hashCode() {
        //String namepass = this.name + this.password;
        //return namepass.hashCode();
        return this.name.hashCode();
    }
    
    @Override
    public String toString(){
        return "User - " + name + " (" + account + ")";
    }
    
}
