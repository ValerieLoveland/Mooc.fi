import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        int num=0;
        int sum=0;
        int howMany =0;
        int odds=0;
        int evens=0;
        double average =0.0;
        Scanner reader = new Scanner(System.in);
        System.out.println("Type numbers: ");
        while (num !=-1){
        num= Integer.parseInt(reader.nextLine());
                sum= sum+num; 
                howMany=howMany+1;
                if (num%2!=0){
                    odds=odds+1;
                }
                if (num%2==0){
                evens=evens+1;
                }
        }
       
                    System.out.println("Thank you and see you later!");
                    System.out.println("The sum is: " + (sum+1));
                    System.out.println("How many numbers: " + (howMany -1));
                    average = (((double)sum+1)/(double)(howMany-1));
                    System.out.println("Average: "+ average);
                    System.out.println("Even numbers: " + evens );
                    System.out.println("Odd numbers: " + (odds-1));
        }
        
    }

