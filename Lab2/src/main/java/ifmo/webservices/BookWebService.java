
package ifmo.webservices;

import ifmo.webservices.client.ObjectFactory;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "BookWebService", targetNamespace = "http://webservices.ifmo/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface BookWebService {


    /**
     * 
     * @param id
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "deleteBook", targetNamespace = "http://webservices.ifmo/", className = "ifmo.webservices.DeleteBook")
    @ResponseWrapper(localName = "deleteBookResponse", targetNamespace = "http://webservices.ifmo/", className = "ifmo.webservices.DeleteBookResponse")
    public boolean deleteBook(
        @WebParam(name = "id", targetNamespace = "")
        int id);

    /**
     * 
     * @return
     *     returns java.util.List<ifmo.webservices.Book>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAllBooks", targetNamespace = "http://webservices.ifmo/", className = "ifmo.webservices.GetAllBooks")
    @ResponseWrapper(localName = "getAllBooksResponse", targetNamespace = "http://webservices.ifmo/", className = "ifmo.webservices.GetAllBooksResponse")
    public List<Book> getAllBooks();

    /**
     * 
     * @param conditions
     * @return
     *     returns java.util.List<ifmo.webservices.Book>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getBooks", targetNamespace = "http://webservices.ifmo/", className = "ifmo.webservices.GetBooks")
    @ResponseWrapper(localName = "getBooksResponse", targetNamespace = "http://webservices.ifmo/", className = "ifmo.webservices.GetBooksResponse")
    public List<Book> getBooks(
        @WebParam(name = "conditions", targetNamespace = "")
        List<BookFieldValue> conditions);

    /**
     * 
     * @param book
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "addBook", targetNamespace = "http://webservices.ifmo/", className = "ifmo.webservices.AddBook")
    @ResponseWrapper(localName = "addBookResponse", targetNamespace = "http://webservices.ifmo/", className = "ifmo.webservices.AddBookResponse")
    public int addBook(
        @WebParam(name = "book", targetNamespace = "")
        Book book);

    /**
     * 
     * @param id
     * @param newValues
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "modifyBook", targetNamespace = "http://webservices.ifmo/", className = "ifmo.webservices.ModifyBook")
    @ResponseWrapper(localName = "modifyBookResponse", targetNamespace = "http://webservices.ifmo/", className = "ifmo.webservices.ModifyBookResponse")
    public boolean modifyBook(
        @WebParam(name = "id", targetNamespace = "")
        int id,
        @WebParam(name = "newValues", targetNamespace = "")
        List<BookFieldValue> newValues);

    /**
     * 
     * @param image
     * @param id
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "loadImage", targetNamespace = "http://webservices.ifmo/", className = "ifmo.webservices.LoadImage")
    @ResponseWrapper(localName = "loadImageResponse", targetNamespace = "http://webservices.ifmo/", className = "ifmo.webservices.LoadImageResponse")
    public boolean loadImage(
        @WebParam(name = "id", targetNamespace = "")
        int id,
        @WebParam(name = "image", targetNamespace = "")
        byte[] image);

}
