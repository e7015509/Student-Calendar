package studentcal.commonLib;

import java.io.FileReader;
import java.io.IOException;

import au.com.bytecode.opencsv.CSVReader;



public class DataBroker {
	 public String[] ReadData() {
		  
		 	String loginPageURL = null;
		   	String expLoginPageTitle =null;
		   	String userName = null;
			String password = null;
			String expCurrMthCalTitle = null;
			String expTabMthLbl = null;
			String expTabDayLbl = null;
			String expTabWeekLbl = null;
		
			

			String CSV_PATH = "C:\\Users\\e7015509\\Documents\\Automation_Repo\\Student-Calendar\\TestData\\studentcal.csv"; // File path to your TestData.csv file
			
			try {
				  CSVReader reader = new CSVReader(new FileReader(CSV_PATH));
				  String [] csvCell;
				  			  				  
				  	//Retrieving data from a CSV file.
				   csvCell = reader.readNext();	   
				   csvCell = reader.readNext();
				   /*browser = csvCell[0];*/
				   loginPageURL = csvCell[0];
				   expLoginPageTitle = csvCell[1];
				   userName = csvCell[2];
				   password = csvCell[3];
				   expCurrMthCalTitle = csvCell[4];
				   expTabMthLbl = csvCell[5];
				   expTabDayLbl = csvCell[6];
				   expTabWeekLbl = csvCell[7];
				   
		   
					//Printing retrieved data
				   /*System.out.println(browser);*/
				   System.out.println(loginPageURL);
				   		  

				   reader.close();
				   
			} catch (IOException e) {
		           e.printStackTrace();
		       }
			
			String [] RetrivedData = {loginPageURL,expLoginPageTitle,userName,password,expCurrMthCalTitle,expTabMthLbl,expTabDayLbl,expTabWeekLbl};
			return RetrivedData;	
	  }
}
