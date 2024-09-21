public class StudentDriver {
    public static void main(String[] args){
      System.out.println("-----------------");
      Student student1 = new Student(12345678);
      student1.addCourse("CSE110");
      student1.setCG(2.5);
      student1.addCourse("CSE110");
      student1.addCourse("ENG101");
      student1.showAdvisee();
      System.out.println("-----------------");
      student1.rmAllCourse();
      student1.showAdvisee();
      System.out.println("-----------------");
      student1.setID(54652365);
      String[] courses = {"SOC101","CSE111","ENG102"};
      student1.addCourse(courses);
      student1.showAdvisee();
      System.out.println("-----------------");
      student1.addCourse("CSE230");
      student1.showAdvisee();
      System.out.println("-----------------");
      Student student2 = new Student(975738383,3.7);
      String[] courses2 = {"CSE220","PHY112","MAT120","BUS101","CHN101"};
      student2.addCourse(courses2);
      student2.showAdvisee();
    }
  }

  class Student{
    private int id;
    private double cg;
    private String[] courses=new String[4];
    public int i=0;
    private int cap=0;
    public Student(int a){
      id= a;
    }
    public Student(int a, double b){
      id= a;
      cg=b;
      if(b>=3){
        cap=4;
      }
      else if(b<3 && b>0){
        cap=3;
      }
    }
    public void addCourse(String str){
      if(i<cap){
        courses[i++]=str;
      }
      else if(cg==0){
        System.out.println("Failed to add "+str+"\nSet CG first");
      }
      else if(i>=cap){
        System.out.println("Failed to add "+str);
        System.out.println("CG is low. Can't add more than 3 courses.");
      }
    }
    public void addCourse(String[] str){
        for(int i=0;i<str.length;i++){
          if(i<cap){
            courses[i]=str[i];
          }
          else{
            System.out.println("Failed to add "+str[i]+"\nMaximum "+cap+" courses allowed.");
          }
        }
        if(str.length>cap){
          i=cap;
        }
        else{
          i=str.length;
        }
    }
    public void setCG(double a){
      cg=a;
      if(a<3){
        cap=3;
      }
      else{
        cap=4;
      }
    }
    public void rmAllCourse(){
      courses= new String[4];
      i=0;
    }
    public void showAdvisee(){
      System.out.println("Student ID: "+id+", CGPA: "+cg);
      if(i!=0){
        System.out.println("Added courses are:");
        for(int j=0;j<i;j++){
          System.out.print(courses[j]+" ");
        }
        System.out.println();
      }
      else{
        System.out.println("No courses added.");
      }
      
    }
    public void setID(int a){
      id=a;
    }
    

  }
  