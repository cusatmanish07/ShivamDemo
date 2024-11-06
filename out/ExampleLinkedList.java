
import javax.swing.text.html.HTMLDocument;
import java.util.*;


public class ExampleLinkedList {

    LinkedList<String> name = new LinkedList<>();
    LinkedList<Integer> roll = new LinkedList<Integer>();


//   LinkedList<String[]> name = new LinkedList<>();

//    public void name(String[] e_name) {
//        name.add(e_name);
//    }
//
//
//    public void display() {
//
//    Iterator<String[]> itr = name.iterator();
//        while(itr.hasNext()){
//        String[] arr = itr.next();
//            for(String ar : arr){
//                System.out.print(ar +" ");
//            }
//            System.out.println();
//        }
//    }


    public void setEmpName(String[] e_name) {
        //name.addAll(Arrays.asList(e_name));
        for(String s : e_name) {
           name.add(s);
        }

         System.out.println(" I have added all the item" + name);

    }


    public void displayEmpNameList() {
        Iterator<String> it_en = name.iterator();
        while (it_en.hasNext()) {
            System.out.println(it_en.next());
        }
        System.out.println(name);
    }

    public void setRoll() {
        roll.add(1);
        roll.add(3);
        roll.add(5);
        roll.add(6);
        roll.addFirst(0);
        roll.addLast(7);
        roll.remove(3);

        System.out.println(roll);
    }
}