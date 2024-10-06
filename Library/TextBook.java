package Library;
/*
 * int standard 
TextBook( ) 
TextBook(String isbn, String bookTitle, String authorName, double price, int availableQuantity, 
int standard) 
 
void setStandard(int standard) 
int getStandard( ) 
 */
public class TextBook extends Book{
    private int standard ;
    public TextBook( ) {}
    public TextBook(String isbn, String bookTitle, String authorName, double price, int availableQuantity, 
    int standard) {
        super(isbn, bookTitle, authorName, price, availableQuantity);
        this. standard=standard;
    }
 
    public void setStandard(int standard) {
        this.standard=standard;
        System.out.println("new standard set");
    }
    public int getStandard( ) {
        return standard;
    }
    public void showDetails(){
        System.out.println(getIsbn());
        System.out.println(getBookTitle());
        System.out.println(getAuthorName());
        System.out.println(getPrice());
        System.out.println(getAvailableQuantity());
        System.out.println(getStandard());
        System.out.println("<------------------->");
    }
}
