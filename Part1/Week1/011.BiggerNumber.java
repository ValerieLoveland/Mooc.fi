
import java.util.Scanner;

public class BiggerNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
int bigger;
        System.out.println("Type a number: ");
        int one = Integer.parseInt(reader.nextLine());
        System.out.println("Type another number: ");
        int two = Integer.parseInt(reader.nextLine());
        if (one >two){
        bigger = one;
        }
        
        else{
            bigger = two;
        }
         System.out.println("The bigger of the two numbers given was: "+ bigger);
    }
}
