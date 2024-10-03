public class shapeTester {
    public static void main(String[] args) {
      Circle c = new Circle();
      System.out.println("=======================");
      c.name = "Circle";
      c.color = "Red";
      c.radius = 5;
      c.displayInfo();
      System.out.println("=======================");
      c.area();
    }
  }
  
  class Shape {
    public String name;
    public String color;
  
    public void displayInfo() {
      System.out.printf("Name: %s\nColor: %s\n", name, color);
    }
  }
  
  class Circle extends Shape {
    public int radius;
    public void area(){
      double area= 3.1416*radius*radius;
      System.out.println("Area of Red Circle: "+area);
    }
    
  }
  