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

	public class ProdottiServiziController {

	    @FXML // ResourceBundle that was given to the FXMLLoader
	    private ResourceBundle resources;

	    @FXML // URL location of the FXML file that was given to the FXMLLoader
	    private URL location;

	    @FXML // fx:id="imgComparaangAzPreSer"
	    private ImageView imgComparaangAzPreSer; // Value injected by FXMLLoader

	    @FXML // fx:id="lblAziendaCompPreSer"
	    private Label lblAziendaCompPreSer; // Value injected by FXMLLoader

	    @FXML // fx:id="btnInfoAzPreSe"
	    private Button btnInfoAzPreSe; // Value injected by FXMLLoader

	    @FXML // fx:id="btnIndBilancioAzPreSe"
	    private Button btnIndBilancioAzPreSe; // Value injected by FXMLLoader

	    @FXML // fx:id="btnIndBrevettiAzPreSe"
	    private Button btnIndBrevettiAzPreSe; // Value injected by FXMLLoader

	    @FXML // fx:id="btnIndAppaltiAzPreSe"
	    private Button btnIndAppaltiAzPreSe; // Value injected by FXMLLoader

	    @FXML // fx:id="btnIndProgettiAzPreSe"
	    private Button btnIndProgettiAzPreSe; // Value injected by FXMLLoader

	    @FXML // fx:id="btnProdottiPr"
	    private Button btnProdottiPr; // Value injected by FXMLLoader

	    @FXML // fx:id="btnIndArticoliAzPreSe"
	    private Button btnIndArticoliAzPreSe; // Value injected by FXMLLoader

	    @FXML // fx:id="btnIndNewsAzPreSe"
	    private Button btnIndNewsAzPreSe; // Value injected by FXMLLoader

	    @FXML // fx:id="btnTornaClassificaPreSe"
	    private Button btnTornaClassificaPreSe; // Value injected by FXMLLoader

	    @FXML // fx:id="cbxAltraAziendaPreSe"
	    private ChoiceBox<?> cbxAltraAziendaPreSe; // Value injected by FXMLLoader

	    @FXML // fx:id="lblDescrizionePReSe"
	    private Label lblDescrizionePReSe; // Value injected by FXMLLoader

	    @FXML // fx:id="lblTipoloPr"
	    private Label lblTipoloPr; // Value injected by FXMLLoader

	    @FXML // fx:id="txtTit"
	    private TextField txtTit; // Value injected by FXMLLoader

	    @FXML // fx:id="txtDescriPreSer"
	    private TextArea txtDescriPreSer; // Value injected by FXMLLoader

	    @FXML // fx:id="txtTipolPreSer"
	    private TextArea txtTipolPreSer; // Value injected by FXMLLoader

	    @FXML // fx:id="lblDescrizionePReSe1"
	    private Label lblDescrizionePReSe1; // Value injected by FXMLLoader

	    @FXML // fx:id="lblTipoloPr1"
	    private Label lblTipoloPr1; // Value injected by FXMLLoader

	    @FXML // fx:id="txtTit1"
	    private TextField txtTit1; // Value injected by FXMLLoader

	    @FXML // fx:id="txtDescriPreSer1"
	    private TextArea txtDescriPreSer1; // Value injected by FXMLLoader

	    @FXML // fx:id="txtTipolPreSer1"
	    private TextArea txtTipolPreSer1; // Value injected by FXMLLoader

	    @FXML // fx:id="lblDescrizionePReSe2"
	    private Label lblDescrizionePReSe2; // Value injected by FXMLLoader

	    @FXML // fx:id="lblTipoloPr2"
	    private Label lblTipoloPr2; // Value injected by FXMLLoader

	    @FXML // fx:id="txtTit2"
	    private TextField txtTit2; // Value injected by FXMLLoader

	    @FXML // fx:id="txtDescriPreSer2"
	    private TextArea txtDescriPreSer2; // Value injected by FXMLLoader

	    @FXML // fx:id="txtTipolPreSer2"
	    private TextArea txtTipolPreSer2; // Value injected by FXMLLoader

	    Model model;
	    
	    public void setModel(Model model) {
	    	this.model = model;
	    }
	    
	    @FXML
	    void doApriBilancio(ActionEvent event) {

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
	        assert imgComparaangAzPreSer != null : "fx:id=\"imgComparaangAzPreSer\" was not injected: check your FXML file 'Prodotti_Azienda.fxml'.";
	        assert lblAziendaCompPreSer != null : "fx:id=\"lblAziendaCompPreSer\" was not injected: check your FXML file 'Prodotti_Azienda.fxml'.";
	        assert btnInfoAzPreSe != null : "fx:id=\"btnInfoAzPreSe\" was not injected: check your FXML file 'Prodotti_Azienda.fxml'.";
	        assert btnIndBilancioAzPreSe != null : "fx:id=\"btnIndBilancioAzPreSe\" was not injected: check your FXML file 'Prodotti_Azienda.fxml'.";
	        assert btnIndBrevettiAzPreSe != null : "fx:id=\"btnIndBrevettiAzPreSe\" was not injected: check your FXML file 'Prodotti_Azienda.fxml'.";
	        assert btnIndAppaltiAzPreSe != null : "fx:id=\"btnIndAppaltiAzPreSe\" was not injected: check your FXML file 'Prodotti_Azienda.fxml'.";
	        assert btnIndProgettiAzPreSe != null : "fx:id=\"btnIndProgettiAzPreSe\" was not injected: check your FXML file 'Prodotti_Azienda.fxml'.";
	        assert btnProdottiPr != null : "fx:id=\"btnProdottiPr\" was not injected: check your FXML file 'Prodotti_Azienda.fxml'.";
	        assert btnIndArticoliAzPreSe != null : "fx:id=\"btnIndArticoliAzPreSe\" was not injected: check your FXML file 'Prodotti_Azienda.fxml'.";
	        assert btnIndNewsAzPreSe != null : "fx:id=\"btnIndNewsAzPreSe\" was not injected: check your FXML file 'Prodotti_Azienda.fxml'.";
	        assert btnTornaClassificaPreSe != null : "fx:id=\"btnTornaClassificaPreSe\" was not injected: check your FXML file 'Prodotti_Azienda.fxml'.";
	        assert cbxAltraAziendaPreSe != null : "fx:id=\"cbxAltraAziendaPreSe\" was not injected: check your FXML file 'Prodotti_Azienda.fxml'.";
	        assert lblDescrizionePReSe != null : "fx:id=\"lblDescrizionePReSe\" was not injected: check your FXML file 'Prodotti_Azienda.fxml'.";
	        assert lblTipoloPr != null : "fx:id=\"lblTipoloPr\" was not injected: check your FXML file 'Prodotti_Azienda.fxml'.";
	        assert txtTit != null : "fx:id=\"txtTit\" was not injected: check your FXML file 'Prodotti_Azienda.fxml'.";
	        assert txtDescriPreSer != null : "fx:id=\"txtDescriPreSer\" was not injected: check your FXML file 'Prodotti_Azienda.fxml'.";
	        assert txtTipolPreSer != null : "fx:id=\"txtTipolPreSer\" was not injected: check your FXML file 'Prodotti_Azienda.fxml'.";
	        assert lblDescrizionePReSe1 != null : "fx:id=\"lblDescrizionePReSe1\" was not injected: check your FXML file 'Prodotti_Azienda.fxml'.";
	        assert lblTipoloPr1 != null : "fx:id=\"lblTipoloPr1\" was not injected: check your FXML file 'Prodotti_Azienda.fxml'.";
	        assert txtTit1 != null : "fx:id=\"txtTit1\" was not injected: check your FXML file 'Prodotti_Azienda.fxml'.";
	        assert txtDescriPreSer1 != null : "fx:id=\"txtDescriPreSer1\" was not injected: check your FXML file 'Prodotti_Azienda.fxml'.";
	        assert txtTipolPreSer1 != null : "fx:id=\"txtTipolPreSer1\" was not injected: check your FXML file 'Prodotti_Azienda.fxml'.";
	        assert lblDescrizionePReSe2 != null : "fx:id=\"lblDescrizionePReSe2\" was not injected: check your FXML file 'Prodotti_Azienda.fxml'.";
	        assert lblTipoloPr2 != null : "fx:id=\"lblTipoloPr2\" was not injected: check your FXML file 'Prodotti_Azienda.fxml'.";
	        assert txtTit2 != null : "fx:id=\"txtTit2\" was not injected: check your FXML file 'Prodotti_Azienda.fxml'.";
	        assert txtDescriPreSer2 != null : "fx:id=\"txtDescriPreSer2\" was not injected: check your FXML file 'Prodotti_Azienda.fxml'.";
	        assert txtTipolPreSer2 != null : "fx:id=\"txtTipolPreSer2\" was not injected: check your FXML file 'Prodotti_Azienda.fxml'.";

	    }
	


}
