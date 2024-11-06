public class Bike extends Vehicle {
    String engineType;
    String brandName;
    @Override
    public void start() {
        System.out.println("Staring the Bike");
    }

    @Override
    public String getEngineType() {
        engineType = "P12";
        return engineType;
    }

    @Override
    public String getBrand() {
        brandName = "Royal Enfield";
        return brandName;
    }

    @Override
    public void stop() {
        System.out.println("Stopping Bike");
    }
}
