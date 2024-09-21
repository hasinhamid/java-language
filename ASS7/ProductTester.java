public class ProductTester{
    public static void main(String[] args) {
      System.out.println("< —--—----1—-------->");
      Product product1 = new Product();
      product1.displayInfo();
      System.out.println();
      System.out.println("< —--—----2—-------->");
      Product product2 = new Product("Laptop", 1200.00);
      product2.setQuantity(10);
      product2.displayInfo(true); 
      System.out.println("< —--—----3—-------->");
      System.out.println("Retrieved Price: $" + product2.getPrice());
      System.out.println("Retrieved Quantity: " + product2.getQuantity());
        } 
  }
  class Product{
    private String name;
    private double price;
    private int qua=0;
    public Product(){
      name="Unknown";
      price=0;
    }
    public Product(String str, double a){
      name =str;
      price=a;
    }
    public void setQuantity(int a){
      qua=a;
    }
    public int getQuantity(){
      return qua;
    }
    public double getPrice(){
      return price;
    }
    public void displayInfo(){
      System.out.print("Product Name: "+name+"\nPrice: "+price);
    }
    public void displayInfo(boolean bool){
      System.out.print("Product Name: "+name+"\nPrice: "+price);
      if(bool){
        System.out.println("\nQuantity: "+qua);
      }
    }



  }
  