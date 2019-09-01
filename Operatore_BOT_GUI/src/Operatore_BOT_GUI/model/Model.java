package Operatore_BOT_GUI.model;

import java.util.*;

import Operatore_BOT_GUI.DAO.AziendaDAO;

public class Model {

	private List<Azienda> aziende;
	private Azienda azienda;
	private Azienda aziendaCompara;
	
	public Model() {
		super();
		AziendaDAO dao = new AziendaDAO();
		this.aziende = dao.getTutteLeAziende();
	}

	
	public Azienda getAzienda() {
		return azienda;
	}

	public void setAzienda(Azienda azienda) {
		this.azienda = azienda;
	}

	public List<Azienda> getAziende() {
		return aziende;
	}
	
	public List<Azienda> getAziendeMenoSelezionata(){
//		this.azienda = azienda;
		aziende.remove(azienda);
		return aziende;
	}

	public void setAziende(List<Azienda> aziende) {
		this.aziende = aziende;
	}
	
	public void getInfoAzienda (Azienda azienda) {
		
		
	}
	
	
	
	
}
