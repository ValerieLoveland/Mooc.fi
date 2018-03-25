
import java.util.ArrayList;
import java.util.Scanner;

public class RecurringWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        String input="";

        ArrayList <String> words = new ArrayList <String>();
        // create here the ArrayList 
        System.out.println("Type a word:");
            input=reader.nextLine();
            words.add(input); 
            
        while (true){
            System.out.println("Type a word:");
            input=reader.nextLine();
           
            if (words.contains(input)){
             
                    break;}
                else{
             words.add(input); 
            }            
            }
            
         System.out.println("You gave the word " +input +" twice.");
            
        }}
        
        
             
        
        
 
