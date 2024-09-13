public class MobilePhoneTester {
    public static void main(String[] args) {
        MobilePhone m1 = new MobilePhone();
        MobilePhone m2 = new MobilePhone();
        m1.setContactCapacity(5);
        m2.setContactCapacity(100);
        m1.details();
        System.out.println("1----------------");
        m1.addContact("John", 9866);
        m1.addContact("Maria", 7865);
        System.out.println("2----------------");
        m1.makeCall(9866);
        System.out.println("3----------------");
        m1.addContact("Henry", 2365);
        System.out.println("4----------------");
        m1.makeCall(7552);
        m1.makeCall(2365);
        System.out.println("5----------------");
        m1.addContact("Gomes", 4589);
        m1.addContact("Antony", 8421);
        m1.addContact("Tony", 5789);
        System.out.println("6----------------");
        m1.details();
    
    }
}
class MobilePhone{
    public int capacity=0;
    public int count =0;
    public int[] num={};
    public String [] name={};
    public void setContactCapacity(int a){
        capacity=a;
        num=new int[a];
        name=new String[a];
    }
    public void details(){
        System.out.println("Total Contacts: "+count);
        System.out.println("Contact List:");
        for(int i=0;i<count;i++){
            System.out.println(name[i]+" : "+num[i]);
        }
    }
    public void addContact(String str, int n){
        if(capacity>count){
            num[count]=n;
            name[count]=str;
            System.out.println("The contact of "+str+" is added.");
            count++;
            
        }
        else{
            System.out.println("Storage Full!!");
        }
        
    }
    public void makeCall(int a ){
        int idx=-1;
        for (int i=0;i<count;i++){
            if(a==num[i]){
                idx =i;
            }
        }
        if(idx>=0){
            System.out.println("Calling "+name[idx]+" . . .");
        }
        else{
            System.out.println("Calling "+a+" . . .");
        }
    }
}