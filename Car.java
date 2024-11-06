public class Car {
    public String model;
    public String year;
    public String color;
    public String showInfo;

    public Car (String model, String year, String color) {
        this.color = color;
        this.year = year;
        this.model = model;
    }

    public Car (String model, String year) {
        this (model, year, "PINK");
    }

    public Car (String model) {
        this(model, "2024", "Yellow");
    }

    public Car(){};


    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public String getYear() {
        return year;
    }

    public String showInfo() {
        //System.out.println("Model is: " + model + " Color is: " + color + " Year is :" + year);
        return showInfo = "Model is :" + model + " Color is: " + color + " Year is :" + year;
    }

    public void  calPower(int a, int b) {
        int c;
        System.out.println (c = (a + b) * 10);
    }

}
