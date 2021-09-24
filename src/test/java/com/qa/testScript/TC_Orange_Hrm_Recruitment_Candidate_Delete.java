package com.qa.testScript;

import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

public class TC_Orange_Hrm_Recruitment_Candidate_Delete extends TestBase{
	
	@Test
	public void deleteCustomers() throws InterruptedException {
		
		orangeHrm.checkBox().click();
		orangeHrm.delete().click();
//		Thread.sleep(5000);
//		  driver.switchTo().alert().accept();
		orangeHrm.deleteOk().click();
	}

}
