package recursion;

public class factorial {
    public static void main(String[] args) {
        int a = fac(5);
        System.out.println(a);
    }
    public static int fac(int a){
        if(a<=0){
            return 1;
        }
        return a*fac(a-1);
    }
}
