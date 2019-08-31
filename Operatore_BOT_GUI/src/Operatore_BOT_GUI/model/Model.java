package Operatore_BOT_GUI.model;

import java.util.*;

import Operatore_BOT_GUI.DAO.AziendaDAO;

public class Model {

	private List<Azienda> aziende;
	
	public Model() {
		super();
		AziendaDAO dao = new AziendaDAO();
		this.aziende = dao.getTutteLeAziende();
	}

	public List<Azienda> getAziende() {
		return aziende;
	}

	public void setAziende(List<Azienda> aziende) {
		this.aziende = aziende;
	}
	
	
	
	
	
}
