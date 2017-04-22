package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.List;

public class Level5Model {
	
	public void  CalcOverallResults(double av1,double av2,double av3,double av4,double av5,double av6,int studentId){
		 
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
				GetStudentController.resultDictionary.put(studentId+"level5module"+i, "Pass");				
				total=total+20;
			}
			else if(avg>30 && avg<40){
				GetStudentController.resultDictionary.put(studentId+"level5module"+i, "resit");				
				resit++;
			}else{
				GetStudentController.resultDictionary.put(studentId+"level5module"+i, "fail");				
				retake++;
			}
		}		
		
		GetStudentController.resultDictionary.put(studentId+"level5credits",String.valueOf(total));
		GetStudentController.resultDictionary.put(studentId+"level5Marks",String.valueOf(totalAvg));
		GetStudentController.resultDictionary.put(studentId+"level5retakes",String.valueOf(retake));	
		GetStudentController.resultDictionary.put(studentId+"level5resit",String.valueOf(resit));	
		GetStudentController.resultDictionary.put(studentId+"studentId",String.valueOf(studentId));
		GetStudentController.resultDictionary.put(studentId+"studentId",String.valueOf(studentId));
		
		GetStudentController.sudentList.put(String.valueOf(studentId),GetStudentController.resultDictionary);
		
	}

}
