public class CourseTester2{
    public static void main(String [] args){
      Course2 c1 = new Course2();
      c1.createCourse("PL II", "CS11");
      System.out.println("--------1--------");
      c1.printDetails();
      System.out.println("--------2--------");
      c1.addContent("Overloading");
      c1.printDetails();
      System.out.println("--------3--------");
      c1.addContent("Encapsulation");
      c1.addContent("Static", "Polymorphism");
      c1.printDetails();
      System.out.println("--------4--------");
      c1.addContent("Inheritance");
      System.out.println("--------5--------");
      Course2 c2 = new Course2();
      c2.createCourse("DS", "CS22");
      c2.addContent("Stack");
      c2.addContent("Recursion","Tree");
      c2.addContent("Heap","Hashing");
      System.out.println("--------6--------");
      c2.printDetails();
  }
}
class Course2{
  public String name;
  public String code;
  public String [] syl=new String[4];
  int c=0;
  public void createCourse(String st, String a){
    name =st;
    code= a;
  }
  public void addContent(String str){
    if(c<syl.length){
      syl[c++]= str;
      System.out.println(str+" was added.");
    }
    else{
      System.out.println("Cannot add more content");
    }
  }
  //overloading 
  public void addContent(String str, String str2){
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
