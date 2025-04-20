import src.StringManupulation;

import java.util.LinkedList;
import java.util.Scanner;
public class Main {
    public static void main(String [] args) {
        System.out.println("Hi");


//        int[][][] rb = new int[3][3][3];
//        int[][][] mt1 =
//                {
//                        {
//                            {1,3,4},
//                            {1,2,6},
//                            {1,2,6}
//                        },
//                        {
//                                {1,2,6},
//                                {1,2,6},
//                                {1,2,6},
//                        },
//                        {
//                                {1,2,6},
//                                {1,2,6},
//                                {1,2,6},
//                        }
//                };
//        int[][][] mt2 =
//                {
//                        {
//                                {1,2,6},
//                                {1,2,6},
//                                {1,2,6}
//                        },
//                        {
//                                {1,2,6},
//                                {1,2,6},
//                                {1,2,6},
//                        },
//                        {
//                                {1,2,6},
//                                {1,2,6},
//                                {1,2,6},
//                        }
//                };
//        //int[][][] mt3 = {{{1,2,3},{3,4,6},{8,9,10}}};
//        int[][][] mt4 = new int[3][3][3];

//        String t_model = "M10";
//        String t_year = "2024";
//        String t_color = "White";
//
//        Car c1 = new Car(t_model);
//        Car c2 = new Car(t_model, t_year);
//        Car c3 = new Car(t_model, t_year, t_color);

//        Toyota t1 = new Toyota();
//        t1.GetDetails();
//
//        Maruti m1 = new Maruti();
//
//        m1.GetDetails();
//
//        System.out.println(m1.getBrand());
//        System.out.println(m1.getEngineType());
//        m1.start();
//        m1.stop();
//
//        Honda h1 = new Honda();
//        h1.calPower(10, 5);
//
//        Bmw b1 = new Bmw();
//        b1.calPower(10, 20);

//        Bike b2 = new Bike();
//        System.out.println(b2.getBrand());
//        System.out.println(b2.getEngineType());
//        b2.start();
//        b2.stop();
//
//        Cow c11 = new Cow();
//        c11.eat();
//        c11.sleep();
//        System.out.println(c11.getLegs());
//        System.out.println(c11.getEyes());
//
//        ArrayExample ar = new ArrayExample();
//        ar.displayClass();
//        ar.displayName();
//        ar.sortArray();

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the Name");
//        String name = sc.nextLine();
//
//        System.out.println("Enter the age");
//        int age = sc.nextInt();

//        System.out.println("Hi " + name + " Your age is: " + age);


//        for (int i=0; i<3; i++){
//
//            for (int j=0; j<3; j++) {
//                for (int k=0; k<3; k++) {
//                    mt4[i][j][k] = mt1[i][j][k] + mt2[i][j][k];
//                    System.out.print(mt4[i][j][k]);
//                }
//            }
//
//        }
//        System.out.println();
//
//        for (int i=0; i<3; i++){
//
//            for (int j=0; j<3; j++) {
//                for (int k=0; k<3; k++) {
//                    System.out.println(mt4[i][j][k]);
//                }
//            }
//
//        }


        // Swapping Method call

//        Swapping sw = new Swapping();
//        sw.swap();

//        String[] e_name = { "Mansh", "Nikku", "Rishu", "Vishal", "Mummy" };
//        ExampleLinkedList el = new ExampleLinkedList();
//        el.setEmpName(e_name);
//        el.displayEmpNameList();
//        el.setRoll();


//        SetExample s = new SetExample();
//        s.addSet();
//
//        ExampleLinkedHasSet elhs = new ExampleLinkedHasSet();
//        elhs.linkedHasSetExample();
//
//        ExampleTreeSet ets = new ExampleTreeSet();
//
//        ets.exampleTreeSet();

//        AddToCart ac = new AddToCart();
//        ac.addItem("Paneer");
//        ac.addItem("Chhola");
//        ac.addItem("Samosa");
//        ac.addItem("Paneer");
//
//        ac.updateQuantity("Paneer", 9);
//        ac.removeItem("Chhola");

        StringManupulations sm = new StringManupulations();

        sm.mymethod();
    }

}



