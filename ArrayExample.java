import java.util.Arrays;

public class ArrayExample {

    public String[] name = {"Manish", "Nikku", "Vishal"};
    public int[] rollNumber = {6,2,3};
    public String[] Class = {"Isc", "Bsc", "Msc"};

    public void displayName(){
        for(String n: name){
            System.out.println(n);
        }
    }

    public void displayRollNumber() {
        for(int r: rollNumber) {
            System.out.println(r);
        }
    }

    public void displayClass() {
        for(String c: Class) {
            System.out.println(c);
        }
    }

    public void sortArray() {
        Arrays.sort(rollNumber);

       for(int r: rollNumber) {
           System.out.println(r);

           if(r == 6) {
               System.out.println("Found the culprit");
           } else {
               System.out.println("We are good");
           }
       }

      System.out.println(Arrays.asList(name));

    }
}
