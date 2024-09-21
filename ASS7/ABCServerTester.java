public class ABCServerTester{
    public static void main (String args []){
      ABCServer server1 = new ABCServer();
      server1.details();
      System.out.println("---------------");
      ABCServer server2 = new ABCServer("Heroes Reborn",6);
      server2.details();
      System.out.println("---------------");
      server2.addMembers("Edward");
      server2.addMembers("William");
      System.out.println("----------------");
      server2.details();
      System.out.println("----------------");
      server2.addMembers("John", "Hero's Mentor");
      server2.addMembers("Albert", "Thunderstrike");
      server2.addMembers("Max", "Radiant Avenger");
      System.out.println("----------------");
      server2.details();
      System.out.println("----------------");
      server2.addMembers("Daniel");
      server2.addMembers("Donal", "Valor Knight");
      System.out.println("----------------");
      server2.details();
    }
   }
   
   class ABCServer{
    private String name="Default";
    private int cap=10;
    private int mem=0;
    private String[] NR=new String[10];
    public ABCServer(){
    }
    public ABCServer(String nm,int a){
      name =nm;
      cap=a;
      NR=new String[a];
    }
    public void details(){
      System.out.println("Server Name: "+name+"\nMember Capacity: "+cap+
      "\nTotal Members: "+mem+"\nMembers:");
      if(mem!=0){
        for(int i=0;i<mem;i++){
          System.out.println("Name:Role --> "+NR[i]);
        }
      }
    }
    public void addMembers(String str){
      if(mem<cap){
        System.out.println("Rising Hero is added");
        NR[mem++]=str+":Rising Hero";
      }
      else{
        System.out.println("Sorry, maximum capacity exceeded!");
      }
      
    }
    public void addMembers(String str, String role){
      if(mem<cap){
        System.out.println(role+" is added");
        NR[mem++]=str+":"+role;
      }
      else{
        System.out.println("Sorry, maximum capacity exceeded!");
      }
    }

   }