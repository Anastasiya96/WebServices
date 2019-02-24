package ifmo.webservices;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(name = "BookWebService", serviceName = "BookService")
public class BookWebServiceImpl implements BookWebService {
    @WebMethod(operationName = "getBooks")
    public List<Book> getBooks() {
        OracleSQLDAO dao = new OracleSQLDAO();
        List<Book> books = dao.getAllBooks();
        return books;
    }

    @WebMethod(operationName = "getBookById")
    public List<Book> getBookById(@WebParam(name = "id") int id) {
        OracleSQLDAO dao = new OracleSQLDAO();

        BookCondition[] bookConditions = {
                new BookCondition(Field.id, id)
        };

        return dao.getBooksByFields(bookConditions);
    }
}