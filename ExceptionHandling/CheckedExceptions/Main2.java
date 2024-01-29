package ExceptionHandling.CheckedExceptions;

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Main2 {
    public static void main(String[] args){

            try{
                readFile("input.txt");
            }
            catch(FileNotFoundException exception){
                System.out.println(exception.getMessage());
            }
            finally{
                System.out.println("process complete");
            }
    }


    public static void readFile(String fileName) throws FileNotFoundException {
        
        FileInputStream fis = new FileInputStream(fileName);
        Scanner read  = new Scanner(fis);
        System.out.println(read.nextLine());
        read.close();
    }
    
}
