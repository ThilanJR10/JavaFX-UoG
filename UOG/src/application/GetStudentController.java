package application;

import java.net.URL;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.ResourceBundle;
import java.util.function.ToDoubleFunction;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


public class GetStudentController implements Initializable  {
	
	
	
	@FXML
    private TextArea resultArea;
	
	//public static Hashtable<String> sudentList= new ArrayList<String>();
	
	public static Hashtable<String, Hashtable<String, String>> sudentList = new Hashtable<String, Hashtable<String, String>>();
	public static Hashtable<String, String> resultDictionary = new Hashtable<String, String>();
	
	
	
	public static int studId=0;
	
	public void addMarksbuttonclicked(ActionEvent event)throws Exception{
		
		Stage currentstage=(Stage)resultArea.getScene().getWindow();	
		currentstage.close();
		Parent root= FXMLLoader.load(getClass().getResource("Level4.fxml"));
		Scene scene = new Scene(root);
		Stage lvl6Stage = new Stage();
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		lvl6Stage.setScene(scene);
		lvl6Stage.setTitle("University of Gugsi,no where particular");
		lvl6Stage.show();
	}
	
	public void setResultText(){
		//level4 results putting in to array
		StringBuilder sb = new StringBuilder();	
		for(int i=0;i<sudentList.size();i++){
			sb.append("\n");
			sb.append("\n");
			sb.append("studentId");
			sb.append(sudentList.get(String.valueOf(i)).get(String.valueOf(i)+"studentId"));
			sb.append("\n");
			sb.append("level4:module:1");	
            sb.append(sudentList.get(String.valueOf(i)).get(String.valueOf(i)+"level4module0"));
			sb.append("\n");
			sb.append("level4:module:2");
			sb.append(sudentList.get(String.valueOf(i)).get(String.valueOf(i)+"level4module1"));
			sb.append("\n");
			sb.append("level4:module:3");
			sb.append(sudentList.get(String.valueOf(i)).get(String.valueOf(i)+"level4module2"));
			sb.append("\n");
			sb.append("level4:module:4");
			sb.append(sudentList.get(String.valueOf(i)).get(String.valueOf(i)+"level4module3"));
			sb.append("\n");
			sb.append("level4:module:5");
			sb.append(sudentList.get(String.valueOf(i)).get(String.valueOf(i)+"level4module4"));
			sb.append("\n");
			sb.append("level4:module:6");
			sb.append(sudentList.get(String.valueOf(i)).get(String.valueOf(i)+"level4module5"));
			sb.append("\n");			
			sb.append("level4:credits:");
			sb.append(sudentList.get(String.valueOf(i)).get(String.valueOf(i)+"level4credits"));
			sb.append("\n");
			sb.append(sudentList.get(String.valueOf(i)).get(String.valueOf(i)+"level4Marks"));			
			sb.append("\n");
			sb.append("level4:retakes:");
			sb.append(sudentList.get(String.valueOf(i)).get(String.valueOf(i)+"level4retakes"));
			sb.append("\n");
			sb.append("level4:resit:");
			sb.append(sudentList.get(String.valueOf(i)).get(String.valueOf(i)+"level4resit"));
			sb.append("\n");
			//level5 results putting in to array
			sb.append("\n");
			sb.append("\n");
			sb.append("studentId");
			sb.append(sudentList.get(String.valueOf(i)).get(String.valueOf(i)+"studentId"));
			sb.append("\n");
			sb.append("level5:module:1");	
            sb.append(sudentList.get(String.valueOf(i)).get(String.valueOf(i)+"level5module0"));
			sb.append("\n");
			sb.append("level5:module:2");
			sb.append(sudentList.get(String.valueOf(i)).get(String.valueOf(i)+"level5module1"));
			sb.append("\n");
			sb.append("level5:module:3");
			sb.append(sudentList.get(String.valueOf(i)).get(String.valueOf(i)+"level5module2"));
			sb.append("\n");
			sb.append("level5:module:4");
			sb.append(sudentList.get(String.valueOf(i)).get(String.valueOf(i)+"level5module3"));
			sb.append("\n");
			sb.append("level5:module:5");
			sb.append(sudentList.get(String.valueOf(i)).get(String.valueOf(i)+"level5module4"));
			sb.append("\n");
			sb.append("level5:module:6");
			sb.append(sudentList.get(String.valueOf(i)).get(String.valueOf(i)+"level5module5"));
			sb.append("\n");			
			sb.append("level5:credits:");
			sb.append(sudentList.get(String.valueOf(i)).get(String.valueOf(i)+"level5credits"));
			sb.append("\n");
			
			sb.append(sudentList.get(String.valueOf(i)).get(String.valueOf(i)+"level5Marks"));
			sb.append("\n");
			
			sb.append("level5:retakes:");
			sb.append(sudentList.get(String.valueOf(i)).get(String.valueOf(i)+"level5retakes"));
			sb.append("\n");
			sb.append("level5:resit:");
			sb.append(sudentList.get(String.valueOf(i)).get(String.valueOf(i)+"level5resit"));
			sb.append("\n");
			//level 6 putting in to array
			sb.append("\n");
			sb.append("\n");
			sb.append("studentId");
			sb.append(sudentList.get(String.valueOf(i)).get(String.valueOf(i)+"studentId"));
			sb.append("\n");
			sb.append("level6:module:1");	
            sb.append(sudentList.get(String.valueOf(i)).get(String.valueOf(i)+"level6module0"));
			sb.append("\n");
			sb.append("level6:module:2");
			sb.append(sudentList.get(String.valueOf(i)).get(String.valueOf(i)+"level6module1"));
			sb.append("\n");
			sb.append("level6:module:3");
			sb.append(sudentList.get(String.valueOf(i)).get(String.valueOf(i)+"level6module2"));
			sb.append("\n");
			sb.append("level6:module:4");
			sb.append(sudentList.get(String.valueOf(i)).get(String.valueOf(i)+"level6module3"));
			sb.append("\n");
			sb.append("level6:module:5");
			sb.append(sudentList.get(String.valueOf(i)).get(String.valueOf(i)+"level6module4"));
			sb.append("\n");
			sb.append("level6:module:6");
			sb.append(sudentList.get(String.valueOf(i)).get(String.valueOf(i)+"level6module5"));
			sb.append("\n");			
			sb.append("level6:credits:");
			sb.append(sudentList.get(String.valueOf(i)).get(String.valueOf(i)+"level6credits"));
			sb.append("\n");
			sb.append(sudentList.get(String.valueOf(i)).get(String.valueOf(i)+"level4Marks"));
			sb.append("\n");
			sb.append("level6:retakes:");
			sb.append(sudentList.get(String.valueOf(i)).get(String.valueOf(i)+"level6retakes"));
			sb.append("\n");
			sb.append("level6:resit:");
			sb.append(sudentList.get(String.valueOf(i)).get(String.valueOf(i)+"level6resit"));
			sb.append("\n");
			
			double lavl4credits=Double.parseDouble(sudentList.get(String.valueOf(i)).get(String.valueOf(i)+"level4credits"));
			double lavl5credits=Double.parseDouble(sudentList.get(String.valueOf(i)).get(String.valueOf(i)+"level5credits"));
			String value=sudentList.get(String.valueOf(i)).get(String.valueOf(i)+"level6credits");
			double lavl6credits=Double.parseDouble(value);
			
			double lavl4marks=Double.parseDouble(sudentList.get(String.valueOf(i)).get(String.valueOf(i)+"level4Marks"));
			double lavl5marks=Double.parseDouble(sudentList.get(String.valueOf(i)).get(String.valueOf(i)+"level5Marks"));
			double lavl6marks=Double.parseDouble(sudentList.get(String.valueOf(i)).get(String.valueOf(i)+"level6Marks"));
			//credit calculation
			double totalMarks=0;
			double totalCredits=0;
			if(lavl4marks!=0 && lavl5marks!=0&& lavl6marks!=0){
			totalMarks=(lavl4marks+lavl5marks+lavl6marks)/18;				
			}
			if(lavl4credits!=0 && lavl5credits!=0&& lavl6credits!=0){
				totalCredits=lavl4credits+lavl5credits+lavl6credits;				
				}
			
			if(totalCredits==360){
				
				if(totalMarks>70){
					sb.append("First Class");
					sb.append("\n");
				}
				else if(totalMarks>60 && totalMarks<69){
					sb.append("Second Class Upper Class");
					sb.append("\n");
				}
				else if(totalMarks>50 && totalMarks<59){
					sb.append("Second Class Lower Class");
					sb.append("\n");
				}
				else if(totalMarks>40 && totalMarks<50){
					sb.append("Third Class Class");
					sb.append("\n");
				}
				else {
					sb.append("Not Qualify For the degree");
					sb.append("\n");
				}
				
			}
			if(totalCredits>300&& totalCredits<360){
				sb.append("Non Honours");
				sb.append("\n");
			}
				
			sb.append("\n");sb.append("\n");sb.append("\n");			
		}
		resultArea.setText(sb.toString());
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		this.setResultText();		
	}

	
	

		

}
