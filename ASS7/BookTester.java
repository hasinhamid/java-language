public class BookTester {
    public static void main(String[] args) {
       System.out.println("< —--—----1—-------->");
       Book b1 = new Book("The Alchemist");
       b1.displayDetails(); 
       System.out.println("< —--—----2—-------->");
       Book b2 = new Book("1984", "George Orwell");
       b2.displayDetails();  
       System.out.println("< —--—----3—-------->");
       Book b3 = new Book("To Kill a Mockingbird", "Harper Lee", 300);
       b3.displayDetails();
       System.out.println("< —--—----4—-------->");
       b1.setDetails(250); 
       b1.displayDetails();  
       System.out.println("< —--—----5—-------->");
       b2.setDetails("Orwell", 350); 
       b2.displayDetails();  
    }
  }
class Book{
  private int price;
  private String title;
  private String author;
  public Book(String str){
    title= str;
  }
  public Book(String str,String st){
    title= str;
    author= st;
  }
  public Book(String str,String st, int a){
    title= str;
    author= st;
    price =a;
  }
  public void displayDetails(){
    if(title!=null){
      System.out.print("Title: "+title);
    }
    if(author!=null){
      System.out.print(", Author: "+author);
    }
    if(price!=0){
      System.out.print(", Price: "+price);
    }
    System.out.println();
  }
  public void setDetails(int a){
    price=a;
  }
  public void setDetails(String str, int b){
    price=b;
    author=str;
  }
}