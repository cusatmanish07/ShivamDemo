import java.util.TreeSet;

public class ExampleTreeSet {

    public void exampleTreeSet(){

        boolean retType;

        TreeSet<String> fruit = new TreeSet<>();
        TreeSet<String> veg = new TreeSet<>();
        TreeSet<String> nonveg = new TreeSet<>();


        nonveg.add("Chicken");
        nonveg.add("Butter");
        retType = nonveg.add("Paneer");

        if (retType) {
            System.out.println("Does not contains Paneer ");
        } else {
            System.out.println("contains Duplicate");
        }

        retType = nonveg.add("Paneer");

        if (retType) {
            System.out.println("Does not contains ");
        } else {
            System.out.println("contains Duplicate Paneer");
        }

        veg.add("aaa");
        veg.add("bbb");
        veg.add("ccc");
        fruit.add("Manish");
        fruit.add("Krishna");
        fruit.add("Manish");

        fruit.add("Nikku");
        fruit.add("Papa");
        fruit.add("papa");
        fruit.add("ManishK");
        fruit.addAll(veg);
        fruit.addAll(nonveg);

        System.out.println(fruit);
    }
}
