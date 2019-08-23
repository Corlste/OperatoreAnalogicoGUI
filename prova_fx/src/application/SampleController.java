package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class SampleController implements Initializable{
	
	@FXML
	BorderPane scene1;
	
	@FXML
    void doClick(ActionEvent event) throws IOException {
		
    	BorderPane pane = (BorderPane)FXMLLoader.load(getClass().getResource("Sample2.fxml"));
//    	Scene scene = new Scene(pane);
//    	scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
//    	stage.setScene(scene);
//    	stage.show();
    	scene1.getChildren().setAll(pane);
  
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}

	

}
