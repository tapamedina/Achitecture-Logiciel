/**
 * 
 */
package ws;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.jws.WebService;

import domaine.Utilisateur;
import manager.Dao;

/**
 * @author tapam
 *
 */

@WebService
public class UtilisateurWS {
	
	private Dao dao;

	/**
	 * @param dao
	 * @throws SQLException 
	 */
	public UtilisateurWS() throws SQLException {
		dao = new  Dao();
	}
	
	public Utilisateur login(String username, String password, String token) {
		try {
			return dao.login(username, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public boolean modifierToken(int id, String token) {
		try {
			return dao.modifierToken(id, token);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public ArrayList<Utilisateur> listerUtilisateurs() {
		
		try {
			return dao.listerUtilisateurs();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public Utilisateur listerUtilisateur(int id) {
		
		try {
			return dao.listerUtilisateur(id);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public boolean ajouterUtilisateur(Utilisateur u) {
		try {
			return dao.ajouterUtilisateur(u);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public boolean modifierUtilisateur(Utilisateur u) {
		try {
			return dao.modifierUtilisateur(u);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public boolean supprimerUtilisateur(int id) {
		
		try {
			return dao.supprimerUtilisateur(id);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	
}
