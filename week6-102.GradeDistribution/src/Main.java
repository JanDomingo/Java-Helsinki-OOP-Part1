import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        Scores scores = new Scores();
        
        int input;
        System.out.println("Type exam scores, -1 completes:");
        
        input = lukija.nextInt();
        
        boolean userInput = false;  
        
        while (input != -1) {
            if (input <= 60 && input >= 0)
                scores.add(input);
            input = lukija.nextInt();
            userInput = true;
        }
        
        
        if (userInput) {    //If the user input was -1 the above code block did not run and will not run through the rest of the code
        System.out.println("Grade distribution:");
        scores.calculate();
        scores.print();
        
        System.out.println("Acceptance percentage: " + scores.acceptancePercentage());
        }
        
        
        // implement your program here
        // do not put all to one method/class but rather design a proper structure to your program
        
        // Your program should use only one Scanner object, i.e., it is allowed to call 
        // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
    }
}
