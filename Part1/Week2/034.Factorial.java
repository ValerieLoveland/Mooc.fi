import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number: ");
        int num = Integer.parseInt(reader.nextLine());
        
        int i;
        int result=1;
        
        if (num == 0){
            System.out.println("1");
        }
        else{
            for(i = num; i>0; i--){
                result = result * num;
                num --;
            }
            System.out.println("Factorial is " + result);     
        }
    }
}
