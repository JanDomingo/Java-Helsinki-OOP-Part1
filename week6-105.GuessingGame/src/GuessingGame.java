import java.util.Scanner;

public class GuessingGame {

    private Scanner reader;

    public GuessingGame() {
        // use only this scanner, othervise the tests do not work
        this.reader = new Scanner(System.in);
    }

    public void play(int lowerLimit, int upperLimit) {
        instructions(lowerLimit, upperLimit);
        
        
        while (true) {
            int average = average(lowerLimit, upperLimit);
            
            if (isGreaterThan(average)) {
                lowerLimit = average + 1;
            }
            else {
                upperLimit = average;
            }

            if (lowerLimit == upperLimit) {
                System.out.println("The number you are thinking of is " + lowerLimit);
                break;
            }   
        }
    }

    public boolean isGreaterThan (int value) {
        System.out.println("Is your number greater than " + value + "? (y/n)");
        String yesOrNo = reader.nextLine();
        return yesOrNo.equals("y"); //Returns true if input equals 'y' else returns false
    }
    
    public int average (int firstNumber, int secondNumber) {
        int average = (firstNumber + secondNumber)/2;
        return average;
    }

    public void instructions(int lowerLimit, int upperLimit) {
        int maxQuestions = howManyTimesHalvable(upperLimit - lowerLimit);

        System.out.println("Think of a number between " + lowerLimit + "..." + upperLimit + ".");

        System.out.println("I promise you that I can guess the number you are thinking with " + maxQuestions + " questions.");
        System.out.println("");
        System.out.println("Next I'll present you a series of questions. Answer them honestly.");
        System.out.println("");
    }

    // a helper method:
    public static int howManyTimesHalvable(int number) {
        // we create a base two logarithm  of the given value

        // Below we swap the base number to base two logarithms!
        return (int) (Math.log(number) / Math.log(2)) + 1;
    }
    

    
}
