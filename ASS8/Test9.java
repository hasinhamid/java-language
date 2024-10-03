public class Test9{
    public static void main(String [] args){
        Tracing t1= new Tracing(2, 3);
        t1.methodA(1);
        Tracing t2= new Tracing(3, 4);
        t2.methodA(2);
        t1.methodB(t2);
        t2.methodB(t2);
    }
}


class Tracing {
    public static int x= 0, y = 0;
    public int a, b;
    public Tracing(int a, int b){
        this.a = a;
        this.b = b;
        x+=1;
        y+=2;
    }
    public void methodA(int a){
        this.a = x+a;
        this.b = this.b+ this.a +this.methodB();
        System.out.println(this.a+" "+this.b+" "+x);
    }
    public int methodB(){
        this.b = y - this.b + this.a;
        System.out.println(this.a+" "+this.b+" "+x);
        x += this.b;
        return this.b;
    }
    public void methodB(Tracing t1){
        t1.b = this.y - t1.b + this.b;
        System.out.println(t1.a+" "+t1.b+" "+x);
    }

}


