public class StudentTester {
    public static void main(String[] args) {
      Student.printDetails();
      System.out.println("--------------------");
      Student mikasa = new Student("Mikasa", 3.75);
      mikasa.individualDetail();
      System.out.println("--------------------");
      Student.printDetails();
      System.out.println("--------------------");
      Student harry = Student.createStudent("Harry", 2.5, "Charms");
      harry.individualDetail();
      System.out.println("--------------------");
      Student.printDetails();
      System.out.println("--------------------");
      Student levi = new Student("Levi", 3.33);
      levi.individualDetail();
      System.out.println("--------------------");
      Student.printDetails();
    }
  }
  class Student{
    public static int total;
    public static int cse;
    public static int other;
    private int id;
    private double cg;
    private String name;
    private String dept="cse";
    public static void printDetails(){
      System.out.println("Total Student(s): "+total+
                         "\nCSE Student(s): "+cse+
                         "\nOther Department Student(s): "+other);
    }
    public Student(String nm, double c){
      name=nm;
      total++;
      id=total;
      cg=c;
      cse++;
    }
    public Student(String nm, double c, String dp){
      name=nm;
      total++;
      id=total;
      cg=c;
      other++;
      dept=dp;
    }
    public static Student createStudent(String str, double a, String dp){
      return new Student(str,a,dp);
    }
    public void individualDetail(){
      System.out.println("ID: "+id+
      "\nName: "+name+
      "\nCGPA: "+cg+
      "\nDepartment: "+dept
      );
    }

  }