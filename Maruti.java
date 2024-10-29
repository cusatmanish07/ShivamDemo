public class Maruti {
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



}
