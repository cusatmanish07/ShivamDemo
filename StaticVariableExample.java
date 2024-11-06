public class StaticVariableExample {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        c1.displayCount(); // Output: Current count: 3

        Counter c3 = new Counter();
        c3.displayCount();

    }
}