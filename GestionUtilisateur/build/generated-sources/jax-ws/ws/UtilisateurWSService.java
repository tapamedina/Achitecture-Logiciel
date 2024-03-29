
package ws;

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
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "UtilisateurWSService", targetNamespace = "http://ws/", wsdlLocation = "http://localhost:8081/WebService?wsdl")
public class UtilisateurWSService
    extends Service
{

    private final static URL UTILISATEURWSSERVICE_WSDL_LOCATION;
    private final static WebServiceException UTILISATEURWSSERVICE_EXCEPTION;
    private final static QName UTILISATEURWSSERVICE_QNAME = new QName("http://ws/", "UtilisateurWSService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8081/WebService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        UTILISATEURWSSERVICE_WSDL_LOCATION = url;
        UTILISATEURWSSERVICE_EXCEPTION = e;
    }

    public UtilisateurWSService() {
        super(__getWsdlLocation(), UTILISATEURWSSERVICE_QNAME);
    }

    public UtilisateurWSService(WebServiceFeature... features) {
        super(__getWsdlLocation(), UTILISATEURWSSERVICE_QNAME, features);
    }

    public UtilisateurWSService(URL wsdlLocation) {
        super(wsdlLocation, UTILISATEURWSSERVICE_QNAME);
    }

    public UtilisateurWSService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, UTILISATEURWSSERVICE_QNAME, features);
    }

    public UtilisateurWSService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public UtilisateurWSService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns UtilisateurWS
     */
    @WebEndpoint(name = "UtilisateurWSPort")
    public UtilisateurWS getUtilisateurWSPort() {
        return super.getPort(new QName("http://ws/", "UtilisateurWSPort"), UtilisateurWS.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns UtilisateurWS
     */
    @WebEndpoint(name = "UtilisateurWSPort")
    public UtilisateurWS getUtilisateurWSPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws/", "UtilisateurWSPort"), UtilisateurWS.class, features);
    }

    private static URL __getWsdlLocation() {
        if (UTILISATEURWSSERVICE_EXCEPTION!= null) {
            throw UTILISATEURWSSERVICE_EXCEPTION;
        }
        return UTILISATEURWSSERVICE_WSDL_LOCATION;
    }

}
