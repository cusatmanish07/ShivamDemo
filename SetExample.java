import java.util.HashSet;

public class SetExample {
    public void addSet(){
        HashSet<String> hs = new HashSet<>();
        hs.add("Banana");
        hs.add("Manish");
        hs.add("Nikku");
        hs.add("Apple");
        hs.add("Manish");
        hs.add("123678");

        System.out.println(hs);
        System.out.println(hs.size());

    }


}
