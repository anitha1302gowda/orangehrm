package com.qa.testScript;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TC_OrangeHrm_Recruitment_Add_Customer extends TestBase{
	
	
	@Test(dataProvider = "AddCustomer")
	public void add_Customer(String[] inputData) {
		orangeHrm.addBtn().click();
		orangeHrm.firstName().sendKeys(inputData[0]);
		orangeHrm.lastName().sendKeys(inputData[2]);
		orangeHrm.middleName().sendKeys(inputData[1]);
		orangeHrm.email().sendKeys(inputData[3]);
		orangeHrm.contactNo().sendKeys(inputData[5]);
	    Select dropdown = new Select(orangeHrm.cVacency()); 
	     dropdown.selectByVisibleText(inputData[4]);
	     orangeHrm.saveCus().click(); 
	     
	     List<WebElement> records=orangeHrm.searchResult();
	     if(records.size()!=0) {
	    	 
	    	 System.out.println("Candidate Added successfully");
	    	 
	     }else {
	    	
	    	 System.out.println("Candidate Not Added successfully"); 
	     }
	}
	
	
	@Test(dataProvider = "editCustomer")
	public void edit_customer(String[] inputData) {
		orangeHrm.editBtn().click();
	
		Select dropdown = new Select(orangeHrm.selectAction()); 
	     dropdown.selectByVisibleText(inputData[0]);

	     orangeHrm.shortlist().click();
		
	}
	
	
	@DataProvider(name = "editCustomer")
	public String[][] editCustomer() throws IOException {
		
		 
		String sheet="editCustomer";
		String[][] data= getExcelData(sheet);

		return data;
	}
	
	
	@DataProvider(name = "AddCustomer")
	public String[][] AddCustomer() throws IOException {
		
		 
		String sheet="AddCustomer";
		String[][] data= getExcelData(sheet);

		return data;
	}

}
