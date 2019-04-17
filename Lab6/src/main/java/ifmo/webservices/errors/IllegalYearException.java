package ifmo.webservices.errors;

import javax.xml.ws.WebFault;

@WebFault(faultBean = "ifmo.webservices.errors.BookServiceFault")
public class IllegalYearException extends Exception {
    public static IllegalYearException DEFAULT_INSTANCE = new
            IllegalYearException("Book year cannot be null or negative");

    public IllegalYearException(String message) {
        super(message);
    }
}