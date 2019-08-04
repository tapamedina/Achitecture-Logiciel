/**
 * 
 */
package domaine;

/**
 * @author tapam
 *
 */
public class Utilisateur {
	
	private int id;
	private String nom;
	private String prenom;
	private String email;
	private String username;
	private String password;
	private String role;
	private String token;
	/**
	 * 
	 */
	public Utilisateur() {}
	/**
	 * @param id
	 * @param nom
	 * @param prenom
	 * @param email
	 * @param username
	 * @param password
	 * @param role
	 * @param token
	 */
	public Utilisateur(int id, String nom, String prenom, String email, String username, String password, String role, String token) {
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.username = username;
		this.password = password;
		this.role = role;
		this.token = token;
	}
	/**
	 * @param nom
	 * @param prenom
	 * @param email
	 * @param username
	 * @param password
	 * @param role
	 */
	public Utilisateur(String nom, String prenom, String email, String username, String password, String role, String token) {
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.username = username;
		this.password = password;
		this.role = role;
		this.token = token;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}
	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}
	/**
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the role
	 */
	public String getRole() {
		return role;
	}
	/**
	 * @param role the role to set
	 */
	public void setRole(String role) {
		this.role = role;
	}
	/**
	 * @return the token
	 */
	public String getToken() {
		return token;
	}
	/**
	 * @param token the token to set
	 */
	public void setToken(String token) {
		this.token = token;
	}
	
	
	
	

}
