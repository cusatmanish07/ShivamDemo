class Counter {
     int count = 0; // Static variable

    Counter() {
        count++; // Increment count each time an object is created
    }

    public void displayCount() {
        System.out.println("Current count: " + count);
    }
}


