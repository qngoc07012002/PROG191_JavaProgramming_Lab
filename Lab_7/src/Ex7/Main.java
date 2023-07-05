package Ex7;

public class Main {
    public static void main(String[] args) {
        try {
            someMethod();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void someMethod() throws Exception {
        try {
            someMethod2();
        } catch (Exception e) {
            System.out.println("Caught exception in someMethod");
            throw e; // rethrow the exception
        }
    }

    public static void someMethod2() throws Exception {
        throw new Exception("Exception thrown from someMethod2");
    }
}
