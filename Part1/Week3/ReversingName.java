import java.util.Scanner;

public class ReversingName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String name = reader.nextLine();
        int howLong = name.length();
        
        for (int i=howLong-1; i>=0; i--){
            
            System.out.print(name.charAt(i));
                    
        }
    }
}
