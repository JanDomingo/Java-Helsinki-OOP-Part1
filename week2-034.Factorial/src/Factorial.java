import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number: ");
        int input = Integer.parseInt(reader.nextLine());
        
        //Formula for factorial is 1*2*3*...*n
        
        int factorial = 1;
        while (input > 0) {
            factorial = factorial * input;
            input--;
        }
            System.out.println(factorial);

            
            
        }
        }
    

