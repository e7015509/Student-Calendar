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
			

			String CSV_PATH = "C:\\Users\\e7015509\\workspace\\StudentCalendar\\TestData\\studentcal.csv"; // File path to your TestData.csv file
			
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
				   
		   
					//Printing retrieved data
				   /*System.out.println(browser);*/
				   System.out.println(loginPageURL);
				   		  

				   reader.close();
				   
			} catch (IOException e) {
		           e.printStackTrace();
		       }
			
			String [] RetrivedData = {loginPageURL,expLoginPageTitle,userName,password};
			return RetrivedData;	
	  }
}
