public abstract class Vehicle {
   public abstract void start();
   public void stop() {
       System.out.println("Stopping the Vehicle");
   }
   public abstract String getBrand();
   public abstract String getEngineType();
}


