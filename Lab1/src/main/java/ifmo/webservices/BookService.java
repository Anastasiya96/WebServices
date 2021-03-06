
package ifmo.webservices;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.1-SNAPSHOT
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "BookService", targetNamespace = "http://webservices.ifmo/", wsdlLocation = "http://localhost:8081/BookService?wsdl")
public class BookService
    extends Service
{

    private final static URL BOOKSERVICE_WSDL_LOCATION;
    private final static WebServiceException BOOKSERVICE_EXCEPTION;
    private final static QName BOOKSERVICE_QNAME = new QName("http://webservices.ifmo/", "BookService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8081/BookService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        BOOKSERVICE_WSDL_LOCATION = url;
        BOOKSERVICE_EXCEPTION = e;
    }

    public BookService() {
        super(__getWsdlLocation(), BOOKSERVICE_QNAME);
    }

    public BookService(WebServiceFeature... features) {
        super(__getWsdlLocation(), BOOKSERVICE_QNAME, features);
    }

    public BookService(URL wsdlLocation) {
        super(wsdlLocation, BOOKSERVICE_QNAME);
    }

    public BookService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, BOOKSERVICE_QNAME, features);
    }

    public BookService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public BookService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns BookWebService
     */
    @WebEndpoint(name = "BookWebServicePort")
    public BookWebService getBookWebServicePort() {
        return super.getPort(new QName("http://webservices.ifmo/", "BookWebServicePort"), BookWebService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns BookWebService
     */
    @WebEndpoint(name = "BookWebServicePort")
    public BookWebService getBookWebServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://webservices.ifmo/", "BookWebServicePort"), BookWebService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (BOOKSERVICE_EXCEPTION!= null) {
            throw BOOKSERVICE_EXCEPTION;
        }
        return BOOKSERVICE_WSDL_LOCATION;
    }

}
