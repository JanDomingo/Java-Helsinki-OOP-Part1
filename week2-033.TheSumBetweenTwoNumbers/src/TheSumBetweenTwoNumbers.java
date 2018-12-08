
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("First: ");
        int first = Integer.parseInt(reader.nextLine());
        
        System.out.print("Second: ");
        int last = Integer.parseInt(reader.nextLine());
        
        int sum = 0;
        
        while (first <= last) {
            sum += first;
            first += 1;
        }
        
        System.out.println("The sum is " + sum);
        
    }
}
