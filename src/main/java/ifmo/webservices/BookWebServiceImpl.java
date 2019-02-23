package ifmo.webservices;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(name = "BookWebService", serviceName = "BookService")
public class BookWebServiceImpl {
    @WebMethod(operationName = "getBooks")
    public List<Book> getBooks() {
        OracleSQLDAO dao = new OracleSQLDAO();
        List<Book> books = dao.getBooks();
        return books;
    }
}