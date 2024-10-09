public class CargoTester {
    public static void main(String[] args) {
      System.out.println("Cargo Capacity: " + Cargo.capacity());
      System.out.println("1====================");
      Cargo a = new Cargo("Industrial Machinery", 4.5);
      a.details();
      System.out.println("2====================");
      a.load();
      System.out.println("3====================");
      Cargo b = new Cargo("Steel Ingot", 2.7);
      b.details();
      System.out.println("4====================");
      System.out.println("Cargo Capacity: " + Cargo.capacity());
      System.out.println("5====================");
      b.load();
      System.out.println("Cargo Capacity: " + Cargo.capacity());
      System.out.println("6====================");
      Cargo c = new Cargo("Tree Trunks", 3.6);
      c.load();
      System.out.println("7====================");
      c.details();
      b.details();
      System.out.println("8====================");
      Cargo d = new Cargo("Processed Goods", 1.8);
      d.load();
      System.out.println("Cargo Capacity: " + Cargo.capacity());
      System.out.println("9====================");
      b.unload();
      System.out.println("Cargo Capacity: " + Cargo.capacity());
      System.out.println("10====================");
      c.load();
      System.out.println("11====================");
      b.details();
      System.out.println("Cargo Capacity: " + Cargo.capacity());
    }
}
class Cargo{
  public static double capacity=10;
  private static int count;
  private String content;
  private int id;
  private double weight;
  private boolean loaded=false;
  public Cargo(String str,double a){
    id =++count;
    content= str;
    weight= a;
  }
  public static double capacity(){
    return capacity;
  } 
  public void details(){
    System.out.println("Cargo ID: "+id+", Contents: "+content+", Weight: "+weight+", Loaded: "+loaded);
  }
  public void load(){
    if (capacity-weight>=0) {
      capacity-=weight;
      loaded=true;
      System.out.println("Cargo "+id+" loaded for transport.");
    }
    else{
      System.out.println("Cannot load cargo, exceeds weight capacity.");
    }
  }
  public void unload(){
    if(loaded){
      capacity+=weight;
      loaded=false;
      System.out.println("Cargo "+id+" unloaded.");
    }
    
  }

}
  