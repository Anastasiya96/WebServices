package ifmo.webservices;

import java.util.List;
import javax.annotation.Resource;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.sql.DataSource;

@WebService(serviceName = "BookService")
public class BookJ2EEService {
    
    @Resource(lookup = "ifmo-oracle")
    private DataSource dataSource;
    
    @WebMethod(operationName = "getAllBooks")
    public List<Book> getAllBooks() {
        OracleSQLDAO dao = new OracleSQLDAO();
        return dao.getAllBooks();
    }
}
