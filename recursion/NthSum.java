package recursion;

public class NthSum {
    public static void main(String[] args) {
        int a = sum(5);
        System.out.println(a);
    }
    public static int sum(int a){
        if(a<=0){
            return 0;
        }
        return a+sum(a-1);
    }
}
