
import java.util.Scanner;

public class FirstPart {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a word: ");
        String wholeWord = reader.nextLine();
        System.out.println("Length of first part: ");
        int partLenth = reader.nextInt();
        System.out.println("Result: " + wholeWord.substring(0, partLenth));
    }
}
