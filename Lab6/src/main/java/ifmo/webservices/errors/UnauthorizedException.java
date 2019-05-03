package ifmo.webservices.errors;

public class UnauthorizedException extends Exception {
    public static UnauthorizedException DEFAULT_INSTANCE = new
            UnauthorizedException("Authorization required");

    public UnauthorizedException(String message) {
        super(message);
    }
}