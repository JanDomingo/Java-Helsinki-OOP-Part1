
import java.util.Scanner;

public class Circumference {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type the radius: ");
        int radius = Integer.parseInt(reader.nextLine());
        
        double circumference = 2 * Math.PI * (double)radius;
        
        System.out.println("Circumference of the circle: " + circumference);
    }
}
