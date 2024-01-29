package ExceptionHandling.ArgumentValidation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        User user = new User();

        // username
        System.out.println("please enter the username");
        String username = scan.nextLine();

        if(username.isBlank()){
            System.out.println("that is invalid username");
        }
        else{
         user.setUsername(username);
        }
        
        //age
        System.out.println("please enter your age");
        if(scan.hasNextInt()){
            
        int age = scan.nextInt();
        if(age<0){
            System.out.println("your age can't be less than zero");
        }
        else{
            user.setAge(age);
        }
    }
    else{
        scan.nextLine();
    }
        scan.close();
    }
}