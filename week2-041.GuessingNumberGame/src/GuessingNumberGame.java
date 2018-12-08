
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();
        
            System.out.println(numberDrawn);
            
            int guesses = 0;
            
            while(true){
            
            guesses++;
            System.out.print("Guess a number: ");
            int input = Integer.parseInt(reader.nextLine());
            
            if (input == numberDrawn){
                System.out.println("Congratulations, your guess is correct!");
                break;
            }
            else if (input > numberDrawn){
                System.out.println("The number is lesser, guesses made " + guesses);
            }
            else if (input < numberDrawn){
                System.out.println("The number is greater, guesses made " + guesses);
            }
        

            }
    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
