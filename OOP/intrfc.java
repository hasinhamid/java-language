/**
 * intrfc
 */
import java.util.*;
public class intrfc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        MyCalculator bb= new MyCalculator();
        System.out.println("I implemented: "+ bb.getClass().getInterfaces()[0].getName());
        System.out.println(bb.divisor_sum(n));
        sc.close();
    }
    
}
/**
 * Innerintrfc
 */
interface AdvancedArithmetic {
    int divisor_sum(int n);
}
class MyCalculator implements AdvancedArithmetic{
    @Override
    public int divisor_sum(int n) {
        // TODO Auto-generated method stub
        int sum=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                sum+=i;
            }
        }
        return sum;
    }
}