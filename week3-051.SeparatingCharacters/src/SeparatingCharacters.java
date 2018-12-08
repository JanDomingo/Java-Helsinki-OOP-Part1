
import java.util.Scanner;

public class SeparatingCharacters {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        String name = reader.nextLine();
        
        int i = 0;
        int j = 1;
        
        while (i <= name.length()-1) { 
            System.out.println(+ j + ". character: " + name.charAt(i));
            i++;
            j++;
        }
    }
}

