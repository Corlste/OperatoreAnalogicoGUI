package Operatore_BOT_GUI.model;

import java.util.*;

import Operatore_BOT_GUI.DAO.AziendaDAO;
import Operatore_BOT_GUI.DAO.BilancioDAO;

public class Model {

	private List<Azienda> aziende;
	private Azienda azienda;
	private Azienda competitor;
	
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
		aziende.remove(azienda);
		return aziende;
	}

	public void setAziende(List<Azienda> aziende) {
		this.aziende = aziende;
	}
	
	
	
	public Azienda getCompetitor() {
		return competitor;
	}


	public void setCompetitor(Azienda competitor) {
		this.competitor = competitor;
	}


	public void getInfoAzienda (Azienda azienda) {
		
		
	}
	
	public Bilancio getBilancioAziendaAnno(Azienda azienda, int anno) {
		BilancioDAO bilancioDAO = new BilancioDAO();
		Bilancio bilancio = bilancioDAO.getBilancioAziendaAnno(azienda, anno);
		System.out.println(bilancio.toString());
		return bilancio;
	}
	
	
	
}
