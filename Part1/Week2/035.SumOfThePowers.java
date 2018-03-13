
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int num =2;
        int result=0;
        int i;
        int answer;
        System.out.println("Type a number:");
        int power = Integer.parseInt(reader.nextLine());
        
        
        for (i=power+1; i>=0; i--){
            
            answer = (int)Math.pow(2, power);
            result=result+answer;  
        power--;
        
        }
        System.out.println("The result is " + result);

    }
}
