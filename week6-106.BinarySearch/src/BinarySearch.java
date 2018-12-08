public class BinarySearch {
    public static boolean search(int[] array, int searchedValue) {
        int lower = 0;
        int upper = array.length - 1;

        while (lower <= upper) {
            int middle = (lower + upper) / 2;   //Middle is the index
            
            if (array[middle] == searchedValue) {
                return true;
            }
            
            else if (array[middle] > searchedValue) {
                upper = middle-1;
                middle = (lower + upper) / 2;
            }
            
            else if (array[middle] < searchedValue) {
                lower = middle + 1;
                middle = (lower + upper) / 2;
            }      
       }

        return false;
    }
}
