package Operatore_BOT_GUI.controller;


	import java.net.URL;
	import java.util.ResourceBundle;

import Operatore_BOT_GUI.model.Model;
import javafx.event.ActionEvent;
	import javafx.fxml.FXML;
	import javafx.scene.control.Button;
	import javafx.scene.control.ChoiceBox;
	import javafx.scene.control.Label;
	import javafx.scene.control.TextArea;
	import javafx.scene.control.TextField;
	import javafx.scene.image.ImageView;
	import javafx.scene.input.MouseEvent;
	import javafx.scene.layout.GridPane;

	public class AppaltiController {
	    @FXML // ResourceBundle that was given to the FXMLLoader
	    private ResourceBundle resources;

	    @FXML // URL location of the FXML file that was given to the FXMLLoader
	    private URL location;

	    @FXML // fx:id="imgComparaangAzAp"
	    private ImageView imgComparaangAzAp; // Value injected by FXMLLoader

	    @FXML // fx:id="lblAziendaCompAzAp"
	    private Label lblAziendaCompAzAp; // Value injected by FXMLLoader

	    @FXML // fx:id="btnInfoAzApp"
	    private Button btnInfoAzApp; // Value injected by FXMLLoader

	    @FXML // fx:id="btnIndBilancioAzAp"
	    private Button btnIndBilancioAzAp; // Value injected by FXMLLoader

	    @FXML // fx:id="btnIndBrevettiAzBrAp"
	    private Button btnIndBrevettiAzBrAp; // Value injected by FXMLLoader

	    @FXML // fx:id="btnAppaltiApp"
	    private Button btnAppaltiApp; // Value injected by FXMLLoader

	    @FXML // fx:id="btnIndProgettiAzBrAp"
	    private Button btnIndProgettiAzBrAp; // Value injected by FXMLLoader

	    @FXML // fx:id="btnIndProdottiAzBrAp"
	    private Button btnIndProdottiAzBrAp; // Value injected by FXMLLoader

	    @FXML // fx:id="btnIndArticoliAzBrAp"
	    private Button btnIndArticoliAzBrAp; // Value injected by FXMLLoader

	    @FXML // fx:id="btnIndNewsAzAp"
	    private Button btnIndNewsAzAp; // Value injected by FXMLLoader

	    @FXML // fx:id="btnTornaClassificaAp"
	    private Button btnTornaClassificaAp; // Value injected by FXMLLoader

	    @FXML // fx:id="cbxAltraAziendaAp"
	    private ChoiceBox<?> cbxAltraAziendaAp; // Value injected by FXMLLoader

	    @FXML // fx:id="lblFunding"
	    private GridPane lblFunding; // Value injected by FXMLLoader

	    @FXML // fx:id="lblCoAppalto"
	    private Label lblCoAppalto; // Value injected by FXMLLoader

	    @FXML // fx:id="lblDataPubb"
	    private Label lblDataPubb; // Value injected by FXMLLoader

	    @FXML // fx:id="lblDataScad"
	    private Label lblDataScad; // Value injected by FXMLLoader

	    @FXML // fx:id="lblEsito"
	    private Label lblEsito; // Value injected by FXMLLoader

	    @FXML // fx:id="lblAppaltatrice"
	    private Label lblAppaltatrice; // Value injected by FXMLLoader

	    @FXML // fx:id="lblContraente"
	    private Label lblContraente; // Value injected by FXMLLoader

	    @FXML // fx:id="lblRaggruppamento"
	    private Label lblRaggruppamento; // Value injected by FXMLLoader

	    @FXML // fx:id="lblAltriCont"
	    private Label lblAltriCont; // Value injected by FXMLLoader

	    @FXML // fx:id="lblCodiceCpv"
	    private Label lblCodiceCpv; // Value injected by FXMLLoader

	    @FXML // fx:id="lblOggetto"
	    private Label lblOggetto; // Value injected by FXMLLoader

	    @FXML // fx:id="lblDescriziAp"
	    private Label lblDescriziAp; // Value injected by FXMLLoader

	    @FXML // fx:id="lblLuogEsec"
	    private Label lblLuogEsec; // Value injected by FXMLLoader

	    @FXML // fx:id="txtCodAppalto"
	    private TextField txtCodAppalto; // Value injected by FXMLLoader

	    @FXML // fx:id="txtDataPubb"
	    private TextField txtDataPubb; // Value injected by FXMLLoader

	    @FXML // fx:id="txtDataScad"
	    private TextField txtDataScad; // Value injected by FXMLLoader

	    @FXML // fx:id="txtEsito"
	    private TextField txtEsito; // Value injected by FXMLLoader

	    @FXML // fx:id="txtAppalt"
	    private TextField txtAppalt; // Value injected by FXMLLoader

	    @FXML // fx:id="txtRaggru"
	    private TextField txtRaggru; // Value injected by FXMLLoader

	    @FXML // fx:id="txtCodiceCpv"
	    private TextField txtCodiceCpv; // Value injected by FXMLLoader

	    @FXML // fx:id="txtOggettoApp"
	    private TextField txtOggettoApp; // Value injected by FXMLLoader

	    @FXML // fx:id="txtLugEsecu"
	    private TextField txtLugEsecu; // Value injected by FXMLLoader

	    @FXML // fx:id="txtAltrContr"
	    private TextField txtAltrContr; // Value injected by FXMLLoader

	    @FXML // fx:id="lblFondiEU"
	    private Label lblFondiEU; // Value injected by FXMLLoader

	    @FXML // fx:id="lblCodiceProgettoAp"
	    private Label lblCodiceProgettoAp; // Value injected by FXMLLoader

	    @FXML // fx:id="lblValContApp"
	    private Label lblValContApp; // Value injected by FXMLLoader

	    @FXML // fx:id="txtContraent"
	    private TextField txtContraent; // Value injected by FXMLLoader

	    @FXML // fx:id="txtDescrApp"
	    private TextArea txtDescrApp; // Value injected by FXMLLoader

	    @FXML // fx:id="txtFondiEu"
	    private TextField txtFondiEu; // Value injected by FXMLLoader

	    @FXML // fx:id="txtCodProgApp"
	    private TextField txtCodProgApp; // Value injected by FXMLLoader

	    @FXML // fx:id="txtValContApp"
	    private TextField txtValContApp; // Value injected by FXMLLoader

	    Model model;
	    
	    public void setModel(Model model) {
	    	this.model = model;
	    }
	    
	    @FXML
	    void Inf(MouseEvent event) {

	    }

	    @FXML
	    void Pj(MouseEvent event) {

	    }

	    @FXML
	    void doApriBilancio(ActionEvent event) {

	    }

	    @FXML
	    void doApriLink(ActionEvent event) {

	    }

	    @FXML
	    void doEstraiAppalti(ActionEvent event) {

	    }

	    @FXML
	    void doEstraiArticoli(ActionEvent event) {

	    }

	    @FXML
	    void doEstraiBrevetti(ActionEvent event) {

	    }

	    @FXML
	    void doEstraiInfoAzienda(ActionEvent event) {

	    }

	    @FXML
	    void doEstraiNews(ActionEvent event) {

	    }

	    @FXML
	    void doEstraiProdotti(ActionEvent event) {

	    }

	    @FXML
	    void doEstraiProgetti(ActionEvent event) {

	    }

	    @FXML
	    void doTornaclassifica(ActionEvent event) {

	    }

	    @FXML // This method is called by the FXMLLoader when initialization is complete
	    void initialize() {
	        assert imgComparaangAzAp != null : "fx:id=\"imgComparaangAzAp\" was not injected: check your FXML file 'Appalti_Azienda.fxml'.";
	        assert lblAziendaCompAzAp != null : "fx:id=\"lblAziendaCompAzAp\" was not injected: check your FXML file 'Appalti_Azienda.fxml'.";
	        assert btnInfoAzApp != null : "fx:id=\"btnInfoAzApp\" was not injected: check your FXML file 'Appalti_Azienda.fxml'.";
	        assert btnIndBilancioAzAp != null : "fx:id=\"btnIndBilancioAzAp\" was not injected: check your FXML file 'Appalti_Azienda.fxml'.";
	        assert btnIndBrevettiAzBrAp != null : "fx:id=\"btnIndBrevettiAzBrAp\" was not injected: check your FXML file 'Appalti_Azienda.fxml'.";
	        assert btnAppaltiApp != null : "fx:id=\"btnAppaltiApp\" was not injected: check your FXML file 'Appalti_Azienda.fxml'.";
	        assert btnIndProgettiAzBrAp != null : "fx:id=\"btnIndProgettiAzBrAp\" was not injected: check your FXML file 'Appalti_Azienda.fxml'.";
	        assert btnIndProdottiAzBrAp != null : "fx:id=\"btnIndProdottiAzBrAp\" was not injected: check your FXML file 'Appalti_Azienda.fxml'.";
	        assert btnIndArticoliAzBrAp != null : "fx:id=\"btnIndArticoliAzBrAp\" was not injected: check your FXML file 'Appalti_Azienda.fxml'.";
	        assert btnIndNewsAzAp != null : "fx:id=\"btnIndNewsAzAp\" was not injected: check your FXML file 'Appalti_Azienda.fxml'.";
	        assert btnTornaClassificaAp != null : "fx:id=\"btnTornaClassificaAp\" was not injected: check your FXML file 'Appalti_Azienda.fxml'.";
	        assert cbxAltraAziendaAp != null : "fx:id=\"cbxAltraAziendaAp\" was not injected: check your FXML file 'Appalti_Azienda.fxml'.";
	        assert lblFunding != null : "fx:id=\"lblFunding\" was not injected: check your FXML file 'Appalti_Azienda.fxml'.";
	        assert lblCoAppalto != null : "fx:id=\"lblCoAppalto\" was not injected: check your FXML file 'Appalti_Azienda.fxml'.";
	        assert lblDataPubb != null : "fx:id=\"lblDataPubb\" was not injected: check your FXML file 'Appalti_Azienda.fxml'.";
	        assert lblDataScad != null : "fx:id=\"lblDataScad\" was not injected: check your FXML file 'Appalti_Azienda.fxml'.";
	        assert lblEsito != null : "fx:id=\"lblEsito\" was not injected: check your FXML file 'Appalti_Azienda.fxml'.";
	        assert lblAppaltatrice != null : "fx:id=\"lblAppaltatrice\" was not injected: check your FXML file 'Appalti_Azienda.fxml'.";
	        assert lblContraente != null : "fx:id=\"lblContraente\" was not injected: check your FXML file 'Appalti_Azienda.fxml'.";
	        assert lblRaggruppamento != null : "fx:id=\"lblRaggruppamento\" was not injected: check your FXML file 'Appalti_Azienda.fxml'.";
	        assert lblAltriCont != null : "fx:id=\"lblAltriCont\" was not injected: check your FXML file 'Appalti_Azienda.fxml'.";
	        assert lblCodiceCpv != null : "fx:id=\"lblCodiceCpv\" was not injected: check your FXML file 'Appalti_Azienda.fxml'.";
	        assert lblOggetto != null : "fx:id=\"lblOggetto\" was not injected: check your FXML file 'Appalti_Azienda.fxml'.";
	        assert lblDescriziAp != null : "fx:id=\"lblDescriziAp\" was not injected: check your FXML file 'Appalti_Azienda.fxml'.";
	        assert lblLuogEsec != null : "fx:id=\"lblLuogEsec\" was not injected: check your FXML file 'Appalti_Azienda.fxml'.";
	        assert txtCodAppalto != null : "fx:id=\"txtCodAppalto\" was not injected: check your FXML file 'Appalti_Azienda.fxml'.";
	        assert txtDataPubb != null : "fx:id=\"txtDataPubb\" was not injected: check your FXML file 'Appalti_Azienda.fxml'.";
	        assert txtDataScad != null : "fx:id=\"txtDataScad\" was not injected: check your FXML file 'Appalti_Azienda.fxml'.";
	        assert txtEsito != null : "fx:id=\"txtEsito\" was not injected: check your FXML file 'Appalti_Azienda.fxml'.";
	        assert txtAppalt != null : "fx:id=\"txtAppalt\" was not injected: check your FXML file 'Appalti_Azienda.fxml'.";
	        assert txtRaggru != null : "fx:id=\"txtRaggru\" was not injected: check your FXML file 'Appalti_Azienda.fxml'.";
	        assert txtCodiceCpv != null : "fx:id=\"txtCodiceCpv\" was not injected: check your FXML file 'Appalti_Azienda.fxml'.";
	        assert txtOggettoApp != null : "fx:id=\"txtOggettoApp\" was not injected: check your FXML file 'Appalti_Azienda.fxml'.";
	        assert txtLugEsecu != null : "fx:id=\"txtLugEsecu\" was not injected: check your FXML file 'Appalti_Azienda.fxml'.";
	        assert txtAltrContr != null : "fx:id=\"txtAltrContr\" was not injected: check your FXML file 'Appalti_Azienda.fxml'.";
	        assert lblFondiEU != null : "fx:id=\"lblFondiEU\" was not injected: check your FXML file 'Appalti_Azienda.fxml'.";
	        assert lblCodiceProgettoAp != null : "fx:id=\"lblCodiceProgettoAp\" was not injected: check your FXML file 'Appalti_Azienda.fxml'.";
	        assert lblValContApp != null : "fx:id=\"lblValContApp\" was not injected: check your FXML file 'Appalti_Azienda.fxml'.";
	        assert txtContraent != null : "fx:id=\"txtContraent\" was not injected: check your FXML file 'Appalti_Azienda.fxml'.";
	        assert txtDescrApp != null : "fx:id=\"txtDescrApp\" was not injected: check your FXML file 'Appalti_Azienda.fxml'.";
	        assert txtFondiEu != null : "fx:id=\"txtFondiEu\" was not injected: check your FXML file 'Appalti_Azienda.fxml'.";
	        assert txtCodProgApp != null : "fx:id=\"txtCodProgApp\" was not injected: check your FXML file 'Appalti_Azienda.fxml'.";
	        assert txtValContApp != null : "fx:id=\"txtValContApp\" was not injected: check your FXML file 'Appalti_Azienda.fxml'.";

	    }
	
	

}
