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

	public class ArticoliController {

	    @FXML // ResourceBundle that was given to the FXMLLoader
	    private ResourceBundle resources;

	    @FXML // URL location of the FXML file that was given to the FXMLLoader
	    private URL location;

	    @FXML // fx:id="imgComparaangAzAr"
	    private ImageView imgComparaangAzAr; // Value injected by FXMLLoader

	    @FXML // fx:id="lblAziendaCompArt"
	    private Label lblAziendaCompArt; // Value injected by FXMLLoader

	    @FXML // fx:id="btninfoAzArt"
	    private Button btninfoAzArt; // Value injected by FXMLLoader

	    @FXML // fx:id="btnIndBilancioAzAr"
	    private Button btnIndBilancioAzAr; // Value injected by FXMLLoader

	    @FXML // fx:id="btnIndBrevettiAzAr"
	    private Button btnIndBrevettiAzAr; // Value injected by FXMLLoader

	    @FXML // fx:id="btnIndAppaltiAzAr"
	    private Button btnIndAppaltiAzAr; // Value injected by FXMLLoader

	    @FXML // fx:id="btnIndProgettiAzAr"
	    private Button btnIndProgettiAzAr; // Value injected by FXMLLoader

	    @FXML // fx:id="btnIndProdottiAzAr"
	    private Button btnIndProdottiAzAr; // Value injected by FXMLLoader

	    @FXML // fx:id="btnArticArt"
	    private Button btnArticArt; // Value injected by FXMLLoader

	    @FXML // fx:id="btnIndNewsAzAr"
	    private Button btnIndNewsAzAr; // Value injected by FXMLLoader

	    @FXML // fx:id="btnTornaClassificaAr"
	    private Button btnTornaClassificaAr; // Value injected by FXMLLoader

	    @FXML // fx:id="cbxAltraAziendaAr"
	    private ChoiceBox<?> cbxAltraAziendaAr; // Value injected by FXMLLoader

	    @FXML // fx:id="lblLinkArt"
	    private Label lblLinkArt; // Value injected by FXMLLoader

	    @FXML // fx:id="lblBackArt"
	    private Label lblBackArt; // Value injected by FXMLLoader

	    @FXML // fx:id="lblTestoArt"
	    private Label lblTestoArt; // Value injected by FXMLLoader

	    @FXML // fx:id="lblDataArticolo"
	    private Label lblDataArticolo; // Value injected by FXMLLoader

	    @FXML // fx:id="lblKeywordsAr"
	    private Label lblKeywordsAr; // Value injected by FXMLLoader

	    @FXML // fx:id="txtAppNumero"
	    private TextField txtAppNumero; // Value injected by FXMLLoader

	    @FXML // fx:id="txtFamilyID"
	    private TextField txtFamilyID; // Value injected by FXMLLoader

	    @FXML // fx:id="txtTit"
	    private TextField txtTit; // Value injected by FXMLLoader

	    @FXML // fx:id="txtTestoArt"
	    private TextArea txtTestoArt; // Value injected by FXMLLoader

	    @FXML // fx:id="txtDataArt"
	    private TextField txtDataArt; // Value injected by FXMLLoader

	    @FXML // fx:id="txtKeywordArt"
	    private TextField txtKeywordArt; // Value injected by FXMLLoader

	    @FXML // fx:id="txtBackArti"
	    private TextField txtBackArti; // Value injected by FXMLLoader

	    @FXML // fx:id="txtLinkArt"
	    private TextField txtLinkArt; // Value injected by FXMLLoader

	    @FXML // fx:id="lblLinkArt1"
	    private Label lblLinkArt1; // Value injected by FXMLLoader

	    @FXML // fx:id="lblBackArt1"
	    private Label lblBackArt1; // Value injected by FXMLLoader

	    @FXML // fx:id="lblTestoArt1"
	    private Label lblTestoArt1; // Value injected by FXMLLoader

	    @FXML // fx:id="lblDataArticolo1"
	    private Label lblDataArticolo1; // Value injected by FXMLLoader

	    @FXML // fx:id="lblKeywordsAr1"
	    private Label lblKeywordsAr1; // Value injected by FXMLLoader

	    @FXML // fx:id="txtAppNumero1"
	    private TextField txtAppNumero1; // Value injected by FXMLLoader

	    @FXML // fx:id="txtFamilyID1"
	    private TextField txtFamilyID1; // Value injected by FXMLLoader

	    @FXML // fx:id="txtTit1"
	    private TextField txtTit1; // Value injected by FXMLLoader

	    @FXML // fx:id="txtTestoArt1"
	    private TextArea txtTestoArt1; // Value injected by FXMLLoader

	    @FXML // fx:id="txtDataArt1"
	    private TextField txtDataArt1; // Value injected by FXMLLoader

	    @FXML // fx:id="txtKeywordArt1"
	    private TextField txtKeywordArt1; // Value injected by FXMLLoader

	    @FXML // fx:id="txtBackArti1"
	    private TextField txtBackArti1; // Value injected by FXMLLoader

	    @FXML // fx:id="txtLinkArt1"
	    private TextField txtLinkArt1; // Value injected by FXMLLoader

	    @FXML // fx:id="lblLinkArt2"
	    private Label lblLinkArt2; // Value injected by FXMLLoader

	    @FXML // fx:id="lblBackArt2"
	    private Label lblBackArt2; // Value injected by FXMLLoader

	    @FXML // fx:id="lblTestoArt2"
	    private Label lblTestoArt2; // Value injected by FXMLLoader

	    @FXML // fx:id="lblDataArticolo2"
	    private Label lblDataArticolo2; // Value injected by FXMLLoader

	    @FXML // fx:id="lblKeywordsAr2"
	    private Label lblKeywordsAr2; // Value injected by FXMLLoader

	    @FXML // fx:id="txtAppNumero2"
	    private TextField txtAppNumero2; // Value injected by FXMLLoader

	    @FXML // fx:id="txtFamilyID2"
	    private TextField txtFamilyID2; // Value injected by FXMLLoader

	    @FXML // fx:id="txtTit2"
	    private TextField txtTit2; // Value injected by FXMLLoader

	    @FXML // fx:id="txtTestoArt2"
	    private TextArea txtTestoArt2; // Value injected by FXMLLoader

	    @FXML // fx:id="txtDataArt2"
	    private TextField txtDataArt2; // Value injected by FXMLLoader

	    @FXML // fx:id="txtKeywordArt2"
	    private TextField txtKeywordArt2; // Value injected by FXMLLoader

	    @FXML // fx:id="txtBackArti2"
	    private TextField txtBackArti2; // Value injected by FXMLLoader

	    @FXML // fx:id="txtLinkArt2"
	    private TextField txtLinkArt2; // Value injected by FXMLLoader

	    @FXML // fx:id="lblLinkArt11"
	    private Label lblLinkArt11; // Value injected by FXMLLoader

	    @FXML // fx:id="lblBackArt11"
	    private Label lblBackArt11; // Value injected by FXMLLoader

	    @FXML // fx:id="lblTestoArt11"
	    private Label lblTestoArt11; // Value injected by FXMLLoader

	    @FXML // fx:id="lblDataArticolo11"
	    private Label lblDataArticolo11; // Value injected by FXMLLoader

	    @FXML // fx:id="lblKeywordsAr11"
	    private Label lblKeywordsAr11; // Value injected by FXMLLoader

	    @FXML // fx:id="txtAppNumero11"
	    private TextField txtAppNumero11; // Value injected by FXMLLoader

	    @FXML // fx:id="txtFamilyID11"
	    private TextField txtFamilyID11; // Value injected by FXMLLoader

	    @FXML // fx:id="txtTit11"
	    private TextField txtTit11; // Value injected by FXMLLoader

	    @FXML // fx:id="txtTestoArt11"
	    private TextArea txtTestoArt11; // Value injected by FXMLLoader

	    @FXML // fx:id="txtDataArt11"
	    private TextField txtDataArt11; // Value injected by FXMLLoader

	    @FXML // fx:id="txtKeywordArt11"
	    private TextField txtKeywordArt11; // Value injected by FXMLLoader

	    @FXML // fx:id="txtBackArti11"
	    private TextField txtBackArti11; // Value injected by FXMLLoader

	    @FXML // fx:id="txtLinkArt11"
	    private TextField txtLinkArt11; // Value injected by FXMLLoader

	    @FXML // fx:id="lblLinkArt3"
	    private Label lblLinkArt3; // Value injected by FXMLLoader

	    @FXML // fx:id="lblBackArt3"
	    private Label lblBackArt3; // Value injected by FXMLLoader

	    @FXML // fx:id="lblTestoArt3"
	    private Label lblTestoArt3; // Value injected by FXMLLoader

	    @FXML // fx:id="lblDataArticolo3"
	    private Label lblDataArticolo3; // Value injected by FXMLLoader

	    @FXML // fx:id="lblKeywordsAr3"
	    private Label lblKeywordsAr3; // Value injected by FXMLLoader

	    @FXML // fx:id="txtAppNumero3"
	    private TextField txtAppNumero3; // Value injected by FXMLLoader

	    @FXML // fx:id="txtFamilyID3"
	    private TextField txtFamilyID3; // Value injected by FXMLLoader

	    @FXML // fx:id="txtTit3"
	    private TextField txtTit3; // Value injected by FXMLLoader

	    @FXML // fx:id="txtTestoArt3"
	    private TextArea txtTestoArt3; // Value injected by FXMLLoader

	    @FXML // fx:id="txtDataArt3"
	    private TextField txtDataArt3; // Value injected by FXMLLoader

	    @FXML // fx:id="txtKeywordArt3"
	    private TextField txtKeywordArt3; // Value injected by FXMLLoader

	    @FXML // fx:id="txtBackArti3"
	    private TextField txtBackArti3; // Value injected by FXMLLoader

	    @FXML // fx:id="txtLinkArt3"
	    private TextField txtLinkArt3; // Value injected by FXMLLoader

	    @FXML // fx:id="lblLinkArt12"
	    private Label lblLinkArt12; // Value injected by FXMLLoader

	    @FXML // fx:id="lblBackArt12"
	    private Label lblBackArt12; // Value injected by FXMLLoader

	    @FXML // fx:id="lblTestoArt12"
	    private Label lblTestoArt12; // Value injected by FXMLLoader

	    @FXML // fx:id="lblDataArticolo12"
	    private Label lblDataArticolo12; // Value injected by FXMLLoader

	    @FXML // fx:id="lblKeywordsAr12"
	    private Label lblKeywordsAr12; // Value injected by FXMLLoader

	    @FXML // fx:id="txtAppNumero12"
	    private TextField txtAppNumero12; // Value injected by FXMLLoader

	    @FXML // fx:id="txtFamilyID12"
	    private TextField txtFamilyID12; // Value injected by FXMLLoader

	    @FXML // fx:id="txtTit12"
	    private TextField txtTit12; // Value injected by FXMLLoader

	    @FXML // fx:id="txtTestoArt12"
	    private TextArea txtTestoArt12; // Value injected by FXMLLoader

	    @FXML // fx:id="txtDataArt12"
	    private TextField txtDataArt12; // Value injected by FXMLLoader

	    @FXML // fx:id="txtKeywordArt12"
	    private TextField txtKeywordArt12; // Value injected by FXMLLoader

	    @FXML // fx:id="txtBackArti12"
	    private TextField txtBackArti12; // Value injected by FXMLLoader

	    @FXML // fx:id="txtLinkArt12"
	    private TextField txtLinkArt12; // Value injected by FXMLLoader

	    @FXML // fx:id="lblLinkArt21"
	    private Label lblLinkArt21; // Value injected by FXMLLoader

	    @FXML // fx:id="lblBackArt21"
	    private Label lblBackArt21; // Value injected by FXMLLoader

	    @FXML // fx:id="lblTestoArt21"
	    private Label lblTestoArt21; // Value injected by FXMLLoader

	    @FXML // fx:id="lblDataArticolo21"
	    private Label lblDataArticolo21; // Value injected by FXMLLoader

	    @FXML // fx:id="lblKeywordsAr21"
	    private Label lblKeywordsAr21; // Value injected by FXMLLoader

	    @FXML // fx:id="txtAppNumero21"
	    private TextField txtAppNumero21; // Value injected by FXMLLoader

	    @FXML // fx:id="txtFamilyID21"
	    private TextField txtFamilyID21; // Value injected by FXMLLoader

	    @FXML // fx:id="txtTit21"
	    private TextField txtTit21; // Value injected by FXMLLoader

	    @FXML // fx:id="txtTestoArt21"
	    private TextArea txtTestoArt21; // Value injected by FXMLLoader

	    @FXML // fx:id="txtDataArt21"
	    private TextField txtDataArt21; // Value injected by FXMLLoader

	    @FXML // fx:id="txtKeywordArt21"
	    private TextField txtKeywordArt21; // Value injected by FXMLLoader

	    @FXML // fx:id="txtBackArti21"
	    private TextField txtBackArti21; // Value injected by FXMLLoader

	    @FXML // fx:id="txtLinkArt21"
	    private TextField txtLinkArt21; // Value injected by FXMLLoader

	    @FXML // fx:id="lblLinkArt111"
	    private Label lblLinkArt111; // Value injected by FXMLLoader

	    @FXML // fx:id="lblBackArt111"
	    private Label lblBackArt111; // Value injected by FXMLLoader

	    @FXML // fx:id="lblTestoArt111"
	    private Label lblTestoArt111; // Value injected by FXMLLoader

	    @FXML // fx:id="lblDataArticolo111"
	    private Label lblDataArticolo111; // Value injected by FXMLLoader

	    @FXML // fx:id="lblKeywordsAr111"
	    private Label lblKeywordsAr111; // Value injected by FXMLLoader

	    @FXML // fx:id="txtAppNumero111"
	    private TextField txtAppNumero111; // Value injected by FXMLLoader

	    @FXML // fx:id="txtFamilyID111"
	    private TextField txtFamilyID111; // Value injected by FXMLLoader

	    @FXML // fx:id="txtTit111"
	    private TextField txtTit111; // Value injected by FXMLLoader

	    @FXML // fx:id="txtTestoArt111"
	    private TextArea txtTestoArt111; // Value injected by FXMLLoader

	    @FXML // fx:id="txtDataArt111"
	    private TextField txtDataArt111; // Value injected by FXMLLoader

	    @FXML // fx:id="txtKeywordArt111"
	    private TextField txtKeywordArt111; // Value injected by FXMLLoader

	    @FXML // fx:id="txtBackArti111"
	    private TextField txtBackArti111; // Value injected by FXMLLoader

	    @FXML // fx:id="txtLinkArt111"
	    private TextField txtLinkArt111; // Value injected by FXMLLoader

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
	        assert imgComparaangAzAr != null : "fx:id=\"imgComparaangAzAr\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
	        assert lblAziendaCompArt != null : "fx:id=\"lblAziendaCompArt\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
	        assert btninfoAzArt != null : "fx:id=\"btninfoAzArt\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
	        assert btnIndBilancioAzAr != null : "fx:id=\"btnIndBilancioAzAr\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
	        assert btnIndBrevettiAzAr != null : "fx:id=\"btnIndBrevettiAzAr\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
	        assert btnIndAppaltiAzAr != null : "fx:id=\"btnIndAppaltiAzAr\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
	        assert btnIndProgettiAzAr != null : "fx:id=\"btnIndProgettiAzAr\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
	        assert btnIndProdottiAzAr != null : "fx:id=\"btnIndProdottiAzAr\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
	        assert btnArticArt != null : "fx:id=\"btnArticArt\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
	        assert btnIndNewsAzAr != null : "fx:id=\"btnIndNewsAzAr\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
	        assert btnTornaClassificaAr != null : "fx:id=\"btnTornaClassificaAr\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
	        assert cbxAltraAziendaAr != null : "fx:id=\"cbxAltraAziendaAr\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
	        assert lblLinkArt != null : "fx:id=\"lblLinkArt\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
	        assert lblBackArt != null : "fx:id=\"lblBackArt\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
	        assert lblTestoArt != null : "fx:id=\"lblTestoArt\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
	        assert lblDataArticolo != null : "fx:id=\"lblDataArticolo\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
	        assert lblKeywordsAr != null : "fx:id=\"lblKeywordsAr\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
	        assert txtAppNumero != null : "fx:id=\"txtAppNumero\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
	        assert txtFamilyID != null : "fx:id=\"txtFamilyID\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
	        assert txtTit != null : "fx:id=\"txtTit\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
	        assert txtTestoArt != null : "fx:id=\"txtTestoArt\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
	        assert txtDataArt != null : "fx:id=\"txtDataArt\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
	        assert txtKeywordArt != null : "fx:id=\"txtKeywordArt\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
	        assert txtBackArti != null : "fx:id=\"txtBackArti\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
	        assert txtLinkArt != null : "fx:id=\"txtLinkArt\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
	        assert lblLinkArt1 != null : "fx:id=\"lblLinkArt1\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
	        assert lblBackArt1 != null : "fx:id=\"lblBackArt1\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
	        assert lblTestoArt1 != null : "fx:id=\"lblTestoArt1\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
	        assert lblDataArticolo1 != null : "fx:id=\"lblDataArticolo1\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
	        assert lblKeywordsAr1 != null : "fx:id=\"lblKeywordsAr1\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
	        assert txtAppNumero1 != null : "fx:id=\"txtAppNumero1\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
	        assert txtFamilyID1 != null : "fx:id=\"txtFamilyID1\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
	        assert txtTit1 != null : "fx:id=\"txtTit1\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
	        assert txtTestoArt1 != null : "fx:id=\"txtTestoArt1\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
	        assert txtDataArt1 != null : "fx:id=\"txtDataArt1\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
	        assert txtKeywordArt1 != null : "fx:id=\"txtKeywordArt1\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
	        assert txtBackArti1 != null : "fx:id=\"txtBackArti1\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
	        assert txtLinkArt1 != null : "fx:id=\"txtLinkArt1\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
	        assert lblLinkArt2 != null : "fx:id=\"lblLinkArt2\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
	        assert lblBackArt2 != null : "fx:id=\"lblBackArt2\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
	        assert lblTestoArt2 != null : "fx:id=\"lblTestoArt2\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
	        assert lblDataArticolo2 != null : "fx:id=\"lblDataArticolo2\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
	        assert lblKeywordsAr2 != null : "fx:id=\"lblKeywordsAr2\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
	        assert txtAppNumero2 != null : "fx:id=\"txtAppNumero2\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
	        assert txtFamilyID2 != null : "fx:id=\"txtFamilyID2\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
	        assert txtTit2 != null : "fx:id=\"txtTit2\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
	        assert txtTestoArt2 != null : "fx:id=\"txtTestoArt2\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
	        assert txtDataArt2 != null : "fx:id=\"txtDataArt2\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
	        assert txtKeywordArt2 != null : "fx:id=\"txtKeywordArt2\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
	        assert txtBackArti2 != null : "fx:id=\"txtBackArti2\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
	        assert txtLinkArt2 != null : "fx:id=\"txtLinkArt2\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
	        assert lblLinkArt11 != null : "fx:id=\"lblLinkArt11\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
	        assert lblBackArt11 != null : "fx:id=\"lblBackArt11\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
	        assert lblTestoArt11 != null : "fx:id=\"lblTestoArt11\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
	        assert lblDataArticolo11 != null : "fx:id=\"lblDataArticolo11\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
	        assert lblKeywordsAr11 != null : "fx:id=\"lblKeywordsAr11\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
	        assert txtAppNumero11 != null : "fx:id=\"txtAppNumero11\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
	        assert txtFamilyID11 != null : "fx:id=\"txtFamilyID11\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
	        assert txtTit11 != null : "fx:id=\"txtTit11\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
	        assert txtTestoArt11 != null : "fx:id=\"txtTestoArt11\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
	        assert txtDataArt11 != null : "fx:id=\"txtDataArt11\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
	        assert txtKeywordArt11 != null : "fx:id=\"txtKeywordArt11\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
	        assert txtBackArti11 != null : "fx:id=\"txtBackArti11\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
	        assert txtLinkArt11 != null : "fx:id=\"txtLinkArt11\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
	        assert lblLinkArt3 != null : "fx:id=\"lblLinkArt3\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
	        assert lblBackArt3 != null : "fx:id=\"lblBackArt3\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
	        assert lblTestoArt3 != null : "fx:id=\"lblTestoArt3\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
	        assert lblDataArticolo3 != null : "fx:id=\"lblDataArticolo3\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
	        assert lblKeywordsAr3 != null : "fx:id=\"lblKeywordsAr3\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
	        assert txtAppNumero3 != null : "fx:id=\"txtAppNumero3\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
	        assert txtFamilyID3 != null : "fx:id=\"txtFamilyID3\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
	        assert txtTit3 != null : "fx:id=\"txtTit3\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
	        assert txtTestoArt3 != null : "fx:id=\"txtTestoArt3\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
	        assert txtDataArt3 != null : "fx:id=\"txtDataArt3\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
	        assert txtKeywordArt3 != null : "fx:id=\"txtKeywordArt3\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
	        assert txtBackArti3 != null : "fx:id=\"txtBackArti3\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
	        assert txtLinkArt3 != null : "fx:id=\"txtLinkArt3\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
	        assert lblLinkArt12 != null : "fx:id=\"lblLinkArt12\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
	        assert lblBackArt12 != null : "fx:id=\"lblBackArt12\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
	        assert lblTestoArt12 != null : "fx:id=\"lblTestoArt12\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
	        assert lblDataArticolo12 != null : "fx:id=\"lblDataArticolo12\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
	        assert lblKeywordsAr12 != null : "fx:id=\"lblKeywordsAr12\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
	        assert txtAppNumero12 != null : "fx:id=\"txtAppNumero12\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
	        assert txtFamilyID12 != null : "fx:id=\"txtFamilyID12\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
	        assert txtTit12 != null : "fx:id=\"txtTit12\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
	        assert txtTestoArt12 != null : "fx:id=\"txtTestoArt12\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
	        assert txtDataArt12 != null : "fx:id=\"txtDataArt12\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
	        assert txtKeywordArt12 != null : "fx:id=\"txtKeywordArt12\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
	        assert txtBackArti12 != null : "fx:id=\"txtBackArti12\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
	        assert txtLinkArt12 != null : "fx:id=\"txtLinkArt12\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
	        assert lblLinkArt21 != null : "fx:id=\"lblLinkArt21\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
	        assert lblBackArt21 != null : "fx:id=\"lblBackArt21\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
	        assert lblTestoArt21 != null : "fx:id=\"lblTestoArt21\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
	        assert lblDataArticolo21 != null : "fx:id=\"lblDataArticolo21\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
	        assert lblKeywordsAr21 != null : "fx:id=\"lblKeywordsAr21\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
	        assert txtAppNumero21 != null : "fx:id=\"txtAppNumero21\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
	        assert txtFamilyID21 != null : "fx:id=\"txtFamilyID21\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
	        assert txtTit21 != null : "fx:id=\"txtTit21\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
	        assert txtTestoArt21 != null : "fx:id=\"txtTestoArt21\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
	        assert txtDataArt21 != null : "fx:id=\"txtDataArt21\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
	        assert txtKeywordArt21 != null : "fx:id=\"txtKeywordArt21\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
	        assert txtBackArti21 != null : "fx:id=\"txtBackArti21\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
	        assert txtLinkArt21 != null : "fx:id=\"txtLinkArt21\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
	        assert lblLinkArt111 != null : "fx:id=\"lblLinkArt111\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
	        assert lblBackArt111 != null : "fx:id=\"lblBackArt111\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
	        assert lblTestoArt111 != null : "fx:id=\"lblTestoArt111\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
	        assert lblDataArticolo111 != null : "fx:id=\"lblDataArticolo111\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
	        assert lblKeywordsAr111 != null : "fx:id=\"lblKeywordsAr111\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
	        assert txtAppNumero111 != null : "fx:id=\"txtAppNumero111\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
	        assert txtFamilyID111 != null : "fx:id=\"txtFamilyID111\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
	        assert txtTit111 != null : "fx:id=\"txtTit111\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
	        assert txtTestoArt111 != null : "fx:id=\"txtTestoArt111\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
	        assert txtDataArt111 != null : "fx:id=\"txtDataArt111\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
	        assert txtKeywordArt111 != null : "fx:id=\"txtKeywordArt111\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
	        assert txtBackArti111 != null : "fx:id=\"txtBackArti111\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
	        assert txtLinkArt111 != null : "fx:id=\"txtLinkArt111\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";

	    }

}
