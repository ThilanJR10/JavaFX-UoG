package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class StudentController {
	public void lvl4(ActionEvent event)throws Exception{
		Parent root= FXMLLoader.load(getClass().getResource("GetStudent.fxml"));
		Scene scene = new Scene(root);
		Stage lvl4Stage = new Stage();
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		lvl4Stage.setScene(scene);
		lvl4Stage.setTitle("University of Gugsi,no where particular");
		lvl4Stage.show();
	}
}
