package ifmo.webservices.errors;

import javax.xml.ws.WebFault;

@WebFault(faultBean = "ifmo.webservices.errors.BookServiceFault")
public class IllegalAuthorException extends Exception {
    public static IllegalAuthorException DEFAULT_INSTANCE = new
            IllegalAuthorException("Book author cannot be null or empty");

    public IllegalAuthorException(String message) {
        super(message);
    }
}