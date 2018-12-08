
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a year: ");
        int year = Integer.parseInt(reader.nextLine());
        
        int mod = year % 4;
        int mod1 = year % 100;
        int mod4 = year % 400;

        
        if ((mod == 0 && mod1 == 0 && mod4 == 0)) {
            System.out.println("The year is a leap year.");
        }
        else if ((mod == 0) && (mod1 != 0)){
                    System.out.println("The year is a leap year.");
        }
        
        else {
            System.out.println("The year is not a leap year");
        }
    }
}


