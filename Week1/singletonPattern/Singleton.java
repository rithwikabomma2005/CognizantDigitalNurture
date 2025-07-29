package singleton;

public class Singleton {

    // Step 1: Create a private static variable to hold the single instance
    private static Singleton instance;

    // Step 2: Make the constructor private to prevent instantiation
    private Singleton() {
        System.out.println("Singleton instance created");
    }

    // Step 3: Provide a public static method to get the instance
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton(); // Lazy initialization
        }
        return instance;
    }

    // Sample method
    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }
}
