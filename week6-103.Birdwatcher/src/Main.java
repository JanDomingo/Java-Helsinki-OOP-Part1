import java.util.Scanner;
public class Main {  

    public static void main(String[] args) {
    // implement your program here
    // do not put all to one method/class but rather design a proper structure to your program
        
    // Your program should use only one Scanner object, i.e., it is allowed to call 
    // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
            BirdWatcher database = new BirdWatcher();
    
            Scanner scanner = new Scanner (System.in);

            
            while (true) {
            System.out.println("Type one of the following: Add, Observation, Statistics, Show, or Quit");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("Add")) {
                addBird(scanner, database);
            } else if (input.equalsIgnoreCase("Observation")) {
                observation(scanner, database);
            } else if (input.equalsIgnoreCase("Statistics")) {
                database.print();
            } else if (input.equalsIgnoreCase("Show")) {
                show(scanner, database);
            } else if (input.equalsIgnoreCase("Quit")) {
                break;
            }
        }
            
            
            
    }
    
    private static void addBird(Scanner scanner, BirdWatcher database){
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Latin Name: ");
        String latinName = scanner.nextLine();
        database.add(name, latinName);
    }
    
    private static void observation(Scanner scanner, BirdWatcher database){
        System.out.println("What was observed?: ");
        String name = scanner.nextLine();
        database.check(name);
        
    }
    
    private static void show(Scanner scanner, BirdWatcher database){
        System.out.println("Which bird? ");
        String name = scanner.nextLine();
        database.printSingleBird(name);
    }


    
    
}