package Operatore_BOT_GUI.controller;


	
	import java.net.URL;
	import java.util.ResourceBundle;

import Operatore_BOT_GUI.model.Azienda;
import Operatore_BOT_GUI.model.Model;
import javafx.event.ActionEvent;
	import javafx.fxml.FXML;
	import javafx.scene.control.Button;
	import javafx.scene.control.ChoiceBox;
	import javafx.scene.control.Label;
	import javafx.scene.control.TextArea;
	import javafx.scene.control.TextField;
	import javafx.scene.image.ImageView;

	public class AziendaBrevettoController {

	    @FXML // ResourceBundle that was given to the FXMLLoader
	    private ResourceBundle resources;

	    @FXML // URL location of the FXML file that was given to the FXMLLoader
	    private URL location;

	    @FXML // fx:id="imgComparaangAz"
	    private ImageView imgComparaangAz; // Value injected by FXMLLoader

	    @FXML // fx:id="lblAziendaCompAz"
	    private Label lblAziendaCompAz; // Value injected by FXMLLoader

	    @FXML // fx:id="btnIndBilancioAzBr"
	    private Button btnIndBilancioAzBr; // Value injected by FXMLLoader

	    @FXML // fx:id="btnIndProgettiAzBr"
	    private Button btnIndProgettiAzBr; // Value injected by FXMLLoader

	    @FXML // fx:id="btnIndAppaltiAzBr"
	    private Button btnIndAppaltiAzBr; // Value injected by FXMLLoader

	    @FXML // fx:id="btnIndBrevettiAzBr"
	    private Button btnIndBrevettiAzBr; // Value injected by FXMLLoader

	    @FXML // fx:id="btnIndProdottiAzBr"
	    private Button btnIndProdottiAzBr; // Value injected by FXMLLoader

	    @FXML // fx:id="btnIndArticoliAzBr"
	    private Button btnIndArticoliAzBr; // Value injected by FXMLLoader

	    @FXML // fx:id="btnIndNewsAzBr"
	    private Button btnIndNewsAzBr; // Value injected by FXMLLoader

	    @FXML // fx:id="btnTornaClassificaBr"
	    private Button btnTornaClassificaBr; // Value injected by FXMLLoader

	    @FXML // fx:id="cbxAltraAziendaBr"
	    private ChoiceBox<?> cbxAltraAziendaBr; // Value injected by FXMLLoader

	    @FXML // fx:id="lblAppNumber"
	    private Label lblAppNumber; // Value injected by FXMLLoader

	    @FXML // fx:id="lblFamiId"
	    private Label lblFamiId; // Value injected by FXMLLoader

	    @FXML // fx:id="lblTitolo"
	    private Label lblTitolo; // Value injected by FXMLLoader

	    @FXML // fx:id="lblAssegnatario"
	    private Label lblAssegnatario; // Value injected by FXMLLoader

	    @FXML // fx:id="lblInventori"
	    private Label lblInventori; // Value injected by FXMLLoader

	    @FXML // fx:id="lblData"
	    private Label lblData; // Value injected by FXMLLoader

	    @FXML // fx:id="lblDescrizione"
	    private Label lblDescrizione; // Value injected by FXMLLoader

	    @FXML // fx:id="lblCodClass"
	    private Label lblCodClass; // Value injected by FXMLLoader

	    @FXML // fx:id="txtAppNumero"
	    private TextField txtAppNumero; // Value injected by FXMLLoader

	    @FXML // fx:id="txtFamilyID"
	    private TextField txtFamilyID; // Value injected by FXMLLoader

	    @FXML // fx:id="txtTit"
	    private TextField txtTit; // Value injected by FXMLLoader

	    @FXML // fx:id="txtAssegnee"
	    private TextField txtAssegnee; // Value injected by FXMLLoader

	    @FXML // fx:id="txtInve"
	    private TextField txtInve; // Value injected by FXMLLoader

	    @FXML // fx:id="txtDate"
	    private TextField txtDate; // Value injected by FXMLLoader

	    @FXML // fx:id="txtDescription"
	    private TextArea txtDescription; // Value injected by FXMLLoader

	    @FXML // fx:id="txtCodiceClass"
	    private TextField txtCodiceClass; // Value injected by FXMLLoader

	    @FXML // fx:id="lblAppNumber1"
	    private Label lblAppNumber1; // Value injected by FXMLLoader

	    @FXML // fx:id="lblFamiId1"
	    private Label lblFamiId1; // Value injected by FXMLLoader

	    @FXML // fx:id="lblTitolo1"
	    private Label lblTitolo1; // Value injected by FXMLLoader

	    @FXML // fx:id="lblAssegnatario1"
	    private Label lblAssegnatario1; // Value injected by FXMLLoader

	    @FXML // fx:id="lblInventori1"
	    private Label lblInventori1; // Value injected by FXMLLoader

	    @FXML // fx:id="lblData1"
	    private Label lblData1; // Value injected by FXMLLoader

	    @FXML // fx:id="lblDescrizione1"
	    private Label lblDescrizione1; // Value injected by FXMLLoader

	    @FXML // fx:id="lblCodClass1"
	    private Label lblCodClass1; // Value injected by FXMLLoader

	    @FXML // fx:id="txtAppNumero1"
	    private TextField txtAppNumero1; // Value injected by FXMLLoader

	    @FXML // fx:id="txtFamilyID1"
	    private TextField txtFamilyID1; // Value injected by FXMLLoader

	    @FXML // fx:id="txtTit1"
	    private TextField txtTit1; // Value injected by FXMLLoader

	    @FXML // fx:id="txtAssegnee1"
	    private TextField txtAssegnee1; // Value injected by FXMLLoader

	    @FXML // fx:id="txtInve1"
	    private TextField txtInve1; // Value injected by FXMLLoader

	    @FXML // fx:id="txtDate1"
	    private TextField txtDate1; // Value injected by FXMLLoader

	    @FXML // fx:id="txtDescription1"
	    private TextArea txtDescription1; // Value injected by FXMLLoader

	    @FXML // fx:id="txtCodiceClass1"
	    private TextField txtCodiceClass1; // Value injected by FXMLLoader

	    @FXML // fx:id="lblAppNumber2"
	    private Label lblAppNumber2; // Value injected by FXMLLoader

	    @FXML // fx:id="lblFamiId2"
	    private Label lblFamiId2; // Value injected by FXMLLoader

	    @FXML // fx:id="lblTitolo2"
	    private Label lblTitolo2; // Value injected by FXMLLoader

	    @FXML // fx:id="lblAssegnatario2"
	    private Label lblAssegnatario2; // Value injected by FXMLLoader

	    @FXML // fx:id="lblInventori2"
	    private Label lblInventori2; // Value injected by FXMLLoader

	    @FXML // fx:id="lblData2"
	    private Label lblData2; // Value injected by FXMLLoader

	    @FXML // fx:id="lblDescrizione2"
	    private Label lblDescrizione2; // Value injected by FXMLLoader

	    @FXML // fx:id="lblCodClass2"
	    private Label lblCodClass2; // Value injected by FXMLLoader

	    @FXML // fx:id="txtAppNumero2"
	    private TextField txtAppNumero2; // Value injected by FXMLLoader

	    @FXML // fx:id="txtFamilyID2"
	    private TextField txtFamilyID2; // Value injected by FXMLLoader

	    @FXML // fx:id="txtTit2"
	    private TextField txtTit2; // Value injected by FXMLLoader

	    @FXML // fx:id="txtAssegnee2"
	    private TextField txtAssegnee2; // Value injected by FXMLLoader

	    @FXML // fx:id="txtInve2"
	    private TextField txtInve2; // Value injected by FXMLLoader

	    @FXML // fx:id="txtDate2"
	    private TextField txtDate2; // Value injected by FXMLLoader

	    @FXML // fx:id="txtDescription2"
	    private TextArea txtDescription2; // Value injected by FXMLLoader

	    @FXML // fx:id="txtCodiceClass2"
	    private TextField txtCodiceClass2; // Value injected by FXMLLoader

	    @FXML // fx:id="lblAppNumber11"
	    private Label lblAppNumber11; // Value injected by FXMLLoader

	    @FXML // fx:id="lblFamiId11"
	    private Label lblFamiId11; // Value injected by FXMLLoader

	    @FXML // fx:id="lblTitolo11"
	    private Label lblTitolo11; // Value injected by FXMLLoader

	    @FXML // fx:id="lblAssegnatario11"
	    private Label lblAssegnatario11; // Value injected by FXMLLoader

	    @FXML // fx:id="lblInventori11"
	    private Label lblInventori11; // Value injected by FXMLLoader

	    @FXML // fx:id="lblData11"
	    private Label lblData11; // Value injected by FXMLLoader

	    @FXML // fx:id="lblDescrizione11"
	    private Label lblDescrizione11; // Value injected by FXMLLoader

	    @FXML // fx:id="lblCodClass11"
	    private Label lblCodClass11; // Value injected by FXMLLoader

	    @FXML // fx:id="txtAppNumero11"
	    private TextField txtAppNumero11; // Value injected by FXMLLoader

	    @FXML // fx:id="txtFamilyID11"
	    private TextField txtFamilyID11; // Value injected by FXMLLoader

	    @FXML // fx:id="txtTit11"
	    private TextField txtTit11; // Value injected by FXMLLoader

	    @FXML // fx:id="txtAssegnee11"
	    private TextField txtAssegnee11; // Value injected by FXMLLoader

	    @FXML // fx:id="txtInve11"
	    private TextField txtInve11; // Value injected by FXMLLoader

	    @FXML // fx:id="txtDate11"
	    private TextField txtDate11; // Value injected by FXMLLoader

	    @FXML // fx:id="txtDescription11"
	    private TextArea txtDescription11; // Value injected by FXMLLoader

	    @FXML // fx:id="txtCodiceClass11"
	    private TextField txtCodiceClass11; // Value injected by FXMLLoader

	    @FXML // fx:id="lblAppNumber3"
	    private Label lblAppNumber3; // Value injected by FXMLLoader

	    @FXML // fx:id="lblFamiId3"
	    private Label lblFamiId3; // Value injected by FXMLLoader

	    @FXML // fx:id="lblTitolo3"
	    private Label lblTitolo3; // Value injected by FXMLLoader

	    @FXML // fx:id="lblAssegnatario3"
	    private Label lblAssegnatario3; // Value injected by FXMLLoader

	    @FXML // fx:id="lblInventori3"
	    private Label lblInventori3; // Value injected by FXMLLoader

	    @FXML // fx:id="lblData3"
	    private Label lblData3; // Value injected by FXMLLoader

	    @FXML // fx:id="lblDescrizione3"
	    private Label lblDescrizione3; // Value injected by FXMLLoader

	    @FXML // fx:id="lblCodClass3"
	    private Label lblCodClass3; // Value injected by FXMLLoader

	    @FXML // fx:id="txtAppNumero3"
	    private TextField txtAppNumero3; // Value injected by FXMLLoader

	    @FXML // fx:id="txtFamilyID3"
	    private TextField txtFamilyID3; // Value injected by FXMLLoader

	    @FXML // fx:id="txtTit3"
	    private TextField txtTit3; // Value injected by FXMLLoader

	    @FXML // fx:id="txtAssegnee3"
	    private TextField txtAssegnee3; // Value injected by FXMLLoader

	    @FXML // fx:id="txtInve3"
	    private TextField txtInve3; // Value injected by FXMLLoader

	    @FXML // fx:id="txtDate3"
	    private TextField txtDate3; // Value injected by FXMLLoader

	    @FXML // fx:id="txtDescription3"
	    private TextArea txtDescription3; // Value injected by FXMLLoader

	    @FXML // fx:id="txtCodiceClass3"
	    private TextField txtCodiceClass3; // Value injected by FXMLLoader

	    @FXML // fx:id="lblAppNumber12"
	    private Label lblAppNumber12; // Value injected by FXMLLoader

	    @FXML // fx:id="lblFamiId12"
	    private Label lblFamiId12; // Value injected by FXMLLoader

	    @FXML // fx:id="lblTitolo12"
	    private Label lblTitolo12; // Value injected by FXMLLoader

	    @FXML // fx:id="lblAssegnatario12"
	    private Label lblAssegnatario12; // Value injected by FXMLLoader

	    @FXML // fx:id="lblInventori12"
	    private Label lblInventori12; // Value injected by FXMLLoader

	    @FXML // fx:id="lblData12"
	    private Label lblData12; // Value injected by FXMLLoader

	    @FXML // fx:id="lblDescrizione12"
	    private Label lblDescrizione12; // Value injected by FXMLLoader

	    @FXML // fx:id="lblCodClass12"
	    private Label lblCodClass12; // Value injected by FXMLLoader

	    @FXML // fx:id="txtAppNumero12"
	    private TextField txtAppNumero12; // Value injected by FXMLLoader

	    @FXML // fx:id="txtFamilyID12"
	    private TextField txtFamilyID12; // Value injected by FXMLLoader

	    @FXML // fx:id="txtTit12"
	    private TextField txtTit12; // Value injected by FXMLLoader

	    @FXML // fx:id="txtAssegnee12"
	    private TextField txtAssegnee12; // Value injected by FXMLLoader

	    @FXML // fx:id="txtInve12"
	    private TextField txtInve12; // Value injected by FXMLLoader

	    @FXML // fx:id="txtDate12"
	    private TextField txtDate12; // Value injected by FXMLLoader

	    @FXML // fx:id="txtDescription12"
	    private TextArea txtDescription12; // Value injected by FXMLLoader

	    @FXML // fx:id="txtCodiceClass12"
	    private TextField txtCodiceClass12; // Value injected by FXMLLoader

	    @FXML // fx:id="lblAppNumber21"
	    private Label lblAppNumber21; // Value injected by FXMLLoader

	    @FXML // fx:id="lblFamiId21"
	    private Label lblFamiId21; // Value injected by FXMLLoader

	    @FXML // fx:id="lblTitolo21"
	    private Label lblTitolo21; // Value injected by FXMLLoader

	    @FXML // fx:id="lblAssegnatario21"
	    private Label lblAssegnatario21; // Value injected by FXMLLoader

	    @FXML // fx:id="lblInventori21"
	    private Label lblInventori21; // Value injected by FXMLLoader

	    @FXML // fx:id="lblData21"
	    private Label lblData21; // Value injected by FXMLLoader

	    @FXML // fx:id="lblDescrizione21"
	    private Label lblDescrizione21; // Value injected by FXMLLoader

	    @FXML // fx:id="lblCodClass21"
	    private Label lblCodClass21; // Value injected by FXMLLoader

	    @FXML // fx:id="txtAppNumero21"
	    private TextField txtAppNumero21; // Value injected by FXMLLoader

	    @FXML // fx:id="txtFamilyID21"
	    private TextField txtFamilyID21; // Value injected by FXMLLoader

	    @FXML // fx:id="txtTit21"
	    private TextField txtTit21; // Value injected by FXMLLoader

	    @FXML // fx:id="txtAssegnee21"
	    private TextField txtAssegnee21; // Value injected by FXMLLoader

	    @FXML // fx:id="txtInve21"
	    private TextField txtInve21; // Value injected by FXMLLoader

	    @FXML // fx:id="txtDate21"
	    private TextField txtDate21; // Value injected by FXMLLoader

	    @FXML // fx:id="txtDescription21"
	    private TextArea txtDescription21; // Value injected by FXMLLoader

	    @FXML // fx:id="txtCodiceClass21"
	    private TextField txtCodiceClass21; // Value injected by FXMLLoader

	    @FXML // fx:id="lblAppNumber111"
	    private Label lblAppNumber111; // Value injected by FXMLLoader

	    @FXML // fx:id="lblFamiId111"
	    private Label lblFamiId111; // Value injected by FXMLLoader

	    @FXML // fx:id="lblTitolo111"
	    private Label lblTitolo111; // Value injected by FXMLLoader

	    @FXML // fx:id="lblAssegnatario111"
	    private Label lblAssegnatario111; // Value injected by FXMLLoader

	    @FXML // fx:id="lblInventori111"
	    private Label lblInventori111; // Value injected by FXMLLoader

	    @FXML // fx:id="lblData111"
	    private Label lblData111; // Value injected by FXMLLoader

	    @FXML // fx:id="lblDescrizione111"
	    private Label lblDescrizione111; // Value injected by FXMLLoader

	    @FXML // fx:id="lblCodClass111"
	    private Label lblCodClass111; // Value injected by FXMLLoader

	    @FXML // fx:id="txtAppNumero111"
	    private TextField txtAppNumero111; // Value injected by FXMLLoader

	    @FXML // fx:id="txtFamilyID111"
	    private TextField txtFamilyID111; // Value injected by FXMLLoader

	    @FXML // fx:id="txtTit111"
	    private TextField txtTit111; // Value injected by FXMLLoader

	    @FXML // fx:id="txtAssegnee111"
	    private TextField txtAssegnee111; // Value injected by FXMLLoader

	    @FXML // fx:id="txtInve111"
	    private TextField txtInve111; // Value injected by FXMLLoader

	    @FXML // fx:id="txtDate111"
	    private TextField txtDate111; // Value injected by FXMLLoader

	    @FXML // fx:id="txtDescription111"
	    private TextArea txtDescription111; // Value injected by FXMLLoader

	    @FXML // fx:id="txtCodiceClass111"
	    private TextField txtCodiceClass111; // Value injected by FXMLLoader

	    private Model model;
	    
	    public void setModel(Model model) {
	    	this.model = model ;
	    	Azienda azienda = model.getAzienda();
	    	
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
	        assert imgComparaangAz != null : "fx:id=\"imgComparaangAz\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
	        assert lblAziendaCompAz != null : "fx:id=\"lblAziendaCompAz\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
	        assert btnIndBilancioAzBr != null : "fx:id=\"btnIndBilancioAzBr\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
	        assert btnIndProgettiAzBr != null : "fx:id=\"btnIndProgettiAzBr\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
	        assert btnIndAppaltiAzBr != null : "fx:id=\"btnIndAppaltiAzBr\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
	        assert btnIndBrevettiAzBr != null : "fx:id=\"btnIndBrevettiAzBr\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
	        assert btnIndProdottiAzBr != null : "fx:id=\"btnIndProdottiAzBr\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
	        assert btnIndArticoliAzBr != null : "fx:id=\"btnIndArticoliAzBr\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
	        assert btnIndNewsAzBr != null : "fx:id=\"btnIndNewsAzBr\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
	        assert btnTornaClassificaBr != null : "fx:id=\"btnTornaClassificaBr\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
	        assert cbxAltraAziendaBr != null : "fx:id=\"cbxAltraAziendaBr\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
	        assert lblAppNumber != null : "fx:id=\"lblAppNumber\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
	        assert lblFamiId != null : "fx:id=\"lblFamiId\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
	        assert lblTitolo != null : "fx:id=\"lblTitolo\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
	        assert lblAssegnatario != null : "fx:id=\"lblAssegnatario\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
	        assert lblInventori != null : "fx:id=\"lblInventori\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
	        assert lblData != null : "fx:id=\"lblData\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
	        assert lblDescrizione != null : "fx:id=\"lblDescrizione\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
	        assert lblCodClass != null : "fx:id=\"lblCodClass\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
	        assert txtAppNumero != null : "fx:id=\"txtAppNumero\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
	        assert txtFamilyID != null : "fx:id=\"txtFamilyID\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
	        assert txtTit != null : "fx:id=\"txtTit\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
	        assert txtAssegnee != null : "fx:id=\"txtAssegnee\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
	        assert txtInve != null : "fx:id=\"txtInve\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
	        assert txtDate != null : "fx:id=\"txtDate\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
	        assert txtDescription != null : "fx:id=\"txtDescription\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
	        assert txtCodiceClass != null : "fx:id=\"txtCodiceClass\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
	        assert lblAppNumber1 != null : "fx:id=\"lblAppNumber1\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
	        assert lblFamiId1 != null : "fx:id=\"lblFamiId1\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
	        assert lblTitolo1 != null : "fx:id=\"lblTitolo1\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
	        assert lblAssegnatario1 != null : "fx:id=\"lblAssegnatario1\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
	        assert lblInventori1 != null : "fx:id=\"lblInventori1\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
	        assert lblData1 != null : "fx:id=\"lblData1\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
	        assert lblDescrizione1 != null : "fx:id=\"lblDescrizione1\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
	        assert lblCodClass1 != null : "fx:id=\"lblCodClass1\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
	        assert txtAppNumero1 != null : "fx:id=\"txtAppNumero1\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
	        assert txtFamilyID1 != null : "fx:id=\"txtFamilyID1\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
	        assert txtTit1 != null : "fx:id=\"txtTit1\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
	        assert txtAssegnee1 != null : "fx:id=\"txtAssegnee1\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
	        assert txtInve1 != null : "fx:id=\"txtInve1\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
	        assert txtDate1 != null : "fx:id=\"txtDate1\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
	        assert txtDescription1 != null : "fx:id=\"txtDescription1\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
	        assert txtCodiceClass1 != null : "fx:id=\"txtCodiceClass1\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
	        assert lblAppNumber2 != null : "fx:id=\"lblAppNumber2\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
	        assert lblFamiId2 != null : "fx:id=\"lblFamiId2\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
	        assert lblTitolo2 != null : "fx:id=\"lblTitolo2\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
	        assert lblAssegnatario2 != null : "fx:id=\"lblAssegnatario2\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
	        assert lblInventori2 != null : "fx:id=\"lblInventori2\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
	        assert lblData2 != null : "fx:id=\"lblData2\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
	        assert lblDescrizione2 != null : "fx:id=\"lblDescrizione2\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
	        assert lblCodClass2 != null : "fx:id=\"lblCodClass2\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
	        assert txtAppNumero2 != null : "fx:id=\"txtAppNumero2\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
	        assert txtFamilyID2 != null : "fx:id=\"txtFamilyID2\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
	        assert txtTit2 != null : "fx:id=\"txtTit2\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
	        assert txtAssegnee2 != null : "fx:id=\"txtAssegnee2\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
	        assert txtInve2 != null : "fx:id=\"txtInve2\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
	        assert txtDate2 != null : "fx:id=\"txtDate2\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
	        assert txtDescription2 != null : "fx:id=\"txtDescription2\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
	        assert txtCodiceClass2 != null : "fx:id=\"txtCodiceClass2\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
	        assert lblAppNumber11 != null : "fx:id=\"lblAppNumber11\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
	        assert lblFamiId11 != null : "fx:id=\"lblFamiId11\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
	        assert lblTitolo11 != null : "fx:id=\"lblTitolo11\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
	        assert lblAssegnatario11 != null : "fx:id=\"lblAssegnatario11\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
	        assert lblInventori11 != null : "fx:id=\"lblInventori11\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
	        assert lblData11 != null : "fx:id=\"lblData11\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
	        assert lblDescrizione11 != null : "fx:id=\"lblDescrizione11\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
	        assert lblCodClass11 != null : "fx:id=\"lblCodClass11\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
	        assert txtAppNumero11 != null : "fx:id=\"txtAppNumero11\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
	        assert txtFamilyID11 != null : "fx:id=\"txtFamilyID11\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
	        assert txtTit11 != null : "fx:id=\"txtTit11\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
	        assert txtAssegnee11 != null : "fx:id=\"txtAssegnee11\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
	        assert txtInve11 != null : "fx:id=\"txtInve11\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
	        assert txtDate11 != null : "fx:id=\"txtDate11\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
	        assert txtDescription11 != null : "fx:id=\"txtDescription11\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
	        assert txtCodiceClass11 != null : "fx:id=\"txtCodiceClass11\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
	        assert lblAppNumber3 != null : "fx:id=\"lblAppNumber3\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
	        assert lblFamiId3 != null : "fx:id=\"lblFamiId3\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
	        assert lblTitolo3 != null : "fx:id=\"lblTitolo3\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
	        assert lblAssegnatario3 != null : "fx:id=\"lblAssegnatario3\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
	        assert lblInventori3 != null : "fx:id=\"lblInventori3\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
	        assert lblData3 != null : "fx:id=\"lblData3\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
	        assert lblDescrizione3 != null : "fx:id=\"lblDescrizione3\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
	        assert lblCodClass3 != null : "fx:id=\"lblCodClass3\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
	        assert txtAppNumero3 != null : "fx:id=\"txtAppNumero3\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
	        assert txtFamilyID3 != null : "fx:id=\"txtFamilyID3\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
	        assert txtTit3 != null : "fx:id=\"txtTit3\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
	        assert txtAssegnee3 != null : "fx:id=\"txtAssegnee3\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
	        assert txtInve3 != null : "fx:id=\"txtInve3\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
	        assert txtDate3 != null : "fx:id=\"txtDate3\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
	        assert txtDescription3 != null : "fx:id=\"txtDescription3\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
	        assert txtCodiceClass3 != null : "fx:id=\"txtCodiceClass3\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
	        assert lblAppNumber12 != null : "fx:id=\"lblAppNumber12\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
	        assert lblFamiId12 != null : "fx:id=\"lblFamiId12\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
	        assert lblTitolo12 != null : "fx:id=\"lblTitolo12\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
	        assert lblAssegnatario12 != null : "fx:id=\"lblAssegnatario12\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
	        assert lblInventori12 != null : "fx:id=\"lblInventori12\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
	        assert lblData12 != null : "fx:id=\"lblData12\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
	        assert lblDescrizione12 != null : "fx:id=\"lblDescrizione12\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
	        assert lblCodClass12 != null : "fx:id=\"lblCodClass12\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
	        assert txtAppNumero12 != null : "fx:id=\"txtAppNumero12\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
	        assert txtFamilyID12 != null : "fx:id=\"txtFamilyID12\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
	        assert txtTit12 != null : "fx:id=\"txtTit12\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
	        assert txtAssegnee12 != null : "fx:id=\"txtAssegnee12\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
	        assert txtInve12 != null : "fx:id=\"txtInve12\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
	        assert txtDate12 != null : "fx:id=\"txtDate12\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
	        assert txtDescription12 != null : "fx:id=\"txtDescription12\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
	        assert txtCodiceClass12 != null : "fx:id=\"txtCodiceClass12\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
	        assert lblAppNumber21 != null : "fx:id=\"lblAppNumber21\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
	        assert lblFamiId21 != null : "fx:id=\"lblFamiId21\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
	        assert lblTitolo21 != null : "fx:id=\"lblTitolo21\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
	        assert lblAssegnatario21 != null : "fx:id=\"lblAssegnatario21\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
	        assert lblInventori21 != null : "fx:id=\"lblInventori21\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
	        assert lblData21 != null : "fx:id=\"lblData21\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
	        assert lblDescrizione21 != null : "fx:id=\"lblDescrizione21\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
	        assert lblCodClass21 != null : "fx:id=\"lblCodClass21\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
	        assert txtAppNumero21 != null : "fx:id=\"txtAppNumero21\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
	        assert txtFamilyID21 != null : "fx:id=\"txtFamilyID21\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
	        assert txtTit21 != null : "fx:id=\"txtTit21\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
	        assert txtAssegnee21 != null : "fx:id=\"txtAssegnee21\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
	        assert txtInve21 != null : "fx:id=\"txtInve21\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
	        assert txtDate21 != null : "fx:id=\"txtDate21\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
	        assert txtDescription21 != null : "fx:id=\"txtDescription21\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
	        assert txtCodiceClass21 != null : "fx:id=\"txtCodiceClass21\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
	        assert lblAppNumber111 != null : "fx:id=\"lblAppNumber111\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
	        assert lblFamiId111 != null : "fx:id=\"lblFamiId111\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
	        assert lblTitolo111 != null : "fx:id=\"lblTitolo111\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
	        assert lblAssegnatario111 != null : "fx:id=\"lblAssegnatario111\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
	        assert lblInventori111 != null : "fx:id=\"lblInventori111\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
	        assert lblData111 != null : "fx:id=\"lblData111\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
	        assert lblDescrizione111 != null : "fx:id=\"lblDescrizione111\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
	        assert lblCodClass111 != null : "fx:id=\"lblCodClass111\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
	        assert txtAppNumero111 != null : "fx:id=\"txtAppNumero111\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
	        assert txtFamilyID111 != null : "fx:id=\"txtFamilyID111\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
	        assert txtTit111 != null : "fx:id=\"txtTit111\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
	        assert txtAssegnee111 != null : "fx:id=\"txtAssegnee111\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
	        assert txtInve111 != null : "fx:id=\"txtInve111\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
	        assert txtDate111 != null : "fx:id=\"txtDate111\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
	        assert txtDescription111 != null : "fx:id=\"txtDescription111\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";
	        assert txtCodiceClass111 != null : "fx:id=\"txtCodiceClass111\" was not injected: check your FXML file 'Azienda_Brevetto.fxml'.";

	    }
	

}
