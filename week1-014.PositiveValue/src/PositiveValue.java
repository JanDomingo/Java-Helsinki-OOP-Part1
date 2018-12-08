
import java.util.Scanner;

public class PositiveValue {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number: ");
        int n = Integer.parseInt(reader.nextLine());
        
       boolean pos = n > 0;
       
       if (pos) {
           System.out.println("The number is positive.");
       }
       else {
           System.out.println("The number is not positive.");
       }
    }
}
