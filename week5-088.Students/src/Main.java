
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<Student>();
        Scanner reader = new Scanner(System.in);
        
        String studentName = "";
        String studentNumber = "";
        String studentSearch = "";
        
        while (true) {
            System.out.print("name: ");
            studentName = reader.nextLine();
            if (studentName.isEmpty()) {
                break;
            }
            
            System.out.print("studentnumber: ");
            studentNumber = reader.nextLine();
            
        Student student = new Student(studentName, studentNumber);
        list.add(student);
        
        }
        
        for (Student students : list) {
            System.out.println(students);
    }
        System.out.println("");
        System.out.print("Give search term :");
        studentSearch = reader.nextLine();
        System.out.println("");
        System.out.println("Result: ");
        
        int i = 0;
        while (i < list.size()) {
            Student search = list.get(i);
            String nameSearch = search.getName();
            if (nameSearch.contains(studentSearch)) {
                System.out.print(nameSearch + " ");
                String numSearch = search.getStudentNumber();
                System.out.print("(" + numSearch + ")");
                System.out.println("");
            }
            i++;
        }
    }
}
  
