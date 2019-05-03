package ifmo.webservices.errors;

import javax.xml.ws.WebFault;

@WebFault(faultBean = "ifmo.webservices.errors.BookServiceFault")
public class ForbiddenException extends Exception {
    public static ForbiddenException DEFAULT_INSTANCE = new
            ForbiddenException("Wrong login/password");

    public ForbiddenException(String message) {
        super(message);
    }
}