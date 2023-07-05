package Ex1.Exeption;

public class ExceptionC extends ExceptionB {

    public ExceptionC(String message) {
        super(message);
    }
    @Override
    public String getMessage() {
        return "Exception C";
    }
}
