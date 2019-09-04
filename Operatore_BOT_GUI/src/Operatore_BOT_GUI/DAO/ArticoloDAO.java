package Operatore_BOT_GUI.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import Operatore_BOT_GUI.model.Articolo;
import Operatore_BOT_GUI.model.Azienda;

public class ArticoloDAO {

	public List<Articolo> getArticoliAzienda(Azienda az){
		String partitaIVA  = az.getPartitaIVA();
		final String sqlArticolo = "SELECT * FROM articoli where p_iva=?";
		List<Articolo> articoli = new LinkedList<Articolo>();
		try {
			Connection conn = DBConnect.getConnection();
			PreparedStatement st = conn.prepareStatement(sqlArticolo);
			st.setString(1, partitaIVA);
			ResultSet rs = st.executeQuery();
			while (rs.next()) {
				Articolo articolo = new Articolo(rs.getString(1), rs.getString(2), rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7));
				articoli.add(articolo);
			}
			st.close();
			conn.close();
			return articoli;
			
		}catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException("Errore DB");
		}
		
		
	}
}
