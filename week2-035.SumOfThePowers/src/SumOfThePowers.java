
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
            System.out.print("Type a power: ");
            int power = Integer.parseInt(reader.nextLine());
            
            int number = 2;
            int i = 0;
            double sum = 0;

            while(i <= power) {
                sum = sum + ((int)Math.pow(number, i));
                i = i + 1;

            }
            
            System.out.println((int)sum);
    }
}
