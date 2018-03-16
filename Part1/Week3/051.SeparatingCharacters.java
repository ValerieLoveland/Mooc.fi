
import java.util.Scanner;

public class SeparatingCharacters {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String name =reader.nextLine();
        int howManyLetters = name.length();
        for(int i=0; i<howManyLetters; i++){
            System.out.println(i+1+". "+"Character: " + name.charAt(i));
        } 
    }
}
