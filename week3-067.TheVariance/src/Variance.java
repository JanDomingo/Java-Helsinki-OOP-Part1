import java.util.ArrayList;

public class Variance {
    // Copy here sum from exercise 63 
    public static int sum(ArrayList<Integer> list) {
        int sum = 0;
        for (int number : list) {
            sum += number;
        }
        return sum;
    }
    
    // Copy here average from exercise 64 
    public static double average(ArrayList<Integer> list) {
        double sum = sum(list);
        double size = list.size();
        return (sum/size);
    }

    public static double variance(ArrayList<Integer> list) {
        double avg = average(list);
        double sigma = 0;
        for (double term : list) {
            double difference = Math.pow(((term - avg)), 2.0);
            sigma = sigma + difference;
        }
      
        double var = sigma/(list.size()-1);
        return var;
        
    }    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        
        System.out.println("The variance is: " + variance(list));
    }

}
