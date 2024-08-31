import java.util.*;
public class abs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str= sc.nextLine();
        MyBook mb= new MyBook();
        mb.setTitle(str);
        System.out.println("The title is: "+mb.getTitle());

    }
}
abstract class Book{
    String title;
    abstract void setTitle(String s);
    String getTitle(){
        return title;
    }
}
class MyBook extends Book{
    @Override
    void setTitle(String str){
        this.title=str;
    }
    
}
