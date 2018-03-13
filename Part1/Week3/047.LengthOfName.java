
import java.util.Scanner;

public class LengthOfName {
    public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    System.out.println("Type your name: " ); 
    String typeName = reader.nextLine();
    System.out.println("Number of characters: " + calculateCharacters(typeName));
                 
    }
    
    
    
    public static int calculateCharacters(String text){
              
        int numChars= text.length();
        
        return numChars;   
                
    }
    
}
