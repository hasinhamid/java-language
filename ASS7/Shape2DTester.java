public class Shape2DTester {
    public static void main(String[] args) {
      Shape2D sq = new Shape2D(5);
      System.out.println("---------1----------");
      sq.area();
      System.out.println("---------2----------");
      Shape2D rectangle = new Shape2D(5,6);
      System.out.println("---------3----------");
      rectangle.area();
      System.out.println("---------4----------");
      Shape2D tri1 = new Shape2D(5,6,"Triangle");
      System.out.println("---------5----------");
      tri1.area();
      System.out.println("---------6----------");
      Shape2D tri2 = new Shape2D(5,6,7);
      System.out.println("---------7----------");
      tri2.area();
      System.out.println("---------8----------");
    }
  }
  class Shape2D{
    private double area;
    private String name;
    public Shape2D(int a){
      System.out.println("A Square has been created with");
      System.out.println("length: "+a);
      area=a*a;
      name= "Square";
    }
    public Shape2D(int a, int b){
      System.out.println("A Rectangle has been created with");
      System.out.println("length: "+a+" and breadth: "+b);
      area=a*b;
      name= "Rectangle";
    }
    public Shape2D(int a, int b, String str){
      System.out.println("A "+str+" has been created with");
      System.out.println("height: "+a+" and base: "+b);
      area=a*b/2;
      name =str;
    }
    public Shape2D(int a, int b,int c){
      System.out.println("A Triangle has been created with");
      System.out.println("the following sides: "+a+", "+b+", "+c);
      int s= (a+b+c)/2;
      area= Math.sqrt(s*(s-a)*(s-b)*(s-c));
      name = "Triangle";
    }
    public void area(){
      System.out.println("The area of the "+name+" is: "+area);
    }
  }