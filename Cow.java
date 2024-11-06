public class Cow implements Animal {
   public int legCount;
   public int EYE_COUNT = 2;
    @Override
    public void eat() {
        System.out.println("Cow is Eating");
    }

    @Override
    public void sleep() {
        System.out.println("Cow is Sleeping for 2 hours");
    }

    @Override
    public int getLegs() {
        return legCount = 4;
    }

    public int getEyes(){
        return EYE_COUNT;
    };

}
