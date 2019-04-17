package ifmo.webservices.errors;

import javax.xml.ws.WebFault;

@WebFault(faultBean = "ifmo.webservices.errors.BookServiceFault")
public class IllegalPagesException extends Exception {
    public static IllegalPagesException DEFAULT_INSTANCE = new
            IllegalPagesException("Book pages cannot be null or negative");

    public IllegalPagesException(String message) {
        super(message);
    }
}