public class Maruti extends Vehicle {
    String t_model = "Maruti-10";
    String t_year = "1990";
    String t_color = "OffWhite";

    Car c1 = new Car(t_model);
    Car c2 = new Car(t_model, t_year);
    Car c3 = new Car(t_model, t_year, t_color);



    public void GetDetails() {
        System.out.println(c1.showInfo());

        System.out.println(c2.showInfo());

        System.out.println(c3.showInfo());
    }


    String engineType;
    String brandName;
    @Override
    public void start() {
        System.out.println("Staring the Maruiti Car");
    }

    @Override
    public String getEngineType() {
        engineType = "MP10";
        return engineType;
    }

    @Override
    public String getBrand() {
        brandName = "Maruti Suzuki";
        return brandName;
    }

    @Override
    public void stop() {
        System.out.println("Stopping Maruti Car");
    }



}
