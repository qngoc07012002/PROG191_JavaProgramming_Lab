package Ex1.Exeption;

public class ExceptionB extends ExceptionA{
    public ExceptionB(String message) {
        super(message);
    }
    @Override
    public String getMessage() {
        return "Exception B";
    }
}
