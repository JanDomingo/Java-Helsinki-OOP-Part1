import java.util.ArrayList;

public class BirdWatcher {
    
    private final ArrayList<Bird> database;
    private Bird bird;

    public BirdWatcher() {
        this.database = new ArrayList<Bird>();
    }
    
    public void add(String name, String latinName) {
        bird = new Bird (name, latinName);
        this.database.add(bird);
    }
    
    public void check(String name) {
        for (Bird checkBird : database) {
            if (checkBird.getName().equalsIgnoreCase(name) 
                    || checkBird.getLatinName().equalsIgnoreCase(name)) {
                        checkBird.increaseCount();
                        return;
            }
        }
        System.out.println("It's not a bird!");
    }
    
    public void print() {
        for (Bird printBird : database) {
            System.out.println(printBird);
        }
    }
    
    public void printSingleBird(String name) {
        for (Bird checkBird : database) {
            if (checkBird.getName().equalsIgnoreCase(name) 
                    || checkBird.getLatinName().equalsIgnoreCase(name)) {
                        System.out.println(checkBird);
                        return;
            }
        }
        System.out.println("It's not a bird!");
    }
}
    

