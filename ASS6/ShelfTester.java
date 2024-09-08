
  
public class ShelfTester{
    public static void main(String [] args){
      Shelf shelf = new Shelf();
      shelf.showDetails();
      System.out.println("1---------------");
      shelf.addBooks(3);
      System.out.println("2---------------");
      shelf.capacity = 7;
      shelf.addBooks(3);
      System.out.println("3---------------");
      shelf.showDetails();
      System.out.println("4---------------");
      shelf.addBooks(5);
      shelf.showDetails();
      shelf.capacity += 4;
      System.out.println("6---------------");
      shelf.addBooks(5);
      shelf.showDetails();
    }
}
class Shelf{
  public int capacity=0;
  public int numB=0;
  public void showDetails(){
    System.out.println("Shelf capacity: "+this.capacity);
    System.out.println("Number of books: "+this.numB);
  }
  public void addBooks(int a){
    if(capacity==0){
      System.out.println("Zero capacity. Cannot add books.");
    }
    else if(numB+a <capacity ){
      System.out.println(a+" books added to shelf");
      numB+=a;
    }
    else if(numB+a>capacity){
      System.out.println("Exceeds capacity");
    }
  }
}
  