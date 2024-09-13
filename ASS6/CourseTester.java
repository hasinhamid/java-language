public class CourseTester{
    public static void main(String [] args){
      Course c1 = new Course();
      c1.createCourse("PL II", "CS11");
      System.out.println("--------1--------");
      c1.printDetails();
      System.out.println("--------2--------");
      c1.addOneContent("Overloading");
      c1.printDetails();
      System.out.println("--------3--------");
      c1.addOneContent("Encapsulation");
      c1.addTwoContent("Static", "Polymorphism");
      c1.printDetails();
      System.out.println("--------4--------");
      c1.addOneContent("Inheritance");
      System.out.println("--------5--------");
      Course c2 = new Course();
      c2.createCourse("DS", "CS22");
      c2.addOneContent("Stack");
      c2.addTwoContent("Recursion","Tree");
      c2.addTwoContent("Heap","Hashing");
      System.out.println("--------6--------");
      c2.printDetails();
    }
  }
  class Course{
    public String name;
    public String code;
    public String [] syl=new String[4];
    int c=0;
    public void createCourse(String st, String a){
      name =st;
      code= a;
    }
    public void addOneContent(String str){
      if(c<syl.length){
        syl[c++]= str;
        System.out.println(str+" was added.");
      }
      else{
        System.out.println("Cannot add more content");
      }
    }
    public void addTwoContent(String str, String str2){
      if(c<syl.length){
        syl[c++]= str;
        System.out.println(str+" was added.");
        if(c<syl.length){
          syl[c++]= str2;
          System.out.println(str2+" was added.");
        }
        else{
          System.out.println("Cannot add more content");
        }
      }
      else{
        System.out.println("Cannot add more content");
      }
    }
    public void printDetails(){
      System.out.println("Course details:");
      System.out.println("Course Name: "+name);
      System.out.println("Course Code: "+code);
      System.out.println("Course Syllabus:");
      if(c>0){
        for(int i=0;i<c;i++){
          if(i!=c-1){
            System.out.print(syl[i]+", ");
          }
          else{
            System.out.println(syl[i]);
          }
        }
      }
      else{
        System.out.println("No content yet.");
      }
    }
  }