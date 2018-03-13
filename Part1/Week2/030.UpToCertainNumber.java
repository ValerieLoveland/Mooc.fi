
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int i;
        int upTo;
        System.out.println("Up to what number?");
        upTo = Integer.parseInt(reader.nextLine());
        
        for (i=1; i<= upTo; i++)
            System.out.println(i);
        
    }
}
