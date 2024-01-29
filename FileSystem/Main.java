import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main{
    public static void main(String[] args){
        //writing in a file
        

        String[] languages = {"JAVA", "PYTHON", "JAVASCRIPT", "RUBY"};

        try{ 
        BufferedWriter writer = new BufferedWriter(new FileWriter("input.txt"));
        writer.write("First Line : Atharv Darunkar");
        writer.write("\nCompleting Internship tasks at effigo");

            for(String language: languages){
               writer.write("\n"+language) ;
            }
            
        writer.close();
        }
         catch (IOException e) {
            e.printStackTrace();
        }
        
        //Reading from a file
        try{

            BufferedReader reader = new BufferedReader( new FileReader("input.txt"));
            String line;

            while((line = reader.readLine()) != null){
                System.out.println(line);
            }
            reader.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}