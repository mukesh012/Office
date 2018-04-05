package testcases;


import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import wdMethods.ProjectMethods;

public class Duplicatelead extends ProjectMethods{

	@Test
	public void login() throws InterruptedException {		
		WebElement clicklead = locateElement ("xpath","(//div[@class='x-panel-header']/a)[2]");
		click(clicklead);
		WebElement findlead = locateElement ("xpath","(//ul[@class='shortcuts']/li/a)[3]");
		click(findlead);
		WebElement ClickEmail = locateElement ("xpath","(//span[@class='x-tab-strip-inner']/span)[3]");
		click(ClickEmail);
		WebElement EnterEmail = locateElement ("xpath","//input[@name='emailAddress']");
		type(EnterEmail,"mukesh012@live.com");
		WebElement clickfindlead = locateElement ("xpath","(//td[@class='x-btn-center']/following :: button)[6]");
		click(clickfindlead);
		WebElement checkFNName = locateElement ("xpath","//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a");
		getText(checkFNName);
		WebElement checkLnName = locateElement ("xpath","//div[@class='x-grid3-cell-inner x-grid3-col-lastName']/a");
		getText(checkLnName);
		WebElement Click1stlead = locateElement ("xpath","//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a");
		click(Click1stlead);
		WebElement ClcikDupLead = locateElement ("xpath","(//div[@class='frameSectionExtra']/a)[1]");
		click(ClcikDupLead);
		verifyTitle("Duplicate Lead | opentaps CRM");
		WebElement cretlead = locateElement ("xpath","(//ul[@class='shortcuts']/li/a)[2]");
		click(cretlead);
		WebElement Duplicated = locateElement ("xpath","(//ul[@class='navHistory']/li)[2]");
		verifyExactText(Duplicated,"MK BB (FISGBS)");

	}
}