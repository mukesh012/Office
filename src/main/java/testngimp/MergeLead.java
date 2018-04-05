package testngimp;


import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import wdMethods.ProjectMethods;


public class MergeLead extends ProjectMethods{

	@Test
	public void login() throws InterruptedException {		
		WebElement clickleadstab = locateElement ("link","Leads");
		click(clickleadstab);
		WebElement clickMergelead = locateElement ("link","Merge Leads");
		click(clickMergelead);
		WebElement clicklead1 = locateElement  ("xpath", "(//img[@src='/images/fieldlookup.gif'])[1]");
		click (clicklead1);
		switchToWindow(1);
		WebElement enterlead1 = locateElement ("xpath","//input[@name='id']");
		type(enterlead1, "10435");
		WebElement clickfindleadbutton1 = locateElement ("xpath", "//button[text()='Find Leads']");
		click(clickfindleadbutton1);
		Thread.sleep(3000);
		WebElement clickresult = locateElement ("link", "10435");
		click (clickresult);
		switchToWindow(0);
		WebElement clicklead2 = locateElement ("xpath", "(//img[@src='/images/fieldlookup.gif'])[2]");
		click (clicklead2);
		switchToWindow(1);
		WebElement enterlead2 = locateElement ("xpath","//input[@name='id']");
		type(enterlead2, "10436");
		WebElement clickfindleadbutton2 = locateElement ("xpath", "//button[text()='Find Leads']");
		click(clickfindleadbutton2);
		Thread.sleep(3000);
		WebElement clickresult2 = locateElement ("link", "10436");
		click (clickresult2);
		switchToWindow(0);
		WebElement mergebutton = locateElement ("xpath", "//a[@class='buttonDangerous']");
		click (mergebutton);
		acceptAlert();
		WebElement findleads = locateElement ("xpath", "//a[@href='/crmsfa/control/findLeads']");
		click (findleads);
		WebElement leadvalue = locateElement ("xpath","//input[@name='id']");
		type(leadvalue, "10435");
		WebElement clickfindlead = locateElement ("xpath" , "//button[text()='Find Leads']");
		click (clickfindlead);
		Thread.sleep(3000);
		WebElement leadremovedverify = locateElement ("xpath","//div[text()='No records to display']");
		System.out.println(leadremovedverify.getText());
		
		
		
		
		


	}

}
