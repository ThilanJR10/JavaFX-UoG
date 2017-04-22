package application;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import org.omg.CORBA.PRIVATE_MEMBER;









import com.sun.javafx.scene.layout.region.Margins.Converter;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Level4Controller implements Initializable {
	 @FXML
	private Label Mod1Result;
	 @FXML
	private Label Mod1Marks;
	 @FXML
	private TextField mod1paper1;	 
	 @FXML
	private TextField mod1paper2;
	 
	 @FXML
	private Label Mod2Result;
	@FXML
	private Label Mod2Marks;
	@FXML
	private TextField mod2paper1;	 
	@FXML
	private TextField mod2paper2;
	
	@FXML
	private Label Mod3Result;
	@FXML
	private Label Mod3Marks;
	@FXML
	private TextField mod3paper1;	 
	@FXML
	private TextField mod3paper2;
			 
	@FXML
	private Label Mod4Result;
	@FXML
	private Label Mod4Marks;
	@FXML
	private TextField mod4paper1;	 
    @FXML
	private TextField mod4paper2;
				 
	@FXML
	private Label Mod5Result;
	@FXML
	private Label Mod5Marks;
	@FXML
	private TextField mod5paper1;	 
	@FXML
	private TextField mod5paper2;
					 
	@FXML
	private Label Mod6Result;
	@FXML
	private Label Mod6Marks;
	@FXML
	private TextField mod6paper1;	 
	@FXML
	private TextField mod6paper2;
	@FXML
	public Button toLevel5;	
	@FXML
    private TextField studentId;
	//public static int studId=0;
	 
	public void lvl5ButtonClicked(ActionEvent event)throws Exception{
		Level4Model model= new Level4Model();		
		String studentid=studentId.getText();
		
		model.CalcOverallResults(this.CalcAvg(Long.parseLong(mod1paper1.getText()), Long.parseLong(mod1paper2.getText())), 
				this.CalcAvg(Long.parseLong(mod2paper1.getText()), Long.parseLong(mod2paper2.getText())), 
				this.CalcAvg(Long.parseLong(mod3paper1.getText()), Long.parseLong(mod3paper2.getText())), 
						this.CalcAvg(Long.parseLong(mod4paper1.getText()), Long.parseLong(mod4paper2.getText())), 
								this.CalcAvg(Long.parseLong(mod5paper1.getText()), Long.parseLong(mod5paper2.getText())), 
										this.CalcAvg(Long.parseLong(mod6paper1.getText()), Long.parseLong(mod6paper2.getText())),studentid);	
		
		//load level5
		Stage currentstage=(Stage)toLevel5.getScene().getWindow();		
		currentstage.close();		
		Parent root= FXMLLoader.load(getClass().getResource("Level5.fxml"));
		Scene scene = new Scene(root);
		Stage lvl5Stage = new Stage();
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		lvl5Stage.setScene(scene);
		lvl5Stage.setTitle("University of Gugsi,no where particular");
		lvl5Stage.show();
		
	
	}
	@FXML
	public void calculateBtnClicked(ActionEvent event){
		System.out.println("clicked");
		Level4Model model= new Level4Model();
		GetStudentController SutendRecords= new GetStudentController();
		List<String> level4Result= new ArrayList<String>();
		
		//get the studentId
	
		String studentid=studentId.getText();
		level4Result.add(studentid);
		
		if(mod1paper1.getText()!=""&&mod1paper2.getText()!=""){
			this.CalcTotal(Long.parseLong(mod1paper1.getText()), Long.parseLong(mod1paper2.getText()),Mod1Marks,Mod1Result);	
		}
		if(mod2paper1.getText()!=""&&mod2paper2.getText()!=""){
			this.CalcTotal(Long.parseLong(mod2paper1.getText()), Long.parseLong(mod2paper2.getText()),Mod2Marks,Mod2Result);	
		}
		if(mod3paper1.getText()!=""&&mod3paper2.getText()!=""){
			this.CalcTotal(Long.parseLong(mod3paper1.getText()), Long.parseLong(mod3paper2.getText()),Mod3Marks,Mod3Result);	
		}
		if(mod4paper1.getText()!=""&&mod4paper2.getText()!=""){
			this.CalcTotal(Long.parseLong(mod4paper1.getText()), Long.parseLong(mod4paper2.getText()),Mod4Marks,Mod4Result);	
		}
		if(mod5paper1.getText()!=""&&mod5paper2.getText()!=""){
			this.CalcTotal(Long.parseLong(mod5paper1.getText()), Long.parseLong(mod5paper2.getText()),Mod5Marks,Mod5Result);	
		}
		if(mod6paper1.getText()!=""&&mod6paper2.getText()!=""){
			this.CalcTotal(Long.parseLong(mod6paper1.getText()), Long.parseLong(mod6paper2.getText()),Mod6Marks,Mod6Result);	
		}
		
		model.CalcOverallResults(this.CalcAvg(Long.parseLong(mod1paper1.getText()), Long.parseLong(mod1paper2.getText())), 
				this.CalcAvg(Long.parseLong(mod2paper1.getText()), Long.parseLong(mod2paper2.getText())), 
				this.CalcAvg(Long.parseLong(mod3paper1.getText()), Long.parseLong(mod3paper2.getText())), 
						this.CalcAvg(Long.parseLong(mod4paper1.getText()), Long.parseLong(mod4paper2.getText())), 
								this.CalcAvg(Long.parseLong(mod5paper1.getText()), Long.parseLong(mod5paper2.getText())), 
										this.CalcAvg(Long.parseLong(mod6paper1.getText()), Long.parseLong(mod6paper2.getText())),studentid);		
		
	} 
	
	public void CalcTotal(long n1,long n2,Label marks, Label results){				
		long totalmarks= n1+n2;
		if(totalmarks/2>40&&n1>30&& n2>30){
			results.setText("Pass");
		}else{
			results.setText("Fail");
		}
		marks.setText(Long.toString(totalmarks));
	}
	
	public double CalcAvg(long n1,long n2){				
		double avg= (n1+n2)/2;
		
		return avg;
	}
	
	public void backTogetStudentSceen(ActionEvent event)throws Exception{
		//GetStudentController SutendRecords= new GetStudentController();
		GetStudentController.studId++;
		Stage currentstage=(Stage)toLevel5.getScene().getWindow();		
		currentstage.close();
		Level4Model model= new Level4Model();		
		String studentid=studentId.getText();
		
		model.CalcOverallResults(this.CalcAvg(Long.parseLong(mod1paper1.getText()), Long.parseLong(mod1paper2.getText())), 
				this.CalcAvg(Long.parseLong(mod2paper1.getText()), Long.parseLong(mod2paper2.getText())), 
				this.CalcAvg(Long.parseLong(mod3paper1.getText()), Long.parseLong(mod3paper2.getText())), 
						this.CalcAvg(Long.parseLong(mod4paper1.getText()), Long.parseLong(mod4paper2.getText())), 
								this.CalcAvg(Long.parseLong(mod5paper1.getText()), Long.parseLong(mod5paper2.getText())), 
										this.CalcAvg(Long.parseLong(mod6paper1.getText()), Long.parseLong(mod6paper2.getText())),studentid);
		
		//load get student
		Parent root= FXMLLoader.load(getClass().getResource("GetStudent.fxml"));
		Scene scene = new Scene(root);
		Stage lvl4Stage = new Stage();
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		lvl4Stage.setScene(scene);
		lvl4Stage.setTitle("University of Gugsi,no where particular");
		lvl4Stage.show();
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		studentId.setText(String.valueOf(GetStudentController.studId));
		
	}
}
