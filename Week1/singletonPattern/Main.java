package singleton;

public class Main {
    public static void main(String[] args) {
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        obj1.showMessage();

        // Check if both references are the same
        System.out.println(obj1 == obj2);  // Output: true
    }
}
