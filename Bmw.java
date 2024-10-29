public class Bmw extends Car {
    int power;
    @Override
    public void calPower(int a, int b) {
        power =  (a + b) * 50 ;
        System.out.println(power);
    }
}
