package Ex4;

import Ex4.Exception.Exception1;
import Ex4.Exception.Exception2;
import Ex4.Exception.Exception3;

public class Main {
    public static void main(String[] args) {
        try {
            throwAllExceptions();
        } catch (Exception1 e) {
            System.out.println(e.getMessage());
        }
    }

    public static void throwAllExceptions() throws Exception1 {
        throw new Exception1("User already used");
    }

}

