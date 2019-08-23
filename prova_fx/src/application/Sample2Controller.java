package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.BorderPane;

public class Sample2Controller {

	@FXML
	BorderPane scene2;
	
	@FXML
	void doClick2(ActionEvent event) throws IOException {
		BorderPane pane = (BorderPane)FXMLLoader.load(getClass().getResource("Sample1.fxml"));
		scene2.getChildren().setAll(pane);
	}
}
