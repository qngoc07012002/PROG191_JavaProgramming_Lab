package Ex6;

public class Main {
    public static void main(String[] args) {
        try {
            SomeException someException = new SomeException();
        } catch (Exception e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}
