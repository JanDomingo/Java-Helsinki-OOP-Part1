
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type the points [0-60]: ");
        int p = Integer.parseInt(reader.nextLine());
        
        System.out.print("Grade: ");
        
        if (p <= 29) {
            System.out.println("failed");
        }
        else if (p >= 30 && p <= 34){
            System.out.println("1");
        }
        else if (p >= 35 && p <= 39){
            System.out.println("2");
        }
        else if (p >= 40 && p <= 44){
            System.out.println("3");
        }
        else if (p >= 45 && p <= 49){
            System.out.println("4");
        }
        else if (p >= 50 && p <= 60){
            System.out.println("5");
        }
    }
}
