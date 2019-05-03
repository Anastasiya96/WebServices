package ifmo.webservices.errors;

public class ForbiddenException extends Exception {
    public static ForbiddenException DEFAULT_INSTANCE = new
            ForbiddenException("Wrong login/password");

    public ForbiddenException(String message) {
        super(message);
    }
}