package recursion;

public class fib {
   public static void main(String[] args) {
    fib(0,1,9);
   }
   
public static void fib(int a , int b, int c){
    if(c<=0){
        return;
    }
    System.out.println(a);
    int x= a+b;
    fib(b,x,c-1);
   }
}
