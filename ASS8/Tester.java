public class Tester{
    public static void main(String args[]){
      Borrower.bookStatus();
      System.out.println("*********1*********");
      Borrower b1 = new Borrower("Nabila");
      b1.borrowBook("Pather Panchali");
      b1.borrowBook("Anandmath");
      b1.borrowerDetails();
      System.out.println("*********2*********");
      Borrower b2 = new Borrower("Sadia");
      b2.borrowBook("Anandmath");
      b2.borrowBook("Durgesh Nandini");
      b2.borrowBook("Pather Panchali");
      b2.borrowerDetails();
      System.out.println("*********3*********");
      System.out.println(Borrower.remainingBooks("Anandmath")+" copies of Anandmath is remaining.");
      System.out.println("*********4*********");
      Borrower b3 = new Borrower("Anika");
      b3.borrowBook("Anandmath");
      Borrower.bookStatus();
      System.out.println("*********5*********");
      Borrower b4 = new Borrower("Oishi");
      b4.borrowBook("Anandmath");
      b4.borrowBook("Durgesh Nandini");
      b4.borrowerDetails();
    }
  }
  
  class Borrower{
    public static int book_count[] = {3, 3, 3};
    public static String book_name[] = {"Pather Panchali", "Durgesh Nandini", "Anandmath"};
    private String name;
    private int count;
    private String[] borrowed=new String[3];
    public Borrower(String str){
      name=str;
    }
    public static void bookStatus(){
      System.out.println("Available Books: ");
      for(int i=0;i<book_count.length;i++){
        System.out.println(book_name[i]+": "+book_count[i]);
      }
    }
    public void borrowerDetails(){
      System.out.println("Name: "+name);
      if(count!=0){
        System.out.println("Books Borrowed:");
        for(int i=0;i<count;i++){
          System.out.println(borrowed[i]);
        }
      }
      else{
        System.out.println("No book borrowed");
      }
    }
    private static int bookIndex(String str){
      for(int i=0;i<book_name.length;i++){
        if(book_name[i].equals(str)){
          return i;
        }
      }
      return -1;
    }
    public static int remainingBooks(String str){
      int idx= bookIndex(str);
      return book_count[idx];
    }
    public void borrowBook(String str){
      int idx= bookIndex(str);
      if (book_count[idx]!=0) {
        borrowed[count++]=str;
        book_count[idx]-=1;
      }
      else{
        System.out.println("This book is not available.");
      }

    }
   
  }