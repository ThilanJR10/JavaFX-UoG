package application;

import java.io.IOException;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginController {
	@FXML
	private Label lblStatus;
	
	@FXML
	private TextField txtUserName;

	
	@FXML
	private TextField textPassword;

	public void Login(ActionEvent event) throws IOException {
		if (txtUserName.getText().equals("user") && textPassword.getText().equals("pass")){
			lblStatus.setText("Login Sucess");
			Stage primaryStage=new Stage();
			Parent root= FXMLLoader.load(getClass().getResource("/application/Student.fxml"));
			Scene scene = new Scene(root,600,600);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.setTitle("University of Gugsi,no where particular");
			primaryStage.show();
			
			
			
		}else{
			lblStatus.setText("Login Failed");
			
			
			
		}		
	}
}
