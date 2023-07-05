package Ex6;

public class SomeException {
    public SomeException() throws Exception {
        boolean createConstructor = false;
        if (!createConstructor) {
            throw new Exception("Constructor failed: unable to create SomeException object");
        }
    }
}
