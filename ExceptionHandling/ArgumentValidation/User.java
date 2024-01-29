package ExceptionHandling.ArgumentValidation;

public class User {
    private String userName;
    private int age;

    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        if(age<0){
            throw new IllegalArgumentException("Age can't be negative");
        }

        this.age = age;
    }

    public String getUsername(){
        return this.userName;
    }

    public void setUsername(String username){
        
        if(username==null || username.isBlank()){
            throw new IllegalArgumentException("username can't be empty");
        }
        this.userName = username;
    }
}
