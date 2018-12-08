import java.util.ArrayList;

public class Scores {
        
    int[] grades = {0,0,0,0,0,0};
    ArrayList <Integer> scores = new ArrayList <Integer>();
    
    public void add(int toAdd) {
        scores.add(toAdd);
    }
    
    public void calculate() {
        for (int score : scores) {
            if (score >= 50 && score <= 60)
                grades[5]++;
            else if (score >=45 && score <=49)
                grades[4]++;
            else if (score >=40 && score <=44)
                grades[3]++;
            else if (score >=35 && score <=39)
                grades[2]++;
            else if (score >=30 && score <=34)
                grades[1]++;
            else if (score >=0 && score <=29)
                grades[0]++;
            }
    }
    
    public void print() {
        for (int i=5; i >= 0; i--) {
            System.out.print(i + ": ");
            printStars(grades[i]);
            System.out.println("");
        }
    }
    
    public void printStars(int amount) {
            for (int j = 0; j < amount; j++) {
                System.out.print("*");
          }
    }
    
    public double acceptancePercentage() {
        double accepted = 0.0;
        double percentage = 0.0;
        for (int i = 1; i <= grades.length-1; i++) {
            accepted += (double) grades[i];
        }
        percentage = 100*accepted/(accepted + grades[0]);
        return (double) percentage;
    }
}
