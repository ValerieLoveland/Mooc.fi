
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();
             
        int choice=-1;
          int num=1;
          int guesses=1;
        while(numberDrawn!=choice){
        
               
        System.out.println("Guess a number: ");
        choice= Integer.parseInt(reader.nextLine());
       
        if(numberDrawn<choice){
          System.out.println("The number is lesser, guesses made: "+guesses);
             
        }  
        if(numberDrawn>choice){
           System.out.println("The number is greater, guesses made: "+guesses);
          
        }
        if(numberDrawn==choice){
            System.out.println("Congratulations, your guess is correct!");
            
        }
       guesses=guesses+num;
        }
    }

    
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
