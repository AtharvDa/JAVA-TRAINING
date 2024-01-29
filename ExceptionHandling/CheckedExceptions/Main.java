package ExceptionHandling.CheckedExceptions;

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args){
        
        try{
            FileInputStream fis = new FileInputStream("input.txt");
            Scanner read = new Scanner(fis);
            System.out.println(read.nextLine());
            read.close();
        }
        catch(FileNotFoundException exception){
            System.out.println(exception.getMessage());
        }
        finally{
            System.out.println("process complete");
    }
    
    }
    
}
