/**
 * 
 */
package projet_archi_logiciel_dic2_2019;



import java.sql.SQLException;

import javax.xml.ws.Endpoint;

import utilities.Constantes;
import ws.UtilisateurWS;

/**
 * @author tapam
 *
 */
public class ServeurJWS implements Constantes{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		try {
			Endpoint.publish(URL, new UtilisateurWS());
			System.out.println(URL);
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
