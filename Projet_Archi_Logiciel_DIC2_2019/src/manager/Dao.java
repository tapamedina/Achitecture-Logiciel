/**
 * 
 */
package manager;

import java.sql.*;
import java.util.ArrayList;

import domaine.Utilisateur;
import utilities.Constantes;

/**
 * @author tapam 
 *
 */
public class Dao implements Constantes{
	
	private Connection con=null;
	private PreparedStatement st=null;
	private ResultSet rs=null; 
	
	
	public Dao() throws SQLException {
		this.con = DriverManager.getConnection(DRIVER+"://"+HOST+":"+PORT+"/"+DBNAME, USERNAME, PASSWORD);
	}
	
	/*
	 * fonction de connexion
	 */

	public Utilisateur login(String vusername, String vpassword) throws SQLException {
		st = con.prepareStatement("select * from utilisateur where username = ? and password = password(?)");
		st.setString(1, vusername);
		st.setString(2, vpassword);
		rs = st.executeQuery();
		Utilisateur utilisateur = null;
		if(rs.next()) {
			int id  = rs.getInt("id");
			String nom = rs.getString("nom");
			String prenom = rs.getString("prenom");
			String email = rs.getString("email");
			String role = rs.getString("role");
			utilisateur = new Utilisateur(id,nom, prenom, email,vusername, null, role, null);
		}
		rs.close();
		return utilisateur;
	}
	
	/*
	 * fonction de deconnexion ou de modification de token
	 */
	
	public boolean modifierToken(int id, String token) throws SQLException {
		st = con.prepareStatement("update utilisateur set token= ? where id=?");
		st.setString(1, token);
		st.setInt(2, id);
		int res = st.executeUpdate();
		return res >0;
		
	}
	
	/*
	 * fonction qui permet de lister les utilisateurs
	 */
	public ArrayList<Utilisateur> listerUtilisateurs() throws SQLException {
		st = con.prepareStatement("select * from utilisateur where role != ?");
		st.setString(1, "admin");
		rs = st.executeQuery();
		ArrayList<Utilisateur> liste = new ArrayList<Utilisateur>();
		while(rs.next()) {
			int id  = rs.getInt("id");
			String nom = rs.getString("nom");
			String prenom = rs.getString("prenom");
			String email = rs.getString("email");
			String username = rs.getString("username");
			String role = rs.getString("role");
			liste.add(new Utilisateur(id, nom, prenom, email, username, null, role, null));
		}
		rs.close();
		return liste;
	}
	
	/*
	 * fonction qui permet de recuperer un utilisateur en fournissant sont id en paramettre
	 */
	public Utilisateur listerUtilisateur(int id) throws SQLException {
		st = con.prepareStatement("select * from utilisateur where id = ? and role != ?");
		st.setInt(1, id);
		st.setString(2, "admin");
		rs = st.executeQuery();
		Utilisateur utilisateur = new Utilisateur();
		if(rs.next()) {
			utilisateur.setId(id);
			utilisateur.setNom(rs.getString("nom"));
			utilisateur.setPrenom(rs.getString("prenom"));
			utilisateur.setEmail(rs.getString("email"));
			utilisateur.setRole(rs.getString("username"));
			utilisateur.setRole(rs.getString("role"));
		}
		rs.close();
		return utilisateur;
	}
	
	/*
	 * fonction qui permet d'ajouter un utilisateur
	 */
	public boolean ajouterUtilisateur(Utilisateur u) throws SQLException {
		st = con.prepareStatement("insert into utilisateur(nom, prenom, email, username, password, role, token) values(?,?,?,?,password(?),?,?)");
		st.setString(1, u.getNom());
		st.setString(2, u.getPrenom());
		st.setString(3, u.getEmail());
		st.setString(4, u.getUsername());
		st.setString(5, u.getPassword());
		st.setString(6, u.getRole());
		st.setString(7, u.getToken());
		int res = st.executeUpdate();		
		return res >0;
	}
	
	/*
	 * fonction qui permet de modifier un utilisateur
	 */
	
	public boolean modifierUtilisateur(Utilisateur u) throws SQLException {
		st = con.prepareStatement("update utilisateur set nom=?, prenom=?, email=? where id=?");
		st.setString(1, u.getNom());
		st.setString(2, u.getPrenom());
		st.setString(3, u.getEmail());
		st.setInt(4, u.getId());
		int res = st.executeUpdate();
		return res >0;
	}
	
	/*
	 * fonction qui permet de supprimer un utilisateur
	 */
	
	public boolean supprimerUtilisateur(int id) throws SQLException {
		st = con.prepareStatement("delete from utilisateur where id = ?");
		st.setInt(1, id);
		int res = st.executeUpdate();		
		return res >0;
	}
	
}
