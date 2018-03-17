
import java.util.Scanner;

public class ReversingText {

    public static String reverse(String text) {
        // write your code here
        int howLong = text.length();
        String reversed = "";
        for (int i=howLong-1; i>-1; --i){
        reversed = reversed + text.charAt(i);
        }
        // note that method does now print anything, it RETURNS the reversed string
        return reversed;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in your text: ");
        String text = reader.nextLine();
        System.out.println("In reverse order: " + reverse(text));
    }
}
