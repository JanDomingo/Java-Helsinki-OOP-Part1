import java.util.ArrayList;
import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        ArrayList<String> words = new ArrayList<String>();
        

        
        while (true) {
        System.out.print("Type a word: ");
        String input = reader.nextLine();
        if (!(input.isEmpty())) {
            words.add(input);
        } else {
            break;
        }
    }
        
        System.out.println("You typed the following words: ");
        for (String input:words) {
            System.out.println(input);
        }
        
        
    }
}
