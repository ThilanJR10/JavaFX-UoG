package application;

import java.util.ArrayList;
import java.util.List;

import org.omg.CORBA.PRIVATE_MEMBER;













import com.sun.javafx.scene.layout.region.Margins.Converter;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


public class Level5Controller {
	 @FXML
	private Label lvl5mod1result;
	 @FXML
	private Label  lvl5mod1marks;
	 @FXML
	private TextField lvl5mod1paper1;	 
	 @FXML
	private TextField lvl5mod1paper2;
	 
	 @FXML
	private Label lvl5mod2result;
	@FXML
	private Label lvl5mod2marks;
	@FXML
	private TextField lvl5mod2paper1;	 
	@FXML
	private TextField lvl5mod2paper2;
	
	@FXML
	private Label lvl5mod3result;
	@FXML
	private Label lvl5mod3marks;
	@FXML
	private TextField lvl5mod3paper1;	 
	@FXML
	private TextField lvl5mod3paper2;
			 
	@FXML
	private Label lvl5mod4result;
	@FXML
	private Label lvl5mod4marks;
	@FXML
	private TextField lvl5mod4paper1;	 
   @FXML
	private TextField lvl5mod4paper2;
				 
	@FXML
	private Label lvl5mod5result;
	@FXML
	private Label lvl5mod5marks;
	@FXML
	private TextField lvl5mod5paper1;	 
	@FXML
	private TextField lvl5mod5paper2;
					 
	@FXML
	private Label lvl5mod6result;
	@FXML
	private Label lvl5mod6marks;
	@FXML
	private TextField lvl5mod6paper1;	 
	@FXML
	private TextField lvl5mod6paper2;
	@FXML
	public Button toLevel6;
	
	public void lvl6ButtonClicked(ActionEvent event)throws Exception{
		Level5Model model= new Level5Model();
		model.CalcOverallResults(this.CalcAvg(Long.parseLong(lvl5mod1paper1.getText()), Long.parseLong(lvl5mod1paper2.getText())), 
				this.CalcAvg(Long.parseLong(lvl5mod2paper1.getText()), Long.parseLong(lvl5mod2paper2.getText())), 
				this.CalcAvg(Long.parseLong(lvl5mod3paper1.getText()), Long.parseLong(lvl5mod3paper2.getText())), 
						this.CalcAvg(Long.parseLong(lvl5mod4paper1.getText()), Long.parseLong(lvl5mod4paper2.getText())), 
								this.CalcAvg(Long.parseLong(lvl5mod5paper1.getText()), Long.parseLong(lvl5mod5paper2.getText())), 
										this.CalcAvg(Long.parseLong(lvl5mod6paper1.getText()), Long.parseLong(lvl5mod6paper2.getText())),GetStudentController.studId);
		//close level6 and load getstudent window
		Stage currentstage=(Stage)toLevel6.getScene().getWindow();		
		currentstage.close();		
		Parent root= FXMLLoader.load(getClass().getResource("Level6.fxml"));
		Scene scene = new Scene(root);
		Stage lvl6Stage = new Stage();
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		lvl6Stage.setScene(scene);
		lvl6Stage.setTitle("University of Gugsi,no where particular");
		lvl6Stage.show();
	}
		


@FXML
public void calculateBtnClicked1(ActionEvent event){
	System.out.println("clicked");
	
	//getting inputs from user
	if(lvl5mod1paper1.getText()!=""&&lvl5mod1paper2.getText()!=""){
		this.CalcTotal1(Long.parseLong(lvl5mod1paper1.getText()), Long.parseLong(lvl5mod1paper2.getText()),lvl5mod1marks,lvl5mod1result);	
	}
	if(lvl5mod2paper1.getText()!=""&&lvl5mod2paper2.getText()!=""){
		this.CalcTotal1(Long.parseLong(lvl5mod2paper1.getText()), Long.parseLong(lvl5mod2paper2.getText()),lvl5mod2marks,lvl5mod2result);	
	}
	if(lvl5mod3paper1.getText()!=""&&lvl5mod3paper2.getText()!=""){
		this.CalcTotal1(Long.parseLong(lvl5mod3paper1.getText()), Long.parseLong(lvl5mod3paper2.getText()),lvl5mod3marks,lvl5mod3result);	
	}
	if(lvl5mod4paper1.getText()!=""&&lvl5mod4paper2.getText()!=""){
		this.CalcTotal1(Long.parseLong(lvl5mod4paper1.getText()), Long.parseLong(lvl5mod4paper2.getText()),lvl5mod4marks,lvl5mod4result);	
	}
	if(lvl5mod5paper1.getText()!=""&&lvl5mod5paper2.getText()!=""){
		this.CalcTotal1(Long.parseLong(lvl5mod5paper1.getText()), Long.parseLong(lvl5mod5paper2.getText()),lvl5mod5marks,lvl5mod5result);	
	}
	if(lvl5mod6paper1.getText()!=""&&lvl5mod6paper2.getText()!=""){
		this.CalcTotal1(Long.parseLong(lvl5mod6paper1.getText()), Long.parseLong(lvl5mod6paper2.getText()),lvl5mod6marks,lvl5mod6result);	
	}
	
	
	//GetStudentController.sudentList.addAll(level5Result);
	
	
} 
//checking pass or fail
public void CalcTotal1(long n1,long n2,Label marks, Label results){				
	long totalmarks1= n1+n2;
	if(totalmarks1/2>40&&n1>30&& n2>30){
		results.setText("Pass");
	}else{
		results.setText("Fail");
	}
	marks.setText(Long.toString(totalmarks1));
}

public double CalcAvg(long n1,long n2){				
	double avg= (n1+n2)/2;
	
	return avg;
}
//putting marks into array
public void backTogetStudentSceen1(ActionEvent event)throws Exception{
	Level5Model model= new Level5Model();	
	List<String> level5Result= new ArrayList<String>();
	GetStudentController.studId++;
	Stage currentstage=(Stage)toLevel6.getScene().getWindow();		
	currentstage.close();
	
	model.CalcOverallResults(this.CalcAvg(Long.parseLong(lvl5mod1paper1.getText()), Long.parseLong(lvl5mod1paper2.getText())), 
			this.CalcAvg(Long.parseLong(lvl5mod2paper1.getText()), Long.parseLong(lvl5mod2paper2.getText())), 
			this.CalcAvg(Long.parseLong(lvl5mod3paper1.getText()), Long.parseLong(lvl5mod3paper2.getText())), 
					this.CalcAvg(Long.parseLong(lvl5mod4paper1.getText()), Long.parseLong(lvl5mod4paper2.getText())), 
							this.CalcAvg(Long.parseLong(lvl5mod5paper1.getText()), Long.parseLong(lvl5mod5paper2.getText())), 
									this.CalcAvg(Long.parseLong(lvl5mod6paper1.getText()), Long.parseLong(lvl5mod6paper2.getText())),GetStudentController.studId);
	//load getstudent window
	Parent root= FXMLLoader.load(getClass().getResource("GetStudent.fxml"));
	Scene scene = new Scene(root);
	Stage lvl4Stage = new Stage();
	scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
	lvl4Stage.setScene(scene);
	lvl4Stage.setTitle("University of Gugsi,no where particular");
	lvl4Stage.show();
}
}




