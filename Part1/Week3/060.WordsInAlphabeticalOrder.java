
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInAlphabeticalOrder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here an ArrayList
        ArrayList <String> words = new ArrayList<String>();
        String input ="";
        while (true){
        System.out.println("Type a word:");
        input =  reader.nextLine();
        if(input.equals("")){
            break;
            
        }else{
            words.add(input);
            
        }
        
                
                   
                   
    }Collections.sort(words);
        for (String word:words){
            System.out.println(word);
        }} 
         
}
