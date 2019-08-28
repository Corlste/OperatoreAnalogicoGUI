package application;

import java.io.IOException;
import java.net.URL;
import java.util.LinkedList;
import java.util.ResourceBundle;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class SampleController implements Initializable{
	
	@FXML
	BorderPane scene;
	
	@FXML
	Stage stage;
	
	@FXML
    public void doClick(ActionEvent event) throws IOException {
		ObservableList list = scene.getChildren();
    	System.out.println(list.toString());
//    	BorderPane pane = (BorderPane)FXMLLoader.load(getClass().getResource("Sample2.fxml"));
    	Parent parent =FXMLLoader.load(getClass().getResource("Sample2.fxml"));
    	Scene scene2 = new Scene(parent);
    	Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
    	
    	window.setScene(scene2);
    	window.show();
    	
    	
//    	scene.getChildren().setAll(pane);
    	
    	ObservableList list2 = scene.getChildren();
    	System.out.println(list2.toString());
    	
    	
    	
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}

	

}
