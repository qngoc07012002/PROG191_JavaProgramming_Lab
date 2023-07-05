package Ex8;

public class Main {
    public static void main(String[] args) {
        try {
            methodA();
        } catch (Exception e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }

    public static void methodA() throws Exception {
        try {
            int result = 1 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Caught arithmetic exception in methodA: " + e.getMessage());
            throw new Exception("Exception thrown from methodA", e);
        }
    }
}
