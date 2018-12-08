import java.util.ArrayList;

public class LengthsOfStrings {
    
    public static ArrayList<Integer> lengths(ArrayList<String> list) {
        ArrayList<Integer> listLength = new ArrayList<Integer>(); 
        
        for (String word : list) {
            listLength.add(word.length());
        }
        return listLength;
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Ciao");
        list.add("Moi");
        list.add("Benvenuto!");
        list.add("badger badger badger badger");
        ArrayList<Integer> lengths = lengths(list);
        
        System.out.println("The lengths of the Strings: " + lengths);
    }
}
