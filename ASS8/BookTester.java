public class BookTester {
    public static void main(String[] args) {
        System.out.println("Total Books Sold: " + Book.total_books_sold);
        System.out.println("Total Revenue: "+Book.total_revenue + " TK");
        System.out.println("==========1==========");

        Book b1 = new Book("Java Programming", 10); // 10% discount
        b1.bookDetails();

        System.out.println("==========2==========");

        Book b2 = new Book("Python Programming", 15); // 15% discount
        b2.bookDetails();

        System.out.println("==========3==========");

        Book b3 = new Book("Data Structures", 5); // 5% discount
        b3.bookDetails();

        System.out.println("==========4==========");
        System.out.println("Total Books Sold: " + Book.total_books_sold);
        System.out.println("Total Revenue: "+Book.total_revenue + " TK");
    }
}
class Book{
    public static int total_books_sold;
    public static double total_revenue;
    private String title;
    private double price=150;
    private double discount(int a){
        double nP=price-(a*price/100);
        return nP;
    }
    public Book(String str, int dis){
        title=str;
        price=discount(dis);
        total_books_sold+=1;
        total_revenue+=price;
    }
    public void bookDetails(){
        System.out.println("Title: "+title+"\nPrice after Discount: \n"+price+"TK");
    }
    
}