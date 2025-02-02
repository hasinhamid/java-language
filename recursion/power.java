package recursion;

public class power {
    public static void main(String[] args) {
        int x=pow(4,4);
        System.out.println(x);
    }
    public static int pow(int x, int n){  // stack nlogn
        if(x!=0){
            if(n==0){
                return 1;
            }
            else if(n==1){
                return x;
            }
            else if(n%2==0){
                return pow(x, n/2)*pow(x, n/2);
            }
            else{
                return pow(x, n/2)*pow(x, n/2)*x;
            }
        }
        else{
            return 0;
        }
    }
}
