import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        
        int[] values = {8, 3, 7, 9, 1, 2, 4};
        sort(values);
    }
    
    public static int smallest(int[] array){
        int num = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] <= num) {
                num = array[i];
            }
        }
        return num;
    }
   
    public static int indexOfTheSmallest(int[] array) {
        int num = array[0];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] <= num) {
                num = array[i];
                index = i;
            }
        }
        return index;
    }
    
    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
        int num = array[index];
        int indexPosition = 0;
        for (int i = index; i < array.length; i++) {
            if (array[i] <= num) {
                num = array[i];
                indexPosition = i;
            }
        }
        return indexPosition;
    }
    
    public static void swap(int[] array, int index1, int index2) {
        int tmp;
        tmp = array[index1];
        array[index1] = array[index2];
        array[index2] = tmp;
    }
    
    public static void sort (int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array));
            int smallestIndex = indexOfTheSmallestStartingFrom(array, i);
            swap(array, i, smallestIndex);
        }
    }
}

