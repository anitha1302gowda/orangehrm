package com.qa.testScript;

import java.io.IOException;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



import com.qa.utility.ExcelUtility;

public class TC_OrangeHrm_Recruitment_Search extends TestBase{
	
	


	@Test(dataProvider = "jobtitles")
	public void jobTitle_Search(String[] inputData) throws IOException {
	
	     for(int i=1;i<=inputData.length-1;i++) {
		     Select dropdown = new Select(orangeHrm.jobTitle()); 
		     dropdown.selectByVisibleText(inputData[i]);  
		     orangeHrm.search().click();
		     
		     List<WebElement> records=orangeHrm.searchResult();
		     if(records.size()!=0) {
		    	 
		    	 System.out.println("Candidates found");
		    	 
		     }else {
		    	
		    	 System.out.println("Candidates Not found"); 
		     }
	     }
	
	    
	}
	
	@Test(dataProvider = "vacency")
	public void vacency_Search(String[] inputData) throws IOException {
	
	     for(int i=1;i<=inputData.length-1;i++) {
		     Select dropdown = new Select(orangeHrm.vacancy()); 
		     dropdown.selectByVisibleText(inputData[i]);  
		     orangeHrm.search().click();
		     
		     List<WebElement> records=orangeHrm.searchResult();
		     if(records.size()!=0) {
		    	 
		    	 System.out.println("Candidates found");
		    	 
		     }else {
		    	
		    	 System.out.println("Candidates Not found"); 
		     }
	     }
	
	 
	}
	
	@Test(dataProvider = "hiringManager")
	public void hiringManager_Search(String[] inputData) throws IOException {
		
	     for(int i=1;i<=inputData.length-1;i++) {
		     Select dropdown = new Select(orangeHrm.hiringManager()); 
		     dropdown.selectByVisibleText(inputData[i]);  
		     orangeHrm.search().click();
		     
		     List<WebElement> records=orangeHrm.searchResult();
		     if(records.size()!=0) {
		    	 
		    	 System.out.println("Candidates found");
		    	 
		     }else {
		    	
		    	 System.out.println("Candidates Not found"); 
		     }
	     }
	

	}
	

	@Test(dataProvider = "status")
	public void status_Search(String[] inputData) throws IOException, Exception {
	
	     for(int i=1;i<=inputData.length-1;i++) {
		     Select dropdown = new Select(orangeHrm.status()); 
		     dropdown.selectByVisibleText(inputData[i]);  
		     orangeHrm.search().click();
		     Thread.sleep(4000);
		     
		     List<WebElement> records=orangeHrm.searchResult();
		     if(records.size()!=0) {
		    	 
		    	 System.out.println("Candidates found");
		    	 
		     }else {
		    	
		    	 System.out.println("Candidates Not found"); 
		     }
	     }
	
	}
	
	
	@Test(dataProvider = "CandidateName")
	public void candidateName_Search(String[] inputData) throws IOException {
		
	     for(int i=1;i<=inputData.length-1;i++) {
	    	 orangeHrm.candidateName().sendKeys(inputData[i]);
		
		     orangeHrm.search().click();
		     
		     List<WebElement> records=orangeHrm.searchResult();
		     if(records.size()!=0) {
		    	 
		    	 System.out.println("Candidates found");
		    	 
		     }else {
		    	
		    	 System.out.println("Candidates Not found"); 
		     }
	     }
	
	 
	}

	@Test(dataProvider = "modeOfApp")
	public void modeOfApp_Search(String[] inputData) throws IOException {
	
	     for(int i=1;i<=inputData.length-1;i++) {
		     Select dropdown = new Select(orangeHrm.modeOfApplication()); 
		     dropdown.selectByVisibleText(inputData[i]);  
		     orangeHrm.search().click();
		     
		     List<WebElement> records=orangeHrm.searchResult();
		     if(records.size()!=0) {
		    	 
		    	 System.out.println("Candidates found");
		    	 
		     }else {
		    	
		    	 System.out.println("Candidates Not found"); 
		     }
	     }
	

	}
	
	
	@Test(dataProvider = "fromDate")
	public void testDate(String[] inputData) {
		
		 orangeHrm.fromDate().clear();
		 orangeHrm.fromDate().sendKeys("2020-09-01");
		 orangeHrm.search().click();
		 List<WebElement> records=orangeHrm.searchResult();
	     if(records.size()!=0) {
	    	 
	    	 System.out.println("Candidates found");
	    	 
	     }else {
	    	
	    	 System.out.println("Candidates Not found"); 
	     }
     
	}
	
	@DataProvider(name = "fromDate")
	public String[][] getData8() throws IOException {
		

		String sheet="fromDate";
		String[][] data= getExcelData(sheet);

		return data;
	}

@DataProvider(name = "jobtitles")
public String[][] getData() throws IOException {
	

	String sheet="jobTitle";
	String[][] data= getExcelData(sheet);

	return data;
}

@DataProvider(name = "vacency")
public String[][] getData1() throws IOException {
	
	
	String sheet="vacency";
	String[][] data= getExcelData(sheet);

	return data;
}

@DataProvider(name = "hiringManager")
public String[][] getData3() throws IOException {
	
	 
	String sheet="hiringManager";
	String[][] data= getExcelData(sheet);

	return data;
}

@DataProvider(name = "status")
public String[][] getData4() throws IOException {
	
	 
	String sheet="status";
	String[][] data= getExcelData(sheet);

	return data;
}

@DataProvider(name = "CandidateName")
public String[][] getData5() throws IOException {
	
	 
	String sheet="CandidateName";
	String[][] data= getExcelData(sheet);

	return data;
}

@DataProvider(name = "modeOfApp")
public String[][] getData6() throws IOException {
	
	 
	String sheet="modeOfApp";
	String[][] data= getExcelData(sheet);

	return data;
}


}
