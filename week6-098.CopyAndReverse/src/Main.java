import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4};
        int[] reverse = reverseCopy(original);

        // print both
        System.out.println( "original: " +Arrays.toString(original));
        System.out.println( "reversed: " +Arrays.toString(reverse));
    }
    
    public static int[] copy(int[] array) {
        int[] copiedArr = new int[array.length];
        for (int i = 0; i < array.length; i++){
            copiedArr[i] = array[i];
        }
        return copiedArr;
    }
    
    public static int[] reverseCopy (int[] array) {
        int[] reverseArr = new int[array.length];
        int j = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            reverseArr[j] = array[i];
            j++;
        }
        return reverseArr;
    }
    
}
