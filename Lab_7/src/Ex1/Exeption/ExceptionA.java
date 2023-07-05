package Ex1.Exeption;

import java.io.IOException;

public class ExceptionA extends Exception {
    public ExceptionA(String message) {
        super(message);
    }
    @Override
    public String getMessage() {
        return "Exception A";
    }
}
