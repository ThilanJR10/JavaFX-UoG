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

public class Level6Controller {
	
		@FXML
		private Label lvl6mod1result;
		 @FXML
		private Label  lvl6mod1marks;
		 @FXML
		private TextField lvl6mod1paper1;	 
		 @FXML
		private TextField lvl6mod1paper2;
		 
		 @FXML
		private Label lvl6mod2result;
		@FXML
		private Label lvl6mod2marks;
		@FXML
		private TextField lvl6mod2paper1;	 
		@FXML
		private TextField lvl6mod2paper2;
		
		@FXML
		private Label lvl6mod3result;
		@FXML
		private Label lvl6mod3marks;
		@FXML
		private TextField lvl6mod3paper1;	 
		@FXML
		private TextField lvl6mod3paper2;
				 
		@FXML
		private Label lvl6mod4result;
		@FXML
		private Label lvl6mod4marks;
		@FXML
		private TextField lvl6mod4paper1;	 
	   @FXML
		private TextField lvl6mod4paper2;
					 
		@FXML
		private Label lvl6mod5result;
		@FXML
		private Label lvl6mod5marks;
		@FXML
		private TextField lvl6mod5paper1;	 
		@FXML
		private TextField lvl6mod5paper2;
						 
		@FXML
		private Label lvl6mod6result;
		@FXML
		private Label lvl6mod6marks;
		@FXML
		private TextField lvl6mod6paper1;	 
		@FXML
		private TextField lvl6mod6paper2;
		
		@FXML
		public Button toLevel6;
		
		
	//getting input from user
		@FXML
		public void calculateBtnClicked2(ActionEvent event){
			System.out.println("clicked");
			Level6Model model= new Level6Model();
			GetStudentController SutendRecords= new GetStudentController();
			List<String> level6Result= new ArrayList<String>();
			
			if(lvl6mod1paper1.getText()!=""&&lvl6mod1paper2.getText()!=""){
				this.CalcTotal2(Long.parseLong(lvl6mod1paper1.getText()), Long.parseLong(lvl6mod1paper2.getText()),lvl6mod1marks,lvl6mod1result);	
			}
			if(lvl6mod2paper1.getText()!=""&&lvl6mod2paper2.getText()!=""){
				this.CalcTotal2(Long.parseLong(lvl6mod2paper1.getText()), Long.parseLong(lvl6mod2paper2.getText()),lvl6mod2marks,lvl6mod2result);	
			}
			if(lvl6mod3paper1.getText()!=""&&lvl6mod3paper2.getText()!=""){
				this.CalcTotal2(Long.parseLong(lvl6mod3paper1.getText()), Long.parseLong(lvl6mod3paper2.getText()),lvl6mod3marks,lvl6mod3result);	
			}
			if(lvl6mod4paper1.getText()!=""&&lvl6mod4paper2.getText()!=""){
				this.CalcTotal2(Long.parseLong(lvl6mod4paper1.getText()), Long.parseLong(lvl6mod4paper2.getText()),lvl6mod4marks,lvl6mod4result);	
			}
			if(lvl6mod5paper1.getText()!=""&&lvl6mod5paper2.getText()!=""){
				this.CalcTotal2(Long.parseLong(lvl6mod5paper1.getText()), Long.parseLong(lvl6mod5paper2.getText()),lvl6mod5marks,lvl6mod5result);	
			}
			if(lvl6mod6paper1.getText()!=""&&lvl6mod6paper2.getText()!=""){
				this.CalcTotal2(Long.parseLong(lvl6mod6paper1.getText()), Long.parseLong(lvl6mod6paper2.getText()),lvl6mod6marks,lvl6mod6result);	
			}
			
			/* level6Result.addAll(model.CalcOverallResults(this.CalcAvg(Long.parseLong(lvl6mod1paper1.getText()), Long.parseLong(lvl6mod1paper2.getText())), 
					this.CalcAvg(Long.parseLong(lvl6mod2paper1.getText()), Long.parseLong(lvl6mod2paper2.getText())), 
					this.CalcAvg(Long.parseLong(lvl6mod3paper1.getText()), Long.parseLong(lvl6mod3paper2.getText())), 
							this.CalcAvg(Long.parseLong(lvl6mod4paper1.getText()), Long.parseLong(lvl6mod4paper2.getText())), 
									this.CalcAvg(Long.parseLong(lvl6mod5paper1.getText()), Long.parseLong(lvl6mod5paper2.getText())), 
											this.CalcAvg(Long.parseLong(lvl6mod6paper1.getText()), Long.parseLong(lvl6mod6paper2.getText()))));*/
			//GetStudentController.sudentList.addAll(level6Result);
			
			
			
		} 
		
		public void CalcTotal2(long n1,long n2,Label marks, Label results){				
			long totalmarks2= n1+n2;
			if(totalmarks2/2>40&&n1>30&& n2>30){
				results.setText("Pass");
			}else{
				results.setText("Fail");
			}
			marks.setText(Long.toString(totalmarks2));
		}
		
		public double CalcAvg(long n1,long n2){				
			double avg= (n1+n2)/2;
			
			return avg;
		}
		
		public void backTogetStudentSceen2(ActionEvent event){
			try{
			/*Stage currentstage=(Stage)toLevel6.getScene().getWindow();		
			currentstage.close();*/
			
				Level6Model model= new Level6Model();		
				
				
				model.CalcOverallResults(this.CalcAvg(Long.parseLong(lvl6mod1paper1.getText()), Long.parseLong(lvl6mod1paper2.getText())), 
						this.CalcAvg(Long.parseLong(lvl6mod2paper1.getText()), Long.parseLong(lvl6mod2paper2.getText())), 
						this.CalcAvg(Long.parseLong(lvl6mod3paper1.getText()), Long.parseLong(lvl6mod3paper2.getText())), 
								this.CalcAvg(Long.parseLong(lvl6mod4paper1.getText()), Long.parseLong(lvl6mod4paper2.getText())), 
										this.CalcAvg(Long.parseLong(lvl6mod5paper1.getText()), Long.parseLong(lvl6mod5paper2.getText())), 
												this.CalcAvg(Long.parseLong(lvl6mod6paper1.getText()), Long.parseLong(lvl6mod6paper2.getText())),GetStudentController.studId);
				
			Parent root= FXMLLoader.load(getClass().getResource("GetStudent.fxml"));
			Scene scene = new Scene(root);
			Stage lvl4Stage = new Stage();
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			lvl4Stage.setScene(scene);
			lvl4Stage.setTitle("University of Gugsi,no where particular");
			lvl4Stage.show();
			}catch(Exception e1){
				
			}
		}
}


