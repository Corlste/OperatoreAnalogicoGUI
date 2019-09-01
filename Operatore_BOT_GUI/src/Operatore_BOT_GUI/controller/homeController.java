package Operatore_BOT_GUI.controller;

/**
 * Sample Skeleton for 'Home.fxml' Controller Class
 */

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import Operatore_BOT_GUI.model.Azienda;
import Operatore_BOT_GUI.model.Model;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class homeController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="lblAzienda"
    private Label lblAzienda; // Value injected by FXMLLoader

    @FXML // fx:id="btnProdotti"
    private Button btnProdotti; // Value injected by FXMLLoader

    @FXML // fx:id="btnNews"
    private Button btnNews; // Value injected by FXMLLoader

    @FXML // fx:id="btnProgetti"
    private Button btnProgetti; // Value injected by FXMLLoader

    @FXML // fx:id="btnBrevetti"
    private Button btnBrevetti; // Value injected by FXMLLoader

    @FXML // fx:id="btnAppalti"
    private Button btnAppalti; // Value injected by FXMLLoader

    @FXML // fx:id="btnBilancio"
    private Button btnBilancio; // Value injected by FXMLLoader

    @FXML // fx:id="btnArticoli"
    private Button btnArticoli; // Value injected by FXMLLoader

    @FXML // fx:id="btnCompetitor1"
    private Button btnCompetitor1; // Value injected by FXMLLoader

    @FXML // fx:id="btnCompara1"
    private Button btnCompara1; // Value injected by FXMLLoader

    @FXML // fx:id="btnCompetitor2"
    private Button btnCompetitor2; // Value injected by FXMLLoader

    @FXML // fx:id="btnCompara2"
    private Button btnCompara2; // Value injected by FXMLLoader

    @FXML // fx:id="btnCompetitor3"
    private Button btnCompetitor3; // Value injected by FXMLLoader

    @FXML // fx:id="btnCompara3"
    private Button btnCompara3; // Value injected by FXMLLoader

    @FXML // fx:id="btnCompetitor4"
    private Button btnCompetitor4; // Value injected by FXMLLoader

    @FXML // fx:id="btnCompara4"
    private Button btnCompara4; // Value injected by FXMLLoader
    
    private Model model;
    
    List<Azienda> aziende;
    
    public void setModel(Model model) {
    	this.model = model;
    	Azienda azienda = model.getAzienda();
    	lblAzienda.setText(azienda.toString());
    	aziende=model.getAziendeMenoSelezionata();
    	if(aziende.size()>0) {
    		btnCompetitor1.setText(aziende.get(0).toString());
    		if(aziende.size()>1) {
    			btnCompetitor2.setText(aziende.get(1).toString());
    			if(aziende.size()>2) {
    				btnCompetitor3.setText(aziende.get(2).toString());
    				if(aziende.size()>3) {
    					btnCompetitor4.setText(aziende.get(3).toString());
    				}
    			}
    		}
    	}
    }

    @FXML
    void doAppalti(ActionEvent event) {

    }

    @FXML
    void doArticoli(ActionEvent event) {

    }

    @FXML
    void doBilancio(ActionEvent event) {

    }

    @FXML
    void doBrevetti(ActionEvent event) {

    }

    @FXML
    void doCompara1(ActionEvent event) {

    }

    @FXML
    void doCompara2(ActionEvent event) {

    }

    @FXML
    void doCompara3(ActionEvent event) {

    }

    @FXML
    void doCompara4(ActionEvent event) {

    }

    @FXML
    void doCompetitor1(ActionEvent event) {

    }

    @FXML
    void doCompetitor2(ActionEvent event) {

    }

    @FXML
    void doCompetitor3(ActionEvent event) {

    }

    @FXML
    void doCompetitor4(ActionEvent event) {

    }

    @FXML
    void doNews(ActionEvent event) {

    }

    @FXML
    void doProdotti(ActionEvent event) {

    }

    @FXML
    void doProgetti(ActionEvent event) {

    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {

        assert lblAzienda != null : "fx:id=\"lblAzienda\" was not injected: check your FXML file 'Home.fxml'.";
        assert btnProdotti != null : "fx:id=\"btnProdotti\" was not injected: check your FXML file 'Home.fxml'.";
        assert btnNews != null : "fx:id=\"btnNews\" was not injected: check your FXML file 'Home.fxml'.";
        assert btnProgetti != null : "fx:id=\"btnProgetti\" was not injected: check your FXML file 'Home.fxml'.";
        assert btnBrevetti != null : "fx:id=\"btnBrevetti\" was not injected: check your FXML file 'Home.fxml'.";
        assert btnAppalti != null : "fx:id=\"btnAppalti\" was not injected: check your FXML file 'Home.fxml'.";
        assert btnBilancio != null : "fx:id=\"btnBilancio\" was not injected: check your FXML file 'Home.fxml'.";
        assert btnArticoli != null : "fx:id=\"btnArticoli\" was not injected: check your FXML file 'Home.fxml'.";
        assert btnCompetitor1 != null : "fx:id=\"btnCompetitor1\" was not injected: check your FXML file 'Home.fxml'.";
        assert btnCompara1 != null : "fx:id=\"btnCompara1\" was not injected: check your FXML file 'Home.fxml'.";
        assert btnCompetitor2 != null : "fx:id=\"btnCompetitor2\" was not injected: check your FXML file 'Home.fxml'.";
        assert btnCompara2 != null : "fx:id=\"btnCompara2\" was not injected: check your FXML file 'Home.fxml'.";
        assert btnCompetitor3 != null : "fx:id=\"btnCompetitor3\" was not injected: check your FXML file 'Home.fxml'.";
        assert btnCompara3 != null : "fx:id=\"btnCompara3\" was not injected: check your FXML file 'Home.fxml'.";
        assert btnCompetitor4 != null : "fx:id=\"btnCompetitor4\" was not injected: check your FXML file 'Home.fxml'.";
        assert btnCompara4 != null : "fx:id=\"btnCompara4\" was not injected: check your FXML file 'Home.fxml'.";

    }
}
