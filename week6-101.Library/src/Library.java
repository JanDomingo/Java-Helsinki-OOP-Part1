import java.util.ArrayList;

public class Library {
    
    private ArrayList <Book> library = new ArrayList<Book>();
    
    public Library() {
        this.library = library;
    }
    
    public void addBook(Book newBook) {
        this.library.add(newBook);
    }
    
    public void printBooks() {
        for (Book book : this.library) {
            System.out.println(book);
        }
    }
    
    public ArrayList<Book> searchByTitle(String title){
        ArrayList <Book> found = new ArrayList<Book>();
        
        for (int i = 0; i < this.library.size(); i++) {
            if (StringUtils.included(this.library.get(i).title(), title))
            //if (this.library.get(i).title().contains(title)) {
                found.add(this.library.get(i));
            }
        return found;
    }
            
    public ArrayList<Book> searchByPublisher(String publisher){
        ArrayList <Book> found = new ArrayList<Book>();

        for (int i = 0; i < this.library.size(); i++) {
            if (this.library.get(i).publisher().contains(publisher)) {
            found.add(this.library.get(i));
            }
        }   
        return found;

    }
    
    public ArrayList<Book> searchByYear(int year){
        ArrayList <Book> found = new ArrayList<Book>();

        for (int i = 0; i < this.library.size(); i++) {
            if (this.library.get(i).year() == year){
            found.add(this.library.get(i));
            }
        }   
        return found;

    }
}

