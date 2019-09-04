package Operatore_BOT_GUI.model;

import java.util.*;

import Operatore_BOT_GUI.DAO.AppaltoDAO;
import Operatore_BOT_GUI.DAO.ArticoloDAO;
import Operatore_BOT_GUI.DAO.AziendaDAO;
import Operatore_BOT_GUI.DAO.BilancioDAO;
import Operatore_BOT_GUI.DAO.BrevettoDAO;
import Operatore_BOT_GUI.DAO.NewsDAO;
import Operatore_BOT_GUI.DAO.ProdottoServizioDAO;
import Operatore_BOT_GUI.DAO.ProgettoDAO;

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
		return bilancio;
	}
	
	public Bilancio getRicaviAziendaAnnoProva(Azienda azienda, int anno) {
		BilancioDAO bilancioDAO = new BilancioDAO();
		Bilancio bilancio = bilancioDAO.getRicaviAziendaAnno(azienda, anno);
		return bilancio;
	}
	
	public List<Appalto> getAppaltiAzienda(Azienda azienda) {
		AppaltoDAO appaltoDAO = new AppaltoDAO();
		List<Appalto> appalti = appaltoDAO.getAppaltiAzienda(azienda);
		return appalti;
	}
	
	public List<Progetto> getProgettiAzienda(Azienda azienda){
		ProgettoDAO progettoDAO = new ProgettoDAO();
		List<Progetto> progetti = progettoDAO.getProgettiAzienda(azienda);
		return progetti;
	}
	
	public List<Articolo> getArticoliAzienda(Azienda azienda){
		ArticoloDAO articoloDAO = new ArticoloDAO();
		List<Articolo> articoli = articoloDAO.getArticoliAzienda(azienda);
		return articoli;
		
	}
	
	public List<News> getNewsAzienda (Azienda azienda){
		NewsDAO newsDAO = new NewsDAO();
		List<News> listNews = newsDAO.getNewsAzienda(azienda);
		return listNews;
	}
	
	
	public List<ProdottoServizio> getProdottiServizi (Azienda azienda){
		ProdottoServizioDAO prodservDAO = new ProdottoServizioDAO();
		List<ProdottoServizio> prodServ = prodservDAO.getProdottiServiziAzienda(azienda);
		return prodServ;
	}
	
	public List<Brevetto> getBrevettiAzienda (Azienda azienda){
		BrevettoDAO brevettoDAO = new BrevettoDAO();
		List<Brevetto> brevetti = brevettoDAO.getBrevettiAzienda(azienda);
		return brevetti;
	}
	
	
}
