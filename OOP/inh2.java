public class inh2 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Adder a= new Adder();
        System.out.println("My superclass is: "+ a.getClass().getSuperclass().getName());
        System.out.println(a.dd(40,2)+" "+a.dd(10,3)+" "+a.dd(16,4));
    }
}
class Arithmetic{
    int add(int a,int b){
        return a+b;
    }
}
class Adder extends Arithmetic{
    int dd(int a,int b){
        return super.add(a,b);
    }
}
