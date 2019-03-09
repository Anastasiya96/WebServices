package ifmo.webservices;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(name = "BookWebService", serviceName = "BookService")
public class BookWebServiceImpl implements BookWebService {

    @WebMethod(operationName = "getAllBooks")
    public List<Book> getAllBooks() {
        OracleSQLDAO dao = new OracleSQLDAO();
        List<Book> books = dao.getAllBooks();
        return books;
    }

    @WebMethod(operationName = "getBooks")
    public List<Book> getBooks(@WebParam(name = "conditions") List<BookFieldValue> conditions) {
        OracleSQLDAO dao = new OracleSQLDAO();
        return dao.getBooksByFields(conditions);
    }
}