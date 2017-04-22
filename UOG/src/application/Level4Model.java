package application;
import java.util.*;

public class Level4Model {
public int Creditslvl4=0;

	public void CalcOverallResults(double av1,double av2,double av3,double av4,double av5,double av6, String studentId){
		 //checking average and declaring all variables
		GetStudentController.resultDictionary.clear();
		double total=0;
		int failed=0;
	    double avg=0;
	    double condone=20;
	    double retake=0;
	    double resit=0;
	    double totalAvg=0;
		List<Double> avgList=Arrays.asList(av1,av2,av3,av4,av5,av6);
		for(int i=0;i<avgList.size();i++){
			avg=avgList.get(i);
			totalAvg=totalAvg+avg;
			if(avg>40){
			GetStudentController.resultDictionary.put(studentId+"level4module"+i, "Pass");				
				total=total+20;
			}
			else if(avg>30 && avg<40){
				GetStudentController.resultDictionary.put(studentId+"level4module"+i, "resit");				
				resit++;
			}else{
				GetStudentController.resultDictionary.put(studentId+"level4module"+i, "fail");				
				retake++;
			}
		}
		//condone 
		if(failed==1){
			total=total+condone;
		}
		if(failed==2){
			total=total+(condone*2);
		}
		if(failed==3){
			total=total+(condone*2);			
		}
		GetStudentController.resultDictionary.put(studentId+"level4credits",String.valueOf(total));	
		GetStudentController.resultDictionary.put(studentId+"level4Marks",String.valueOf(totalAvg));	
		GetStudentController.resultDictionary.put(studentId+"level4retakes",String.valueOf(retake));	
		GetStudentController.resultDictionary.put(studentId+"level4resit",String.valueOf(resit));	
		GetStudentController.resultDictionary.put(studentId+"studentId",studentId);
		
		GetStudentController.sudentList.put(String.valueOf(studentId), GetStudentController.resultDictionary);
		
	}
}
