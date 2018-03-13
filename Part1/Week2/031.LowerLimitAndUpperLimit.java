
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
int i;
int first;
int last;
        System.out.println("First: ");
        first = Integer.parseInt(reader.nextLine());
        System.out.println("Last: ");
        last = Integer.parseInt(reader.nextLine());
        
        for (i=first; i<= last; i++)
            System.out.println(i);

    }
}
