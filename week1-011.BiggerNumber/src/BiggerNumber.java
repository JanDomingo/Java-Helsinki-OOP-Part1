
import java.util.Scanner;

public class BiggerNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number: ");
        int first = Integer.parseInt(reader.nextLine());
        
        System.out.print("Type another number: ");
        int second = Integer.parseInt(reader.nextLine());
        
        if(first > second) {
            System.out.println("The bigger of the two numbers given was: " + first);
        }
        else {
            System.out.println("The bigger of the two numbers given was: " + second);
        }
            
        
    }
}
