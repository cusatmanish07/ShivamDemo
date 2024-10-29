public class Main {
    public static void main(String [] args) {
        System.out.println("Hi");

//        String t_model = "M10";
//        String t_year = "2024";
//        String t_color = "White";
//
//        Car c1 = new Car(t_model);
//        Car c2 = new Car(t_model, t_year);
//        Car c3 = new Car(t_model, t_year, t_color);

        Toyota t1 = new Toyota();
        t1.GetDetails();

        Maruti m1 = new Maruti();
        m1.GetDetails();

        Honda h1 = new Honda();
        h1.calPower(10, 5);

        Bmw b1 = new Bmw();
        b1.calPower(10, 20);
    }
}
