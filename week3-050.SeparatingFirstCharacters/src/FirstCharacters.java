import java.util.Scanner;

public class FirstCharacters {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        String name = reader.nextLine();
        
        int i = 0;
        int j = 1;
        
        
        if (name.length() < 3){
            System.out.println("");
        } 
        else if (name.length() >= 3)
        while (i <= name.length()-1 && i < 3) { //Only needs first 3 characters
            System.out.println(+ j + ". character: " + name.charAt(i));
            i++;
            j++;
        }
    }
}
        
        //Testing code for a for loop, unsure if correct
        /*if (name.length() > 2) {
            for (int i = 0; i <= name.length(); i++) 
                for(int j = 0; j <= name.length()-1; j++) 
            System.out.println(+ j + " character: " + name.charAt(i)); */
    



