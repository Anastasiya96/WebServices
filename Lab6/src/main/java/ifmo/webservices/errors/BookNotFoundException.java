package ifmo.webservices.errors;

import javax.xml.ws.WebFault;

@WebFault(faultBean = "ifmo.webservices.errors.BookServiceFault")
public class BookNotFoundException extends Exception {
    public static BookNotFoundException DEFAULT_INSTANCE = new
            BookNotFoundException("Book with such id was not found");

    public BookNotFoundException(String message) {
        super(message);
    }
}