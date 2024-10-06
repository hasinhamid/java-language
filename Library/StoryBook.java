package Library;
/*
 * String category 
StoryBook( ) 
StoryBook(String isbn, String bookTitle, String authorName, double price, int availableQuantity, 
String category) 
 
void setCategory(String category) 
String getCategory( ) 
 */
public class StoryBook extends Book {
    private String category ;
    public StoryBook( ) {

    }
    public StoryBook(String isbn, String bookTitle, String authorName, double price, int availableQuantity, 
        String category) {
    super(isbn, bookTitle,authorName,price,availableQuantity);
    this.category=category;

    }
 
    public void setCategory(String category) {
        this.category=category;
        System.out.println(" catagory set");
    }
    public String getCategory( ) {
        return category;
    }
    public void showDetails(){
        System.out.println(getIsbn());
        System.out.println(getBookTitle());
        System.out.println(getAuthorName());
        System.out.println(getPrice());
        System.out.println(getAvailableQuantity());
        System.out.println(getCategory());
        System.out.println("<------------------->");
    }
    
}
