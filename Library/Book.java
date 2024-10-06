package Library;

/*
 * String isbn 
String bookTitle 
String authorName 
double price 
int availableQuantity  ####
Book( ) 
Book(String isbn, String bookTitle, String authorName, double price, int availableQuantity) 
 
void setIsbn(String isbn) 
void setBookTitle(String bookTitle) 
void setAuthorName(String authorName) 
void setPrice(double price) 
void setAvaiableQuantity(int availableQuantity) 
 
String getIsbn( ) 
String getBookTitle( ) 
String getAuthorName( ) 
double getPrice( ) 
int getAvailableQuantity( ) 
 
abstract void showDetails( )
 */
public abstract class Book implements BookOperation{
    private String isbn ;
    private String bookTitle; 
    private String authorName; 
    private double price ;
    private int availableQuantity;
    public Book(){

    }
    public Book(String isbn, String bookTitle, String authorName, double price, int availableQuantity){
        this.isbn=isbn;
        this.bookTitle=bookTitle;
        this.authorName= authorName;
        this.price=price;
        this.availableQuantity=availableQuantity;
    }
    public void setIsbn(String isbn){
        this.isbn=isbn;
    } 
    public void setBookTitle(String bookTitle) {
        this.bookTitle=bookTitle;
    }
    public void setAuthorName(String authorName){
        this.authorName=authorName;
    } 
    public void setPrice(double price) {
        this.price=price;
    }
    public void setAvaiableQuantity(int availableQuantity){
        this.availableQuantity=availableQuantity;
    }
    public String getIsbn( ) {
        return isbn;
    }
    public String getBookTitle( ) {
        return bookTitle;
    }
    public String getAuthorName( ) {
        return authorName;
    }
    public double getPrice( ) {
        return price;
    }
    public int getAvailableQuantity( ){
        return availableQuantity;
    }
    @Override
    public void addQuantity(int amount){
        setAvaiableQuantity(getAvailableQuantity()+amount);
        System.out.println("Added "+amount+ " Books");
    }
    @Override
    public void sellQuantity(int amount){
        if (getAvailableQuantity()-amount>=0) {
            setAvaiableQuantity(getAvailableQuantity()-amount);
            System.out.println(" sold "+amount +" Books");
        }

    }
    abstract void showDetails();
}
