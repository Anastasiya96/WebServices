package ifmo.webservices.errors;

import javax.xml.ws.WebFault;

@WebFault(faultBean = "ifmo.webservices.errors.BookServiceFault")
public class UnauthorizedException extends Exception {
    public static UnauthorizedException DEFAULT_INSTANCE = new
            UnauthorizedException("Authorization required");

    public UnauthorizedException(String message) {
        super(message);
    }
}