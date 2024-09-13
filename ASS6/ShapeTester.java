public class ShapeTester{
    public static void main(String args []){
      Shape circle = new Shape();
      Shape triangle = new Shape();
      Shape trapezium = new Shape();
      
      circle.setParameters("Circle", 5);
      triangle.setParameters("Triangle", 4, 7);
      trapezium.setParameters("Trapezium", 2, 4, 9);
      
      System.out.println(circle.details());
      System.out.println("---------------");
      System.out.println(triangle.details());
      System.out.println("---------------");
      System.out.println(trapezium.details());  
    }
  }
  class Shape{
    public String name;
    public double area;
    public void setParameters(String str, int a){
      name=str;
      area=a*a*3.1416;
    }
    public void setParameters(String str, int a,int b){
      name=str;
      area=4*7/2;
    }
    public void setParameters(String str, int a,int b,int c){
      name =str;
      area=(a+b)*c/2;
    }
    public String details(){
      String str= "Shape Name: "+name+"\nArea: "+area;
      return str;

    }

  }
  
