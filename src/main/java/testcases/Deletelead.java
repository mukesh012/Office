package testcases;


import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
import wdMethods.ProjectMethods;

public class Deletelead extends ProjectMethods{
	
	@Test(dependsOnMethods="testcases.CreateLead.login")
	public void Deletelead1() {
	WebElement clicklead = locateElement ("xpath","(//div[@class='x-panel-header']/a)[2]");
	click(clicklead);
	WebElement findlead = locateElement ("xpath","(//ul[@class='shortcuts']/li/a)[3]");
	click(findlead);
	WebElement ClickPhone = locateElement ("xpath","(//span[@class='x-tab-strip-inner']/span)[2]");
	click(ClickPhone);
	WebElement EnterPhone = locateElement ("xpath","//input[@name='phoneNumber']");
	type(EnterPhone,"8122039188");
	WebElement clickfindlead = locateElement ("xpath","(//td[@class='x-btn-center']/following :: button)[6]");
	click(clickfindlead);
	WebElement Click1stlead = locateElement ("xpath","(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]");
	String Textvalue = Click1stlead.getText();
	click(Click1stlead);
	//Deletelead//
	locateElement ("xpath","(//div[@class='frameSectionExtra']/a)[4]").click();
	WebElement findlead2 = locateElement ("xpath","(//ul[@class='shortcuts']/li/a)[3]");
	click(findlead2);
	WebElement LeadId = locateElement("name" ,"id");
	type(LeadId,Textvalue);
	WebElement clickfindlead3 = locateElement ("xpath","(//td[@class='x-btn-center']/following :: button)[6]");
	click(clickfindlead3);
	WebElement VerifyDelete = locateElement ("class","x-paging-info");
	verifyExactText(VerifyDelete, "No records to display");
	}
}
