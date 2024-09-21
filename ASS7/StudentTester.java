public class StudentTester{
    public static void main(String[] args){
        Student s1 = new Student("Harry", "CSE");
        System.out.println(s1.name);
        s1.updateName("Harry Potter");
        System.out.println(s1.accessName());
        System.out.println(s1.prog);
        s1.updateProgram("CS");
        String prog = s1.accessProgram();
        System.out.println(prog);
    }
 }
 class Student{
    public String name;
    public String prog;
    public Student(String st, String str){
        name= st;
        prog= str;
    }
    public String accessName(){
        return name;
    }
    public String accessProgram(){
        return prog;
    }
    public void updateName(String str){
        name =str;
    }
    public void updateProgram(String str){
        prog =str;
    }
 } 
 