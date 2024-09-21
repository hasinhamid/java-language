public class ToyTester {
    public static void main(String[] args){
        Toy t1 = new Toy("Car", 230);
        System.out.println("1=================");
        t1.updatePrice(250);
        System.out.println("2=================");
        System.out.println(t1.name);
        t1.showPrice();
        System.out.println("3=================");
        Toy t2 = new Toy("Robot", 450);
        System.out.println("4=================");
        t2.updateName("Autobot");
        System.out.println("5=================");
        System.out.println(t2.name);
        t2.showPrice();
    }
}
class Toy{
    public int price;
    public String name;
    public Toy(String str, int num){
        price=num;
        name= str;
        System.out.println("A new toy has been made!");
    }
    public void updatePrice(int n){
        price=n;
    }
    public void showPrice(){
        System.out.println("price: "+price+" Taka");
    }
    public void updateName(String str){
        System.out.println("Changing old name: "+name);
        System.out.println("new name: "+str);
        name = str;
    }
}

