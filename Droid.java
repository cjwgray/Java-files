public class Droid {
    int batteryLevel;
    String name;
   
    public Droid(String droidName){
      name = droidName;
      batteryLevel = 100;
    }
     public void performTask(String task){
       batteryLevel = batteryLevel -10;
      System.out.println(name + " is performing task: " + task);
    }
  
    public String toString() {
      return "Hello, I'm the droid: " + name;
    }
    
    public static void main(String[] args) {
      Droid Codey = new Droid("Codey");
      System.out.println(Codey);
      Codey.performTask("dancing");
  }
}
