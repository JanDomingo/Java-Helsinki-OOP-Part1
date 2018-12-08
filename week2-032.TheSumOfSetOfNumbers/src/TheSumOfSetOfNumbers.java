
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Until what? ");
        int input = Integer.parseInt(reader.nextLine());
        
        int i = 0;
        int sum = 0;
        while (i < input){
            i++;
            sum += i;
        }
    
        System.out.println("Sum is " + sum);
    }
}
