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

	public class ProgettiController {

	    @FXML // ResourceBundle that was given to the FXMLLoader
	    private ResourceBundle resources;

	    @FXML // URL location of the FXML file that was given to the FXMLLoader
	    private URL location;

	    @FXML // fx:id="imgComparaangAzPj"
	    private ImageView imgComparaangAzPj; // Value injected by FXMLLoader

	    @FXML // fx:id="lblAziendaCompAzPj"
	    private Label lblAziendaCompAzPj; // Value injected by FXMLLoader

	    @FXML // fx:id="btnInfoAzPr"
	    private Button btnInfoAzPr; // Value injected by FXMLLoader

	    @FXML // fx:id="btnIndBilancioAzPj"
	    private Button btnIndBilancioAzPj; // Value injected by FXMLLoader

	    @FXML // fx:id="btnIndBrevettiAzBrPj"
	    private Button btnIndBrevettiAzBrPj; // Value injected by FXMLLoader

	    @FXML // fx:id="btnIndAppaltiAzBrPj"
	    private Button btnIndAppaltiAzBrPj; // Value injected by FXMLLoader

	    @FXML // fx:id="btnProgettiPr"
	    private Button btnProgettiPr; // Value injected by FXMLLoader

	    @FXML // fx:id="btnIndProdottiAzBrPj"
	    private Button btnIndProdottiAzBrPj; // Value injected by FXMLLoader

	    @FXML // fx:id="btnIndArticoliAzBrPj"
	    private Button btnIndArticoliAzBrPj; // Value injected by FXMLLoader

	    @FXML // fx:id="btnIndNewsAzPj"
	    private Button btnIndNewsAzPj; // Value injected by FXMLLoader

	    @FXML // fx:id="btnTornaClassificaPj"
	    private Button btnTornaClassificaPj; // Value injected by FXMLLoader

	    @FXML // fx:id="cbxAltraAziendaPj"
	    private ChoiceBox<?> cbxAltraAziendaPj; // Value injected by FXMLLoader

	    @FXML // fx:id="lblFunding"
	    private GridPane lblFunding; // Value injected by FXMLLoader

	    @FXML // fx:id="lblProjectRcn"
	    private Label lblProjectRcn; // Value injected by FXMLLoader

	    @FXML // fx:id="lblStatus"
	    private Label lblStatus; // Value injected by FXMLLoader

	    @FXML // fx:id="lblProgramme"
	    private Label lblProgramme; // Value injected by FXMLLoader

	    @FXML // fx:id="lblStartDate"
	    private Label lblStartDate; // Value injected by FXMLLoader

	    @FXML // fx:id="lblEndDate"
	    private Label lblEndDate; // Value injected by FXMLLoader

	    @FXML // fx:id="lblObjective"
	    private Label lblObjective; // Value injected by FXMLLoader

	    @FXML // fx:id="lblTotalCostPj"
	    private Label lblTotalCostPj; // Value injected by FXMLLoader

	    @FXML // fx:id="lblEuropeanContr"
	    private Label lblEuropeanContr; // Value injected by FXMLLoader

	    @FXML // fx:id="lblEuropeanTotal"
	    private Label lblEuropeanTotal; // Value injected by FXMLLoader

	    @FXML // fx:id="lblEmail"
	    private Label lblEmail; // Value injected by FXMLLoader

	    @FXML // fx:id="lblCoordinator"
	    private Label lblCoordinator; // Value injected by FXMLLoader

	    @FXML // fx:id="lblOther"
	    private Label lblOther; // Value injected by FXMLLoader

	    @FXML // fx:id="txtProRcn"
	    private TextField txtProRcn; // Value injected by FXMLLoader

	    @FXML // fx:id="txtStatus"
	    private TextField txtStatus; // Value injected by FXMLLoader

	    @FXML // fx:id="txtProgrammr"
	    private TextField txtProgrammr; // Value injected by FXMLLoader

	    @FXML // fx:id="txtStartDate"
	    private TextField txtStartDate; // Value injected by FXMLLoader

	    @FXML // fx:id="txtEndDate"
	    private TextField txtEndDate; // Value injected by FXMLLoader

	    @FXML // fx:id="txtTotCostPj"
	    private TextField txtTotCostPj; // Value injected by FXMLLoader

	    @FXML // fx:id="txtEurTotal"
	    private TextField txtEurTotal; // Value injected by FXMLLoader

	    @FXML // fx:id="txtFundingScheme"
	    private TextField txtFundingScheme; // Value injected by FXMLLoader

	    @FXML // fx:id="txtCoordinator"
	    private TextField txtCoordinator; // Value injected by FXMLLoader

	    @FXML // fx:id="txtOther"
	    private TextField txtOther; // Value injected by FXMLLoader

	    @FXML // fx:id="txtEuContr"
	    private TextField txtEuContr; // Value injected by FXMLLoader

	    @FXML // fx:id="txtObjective"
	    private TextArea txtObjective; // Value injected by FXMLLoader
	    

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
	        assert imgComparaangAzPj != null : "fx:id=\"imgComparaangAzPj\" was not injected: check your FXML file 'Progetti_Azienda.fxml'.";
	        assert lblAziendaCompAzPj != null : "fx:id=\"lblAziendaCompAzPj\" was not injected: check your FXML file 'Progetti_Azienda.fxml'.";
	        assert btnInfoAzPr != null : "fx:id=\"btnInfoAzPr\" was not injected: check your FXML file 'Progetti_Azienda.fxml'.";
	        assert btnIndBilancioAzPj != null : "fx:id=\"btnIndBilancioAzPj\" was not injected: check your FXML file 'Progetti_Azienda.fxml'.";
	        assert btnIndBrevettiAzBrPj != null : "fx:id=\"btnIndBrevettiAzBrPj\" was not injected: check your FXML file 'Progetti_Azienda.fxml'.";
	        assert btnIndAppaltiAzBrPj != null : "fx:id=\"btnIndAppaltiAzBrPj\" was not injected: check your FXML file 'Progetti_Azienda.fxml'.";
	        assert btnProgettiPr != null : "fx:id=\"btnProgettiPr\" was not injected: check your FXML file 'Progetti_Azienda.fxml'.";
	        assert btnIndProdottiAzBrPj != null : "fx:id=\"btnIndProdottiAzBrPj\" was not injected: check your FXML file 'Progetti_Azienda.fxml'.";
	        assert btnIndArticoliAzBrPj != null : "fx:id=\"btnIndArticoliAzBrPj\" was not injected: check your FXML file 'Progetti_Azienda.fxml'.";
	        assert btnIndNewsAzPj != null : "fx:id=\"btnIndNewsAzPj\" was not injected: check your FXML file 'Progetti_Azienda.fxml'.";
	        assert btnTornaClassificaPj != null : "fx:id=\"btnTornaClassificaPj\" was not injected: check your FXML file 'Progetti_Azienda.fxml'.";
	        assert cbxAltraAziendaPj != null : "fx:id=\"cbxAltraAziendaPj\" was not injected: check your FXML file 'Progetti_Azienda.fxml'.";
	        assert lblFunding != null : "fx:id=\"lblFunding\" was not injected: check your FXML file 'Progetti_Azienda.fxml'.";
	        assert lblProjectRcn != null : "fx:id=\"lblProjectRcn\" was not injected: check your FXML file 'Progetti_Azienda.fxml'.";
	        assert lblStatus != null : "fx:id=\"lblStatus\" was not injected: check your FXML file 'Progetti_Azienda.fxml'.";
	        assert lblProgramme != null : "fx:id=\"lblProgramme\" was not injected: check your FXML file 'Progetti_Azienda.fxml'.";
	        assert lblStartDate != null : "fx:id=\"lblStartDate\" was not injected: check your FXML file 'Progetti_Azienda.fxml'.";
	        assert lblEndDate != null : "fx:id=\"lblEndDate\" was not injected: check your FXML file 'Progetti_Azienda.fxml'.";
	        assert lblObjective != null : "fx:id=\"lblObjective\" was not injected: check your FXML file 'Progetti_Azienda.fxml'.";
	        assert lblTotalCostPj != null : "fx:id=\"lblTotalCostPj\" was not injected: check your FXML file 'Progetti_Azienda.fxml'.";
	        assert lblEuropeanContr != null : "fx:id=\"lblEuropeanContr\" was not injected: check your FXML file 'Progetti_Azienda.fxml'.";
	        assert lblEuropeanTotal != null : "fx:id=\"lblEuropeanTotal\" was not injected: check your FXML file 'Progetti_Azienda.fxml'.";
	        assert lblEmail != null : "fx:id=\"lblEmail\" was not injected: check your FXML file 'Progetti_Azienda.fxml'.";
	        assert lblCoordinator != null : "fx:id=\"lblCoordinator\" was not injected: check your FXML file 'Progetti_Azienda.fxml'.";
	        assert lblOther != null : "fx:id=\"lblOther\" was not injected: check your FXML file 'Progetti_Azienda.fxml'.";
	        assert txtProRcn != null : "fx:id=\"txtProRcn\" was not injected: check your FXML file 'Progetti_Azienda.fxml'.";
	        assert txtStatus != null : "fx:id=\"txtStatus\" was not injected: check your FXML file 'Progetti_Azienda.fxml'.";
	        assert txtProgrammr != null : "fx:id=\"txtProgrammr\" was not injected: check your FXML file 'Progetti_Azienda.fxml'.";
	        assert txtStartDate != null : "fx:id=\"txtStartDate\" was not injected: check your FXML file 'Progetti_Azienda.fxml'.";
	        assert txtEndDate != null : "fx:id=\"txtEndDate\" was not injected: check your FXML file 'Progetti_Azienda.fxml'.";
	        assert txtTotCostPj != null : "fx:id=\"txtTotCostPj\" was not injected: check your FXML file 'Progetti_Azienda.fxml'.";
	        assert txtEurTotal != null : "fx:id=\"txtEurTotal\" was not injected: check your FXML file 'Progetti_Azienda.fxml'.";
	        assert txtFundingScheme != null : "fx:id=\"txtFundingScheme\" was not injected: check your FXML file 'Progetti_Azienda.fxml'.";
	        assert txtCoordinator != null : "fx:id=\"txtCoordinator\" was not injected: check your FXML file 'Progetti_Azienda.fxml'.";
	        assert txtOther != null : "fx:id=\"txtOther\" was not injected: check your FXML file 'Progetti_Azienda.fxml'.";
	        assert txtEuContr != null : "fx:id=\"txtEuContr\" was not injected: check your FXML file 'Progetti_Azienda.fxml'.";
	        assert txtObjective != null : "fx:id=\"txtObjective\" was not injected: check your FXML file 'Progetti_Azienda.fxml'.";

	    }


}
