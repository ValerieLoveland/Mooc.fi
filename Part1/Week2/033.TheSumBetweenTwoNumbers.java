
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int i=0;
        int chron = 0;
        int first = 0;
        int last = 0;
        int result = 0;
        System.out.println("First: ");
        first = Integer.parseInt(reader.nextLine());
        
        System.out.println("Last: ");
        last = Integer.parseInt(reader.nextLine());
       // i = first;
       chron = first;
        for (i=first; i<= last; i++){
            
            result = result + (chron);
            
            //first++;
            //i++;
            chron++;
        }
        System.out.println("The sum: "+ result);
    }
}
