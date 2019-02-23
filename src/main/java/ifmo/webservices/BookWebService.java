package ifmo.webservices;

import ifmo.webservices.Book;
import ifmo.webservices.client.ObjectFactory;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.1-SNAPSHOT
 * Generated source version: 2.2
 * 
 */
@WebService(serviceName = "BookWebService", name = "BookWebService", targetNamespace = "http://webservices.ifmo/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface BookWebService {


    /**
     * 
     * @return
     *     returns java.util.List<ifmo.webservices.client.Book>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getBooks", targetNamespace = "http://webservices.ifmo/", className = "ifmo.webservices.client.GetBooks")
    @ResponseWrapper(localName = "getBooksResponse", targetNamespace = "http://webservices.ifmo/", className = "ifmo.webservices.client.GetBooksResponse")
    public List<Book> getBooks();

}
