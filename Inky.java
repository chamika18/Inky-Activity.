public class Inky {
    String pinky; // Instance variable
    String rinky; // Instance variable

    // Constructor
    public Inky() {
        // Create a local variable called pinky with value donky
        String pinky = "donky";

        // Print variable pinky inside the constructor
        System.out.println("Value of pinky inside the constructor: " + pinky);

        // Create another variable inside the main method as blinky, its value is pinky
        String blinky = pinky;

        // Create another variable called rinky, its value is monky
        String rinky = "monky";

        // Pass all three variables to another constructor by creating an object called ponky2
        Inky ponky2 = new Inky(blinky, rinky);

        // Statements
        System.out.println("01.). Pinkey " + ponky2.pinky + ".");
        System.out.println("02.). Donkey " + ponky2.rinky + ".");
        System.out.println("03.). Pinky donky monky.");
    }

    // Another constructor
    public Inky(String pinky, String rinky) {
        this.pinky = pinky;
        this.rinky = rinky;
    }

    public static void main(String[] args) {
        // Create an object of the Inky class to invoke the constructor
        Inky inkyObj = new Inky();
    }
}
