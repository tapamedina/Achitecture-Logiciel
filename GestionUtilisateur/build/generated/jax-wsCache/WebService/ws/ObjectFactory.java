
package ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ModifierUtilisateur_QNAME = new QName("http://ws/", "modifierUtilisateur");
    private final static QName _AjouterUtilisateurResponse_QNAME = new QName("http://ws/", "ajouterUtilisateurResponse");
    private final static QName _ListerUtilisateur_QNAME = new QName("http://ws/", "listerUtilisateur");
    private final static QName _LoginResponse_QNAME = new QName("http://ws/", "loginResponse");
    private final static QName _ListerUtilisateurs_QNAME = new QName("http://ws/", "listerUtilisateurs");
    private final static QName _SupprimerUtilisateur_QNAME = new QName("http://ws/", "supprimerUtilisateur");
    private final static QName _ModifierUtilisateurResponse_QNAME = new QName("http://ws/", "modifierUtilisateurResponse");
    private final static QName _SupprimerUtilisateurResponse_QNAME = new QName("http://ws/", "supprimerUtilisateurResponse");
    private final static QName _Login_QNAME = new QName("http://ws/", "login");
    private final static QName _ModifierToken_QNAME = new QName("http://ws/", "modifierToken");
    private final static QName _ListerUtilisateurResponse_QNAME = new QName("http://ws/", "listerUtilisateurResponse");
    private final static QName _ModifierTokenResponse_QNAME = new QName("http://ws/", "modifierTokenResponse");
    private final static QName _ListerUtilisateursResponse_QNAME = new QName("http://ws/", "listerUtilisateursResponse");
    private final static QName _AjouterUtilisateur_QNAME = new QName("http://ws/", "ajouterUtilisateur");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ModifierUtilisateur }
     * 
     */
    public ModifierUtilisateur createModifierUtilisateur() {
        return new ModifierUtilisateur();
    }

    /**
     * Create an instance of {@link AjouterUtilisateurResponse }
     * 
     */
    public AjouterUtilisateurResponse createAjouterUtilisateurResponse() {
        return new AjouterUtilisateurResponse();
    }

    /**
     * Create an instance of {@link ListerUtilisateur }
     * 
     */
    public ListerUtilisateur createListerUtilisateur() {
        return new ListerUtilisateur();
    }

    /**
     * Create an instance of {@link LoginResponse }
     * 
     */
    public LoginResponse createLoginResponse() {
        return new LoginResponse();
    }

    /**
     * Create an instance of {@link ListerUtilisateurs }
     * 
     */
    public ListerUtilisateurs createListerUtilisateurs() {
        return new ListerUtilisateurs();
    }

    /**
     * Create an instance of {@link SupprimerUtilisateur }
     * 
     */
    public SupprimerUtilisateur createSupprimerUtilisateur() {
        return new SupprimerUtilisateur();
    }

    /**
     * Create an instance of {@link ModifierUtilisateurResponse }
     * 
     */
    public ModifierUtilisateurResponse createModifierUtilisateurResponse() {
        return new ModifierUtilisateurResponse();
    }

    /**
     * Create an instance of {@link SupprimerUtilisateurResponse }
     * 
     */
    public SupprimerUtilisateurResponse createSupprimerUtilisateurResponse() {
        return new SupprimerUtilisateurResponse();
    }

    /**
     * Create an instance of {@link Login }
     * 
     */
    public Login createLogin() {
        return new Login();
    }

    /**
     * Create an instance of {@link ModifierToken }
     * 
     */
    public ModifierToken createModifierToken() {
        return new ModifierToken();
    }

    /**
     * Create an instance of {@link ListerUtilisateurResponse }
     * 
     */
    public ListerUtilisateurResponse createListerUtilisateurResponse() {
        return new ListerUtilisateurResponse();
    }

    /**
     * Create an instance of {@link ModifierTokenResponse }
     * 
     */
    public ModifierTokenResponse createModifierTokenResponse() {
        return new ModifierTokenResponse();
    }

    /**
     * Create an instance of {@link ListerUtilisateursResponse }
     * 
     */
    public ListerUtilisateursResponse createListerUtilisateursResponse() {
        return new ListerUtilisateursResponse();
    }

    /**
     * Create an instance of {@link AjouterUtilisateur }
     * 
     */
    public AjouterUtilisateur createAjouterUtilisateur() {
        return new AjouterUtilisateur();
    }

    /**
     * Create an instance of {@link Utilisateur }
     * 
     */
    public Utilisateur createUtilisateur() {
        return new Utilisateur();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifierUtilisateur }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "modifierUtilisateur")
    public JAXBElement<ModifierUtilisateur> createModifierUtilisateur(ModifierUtilisateur value) {
        return new JAXBElement<ModifierUtilisateur>(_ModifierUtilisateur_QNAME, ModifierUtilisateur.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AjouterUtilisateurResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "ajouterUtilisateurResponse")
    public JAXBElement<AjouterUtilisateurResponse> createAjouterUtilisateurResponse(AjouterUtilisateurResponse value) {
        return new JAXBElement<AjouterUtilisateurResponse>(_AjouterUtilisateurResponse_QNAME, AjouterUtilisateurResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListerUtilisateur }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "listerUtilisateur")
    public JAXBElement<ListerUtilisateur> createListerUtilisateur(ListerUtilisateur value) {
        return new JAXBElement<ListerUtilisateur>(_ListerUtilisateur_QNAME, ListerUtilisateur.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "loginResponse")
    public JAXBElement<LoginResponse> createLoginResponse(LoginResponse value) {
        return new JAXBElement<LoginResponse>(_LoginResponse_QNAME, LoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListerUtilisateurs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "listerUtilisateurs")
    public JAXBElement<ListerUtilisateurs> createListerUtilisateurs(ListerUtilisateurs value) {
        return new JAXBElement<ListerUtilisateurs>(_ListerUtilisateurs_QNAME, ListerUtilisateurs.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SupprimerUtilisateur }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "supprimerUtilisateur")
    public JAXBElement<SupprimerUtilisateur> createSupprimerUtilisateur(SupprimerUtilisateur value) {
        return new JAXBElement<SupprimerUtilisateur>(_SupprimerUtilisateur_QNAME, SupprimerUtilisateur.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifierUtilisateurResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "modifierUtilisateurResponse")
    public JAXBElement<ModifierUtilisateurResponse> createModifierUtilisateurResponse(ModifierUtilisateurResponse value) {
        return new JAXBElement<ModifierUtilisateurResponse>(_ModifierUtilisateurResponse_QNAME, ModifierUtilisateurResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SupprimerUtilisateurResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "supprimerUtilisateurResponse")
    public JAXBElement<SupprimerUtilisateurResponse> createSupprimerUtilisateurResponse(SupprimerUtilisateurResponse value) {
        return new JAXBElement<SupprimerUtilisateurResponse>(_SupprimerUtilisateurResponse_QNAME, SupprimerUtilisateurResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Login }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "login")
    public JAXBElement<Login> createLogin(Login value) {
        return new JAXBElement<Login>(_Login_QNAME, Login.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifierToken }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "modifierToken")
    public JAXBElement<ModifierToken> createModifierToken(ModifierToken value) {
        return new JAXBElement<ModifierToken>(_ModifierToken_QNAME, ModifierToken.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListerUtilisateurResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "listerUtilisateurResponse")
    public JAXBElement<ListerUtilisateurResponse> createListerUtilisateurResponse(ListerUtilisateurResponse value) {
        return new JAXBElement<ListerUtilisateurResponse>(_ListerUtilisateurResponse_QNAME, ListerUtilisateurResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifierTokenResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "modifierTokenResponse")
    public JAXBElement<ModifierTokenResponse> createModifierTokenResponse(ModifierTokenResponse value) {
        return new JAXBElement<ModifierTokenResponse>(_ModifierTokenResponse_QNAME, ModifierTokenResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListerUtilisateursResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "listerUtilisateursResponse")
    public JAXBElement<ListerUtilisateursResponse> createListerUtilisateursResponse(ListerUtilisateursResponse value) {
        return new JAXBElement<ListerUtilisateursResponse>(_ListerUtilisateursResponse_QNAME, ListerUtilisateursResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AjouterUtilisateur }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "ajouterUtilisateur")
    public JAXBElement<AjouterUtilisateur> createAjouterUtilisateur(AjouterUtilisateur value) {
        return new JAXBElement<AjouterUtilisateur>(_AjouterUtilisateur_QNAME, AjouterUtilisateur.class, null, value);
    }

}
