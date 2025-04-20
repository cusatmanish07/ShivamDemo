import java.io.File;

public class StringManupulations {
    String str1 = "papa";

    public void mymethod() {
        System.out.println(str1);

        str1.concat("Mummy");
        System.out.println(str1);
        str1 = str1.concat("Mummy");
        System.out.println(str1);
        String str2 = str1.concat("Mummy");

        System.out.println(str2);

        String x = new String("Papa");
        String y = new String("Papa");

        if (x == y) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        String z = "MummYfhfhfhfhhf";
        String w = "Mummy";

        if (z == w) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        System.out.println(z.compareTo(w));
        System.out.println(z.length());
        System.out.println(z.charAt(7));

        StringBuffer stb = new StringBuffer("Hello");
        stb.appendCodePoint(128512);
        System.out.println(stb.toString());
        System.out.println(stb.toString());


        File file = new File()


    }
}