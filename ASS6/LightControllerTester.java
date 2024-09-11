public class LightControllerTester{
    public static void main(String args []){
      LightController c1 = new LightController();
      c1.showLightStatus();
      System.out.println("1---------------");
      c1.adjustBrightness(4);
      c1.switchLight();
      System.out.println("2---------------");
      c1.showLightStatus();
      System.out.println("3---------------");
      c1.adjustBrightness(4);
      System.out.println("4---------------");
      c1.showLightStatus();
      System.out.println("5---------------");
      c1.adjustBrightness(-2);
      c1.adjustBrightness(9);
      System.out.println("6---------------");
      c1.showLightStatus();
      System.out.println("7---------------");
      System.out.println(c1.resetSettings());
      c1.showLightStatus();
      System.out.println("8---------------");
      c1.switchLight();
      System.out.println("9---------------");
      c1.showLightStatus();
    }
  }
  class LightController{
    String status="OFF";
    int level=0;
    public void showLightStatus(){
      System.out.println("Light status: "+status);
      System.out.println("Brightness Level: "+level);
    }
    public void switchLight(){
      if(status.equals("OFF")){
        status="ON";
        level=1;
        System.out.println("Lights are now ON.");
      }
      else{
        status="OFF";
        level=0;
        System.out.println("Lights are now OFF.");
      }
    }
    public void adjustBrightness(int a){
      int b= level+a;
      if(status.equals("OFF")){
        System.out.println("Please turn on the light first!");
      }
      else if(b>10 || b<0){
        System.out.println("Brightness out of range. Set between 0 to 10.");
      }
      else {
        level=b;
        System.out.println("Brightness adjusted.");
      }
    }
    public String resetSettings(){
      level=1;
      return "Light settings have been reset.";
    }
    
  }
  