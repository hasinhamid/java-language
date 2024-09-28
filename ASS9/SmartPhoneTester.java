
public class SmartPhoneTester{
    public static void main(String[] args) {
      Smartphone s1 = new Smartphone();
      System.out.println("1===================");
      s1.addFeature("Display", "6.1 inch");
      System.out.println("2===================");
      s1.updateName("Samsung Note 20");
      s1.addFeature("Display", "6.1 inch");
      s1.printDetail();
      System.out.println("3===================");
      Smartphone s2 = new Smartphone("Iphone 12 Pro");
      s2.addFeature("Display", "6.2 inch");
      s2.addFeature("Ram", "6 GB");
      System.out.println("4===================");
      s2.printDetail();
      s2.addFeature("Display", "Amoled panel");
      s2.addFeature("Ram", "DDR5");
      System.out.println("5===================");
      s2.printDetail();
      System.out.println("6===================");
    }
  }
  class Smartphone{
    private String name;
    public Feature [] ftad= new Feature[10]; 
    int count =0;
    public Smartphone(){
    }
    public Smartphone(String str){
      name=str;
    }
    public void updateName(String str){
      name=str;
    }
    public void addFeature(String str, String a){
      if (name==null) {
        System.out.println("Feature can not be added without phone name");
      }
      else{
      int idx=-1;
      boolean bool=false;
      for(int i=0;i<count;i++){
        if(ftad[i].nm.equals(str)){
          idx=i;
          bool=true;
          break;
        }
      }
      if(bool){
        ftad[idx].af(a);
      }
      else{
        ftad[count++]=new Feature(str,a);
      }
      }
    }
    public void printDetail(){
      System.out.println("Phone Name: "+name);
      for(int i=0;i<count;i++){
        System.out.println(ftad[i].nm+": "+ftad[i].dt());
      }
      
    }

  }
  class Feature{
    public String nm; 
    private String[] ftr=new String[10];
    private int count =0;
    public Feature(String str, String a){
      nm=str;
      ftr[count++]=a;
    }
    public void af(String str){
      ftr[count++]=str;
    }
    public String dt(){
      String str="";
      for(int i=0;i<count;i++){
        if(i!=count-1){
          str+=ftr[i]+" ,";
        }
        else{
          str+=ftr[i];
        }
      }
      return str;
    }
  }

  