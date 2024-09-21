public class ParcelDriver {
    public static void main(String[] args){
       Parcel p1 = new Parcel();
       p1.printDetails();
       p1.name = "Spongebob";
       p1.printDetails();
       System.out.println("1**************");
       Parcel p2 = new Parcel("Bob the Builder");
       p2.weight = 15;
       p2.calcFee("Gulshan");
       p2.printDetails();
       System.out.println("2**************");
       p2.addWeight(25);
       p2.calcFee("Banani");        
       p2.printDetails();
       System.out.println("3**************");
       Parcel p3 = new Parcel("Dora the Explorer", 10);
       p3.addWeight(15);
       p3.calcFee("Dhanmondi");
       p3.printDetails();
    }
 }
 class Parcel{
   public String name;
   public int weight=0;
   public double fee=0;
   public Parcel(){
   }
   public Parcel(String str){
      name= str;
   }
   public Parcel(String str, int w){
      name= str;
      weight=w;
   }
   public void printDetails(){
      if(name!=null){
      System.out.println("Name: "+name+"\nTotal Weight: "+weight+"\nTotal Fee: "+fee);
      }
      else{
         System.out.println("Set name first");
      }
   }
   public void addWeight(int num){
      weight+=num;
      System.out.println("Updated Weight: "+weight);
   }
   public void calcFee(String str){
      int n=0;
      if(str=="Dhanmondi" && weight!=0){
         n=50;
      }
      fee= weight*20+n;
   }
 }
 