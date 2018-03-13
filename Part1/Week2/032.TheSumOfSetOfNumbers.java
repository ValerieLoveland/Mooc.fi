
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int last=0;
        int i=0;
        int result = 0;
        int chron =0;
        
        System.out.println("Last ");
        last = Integer.parseInt(reader.nextLine()); 
        
        
        
        while (i< last){
            result = result+(chron+1);
            i++;
            chron++;
            
        }
        System.out.println("Sum is " + result);
    }
}
