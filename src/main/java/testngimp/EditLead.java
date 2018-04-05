package testngimp;


import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;


import wdMethods.ProjectMethods;

public class EditLead extends ProjectMethods{
	
	@Test(groups="smoke")
	public void Edit(){
	WebElement clicklead = locateElement ("xpath","(//div[@class='x-panel-header']/a)[2]");
	click(clicklead);
	WebElement findlead = locateElement ("xpath","(//ul[@class='shortcuts']/li/a)[3]");
	click(findlead);
	WebElement Click1stlead = locateElement ("xpath","(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a)[1]");
	String Textvalue = Click1stlead.getText();
	WebElement EnterFN = locateElement ("xpath","(//div[@class='x-form-element']/input)[14]");
	type(EnterFN,Textvalue);
	WebElement clickfindlead = locateElement ("xpath","(//td[@class='x-btn-center']/following :: button)[6]");
	click(clickfindlead);
	WebElement clicklead1 = locateElement("xpath","//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a");
	click(clicklead1);
	verifyTitle("View Lead | opentaps CRM");
	WebElement clickEdit = locateElement ("link","Edit");
	click(clickEdit);
	WebElement EditCmpny1 = locateElement("id","updateLeadForm_companyName");
	EditCmpny1.clear();
	type(EditCmpny1,"FISGBS");
	locateElement("class","smallSubmit").click();
	WebElement verifytxt = locateElement ("id","viewLead_companyName_sp");
	verifyPartialText(verifytxt, "FISGBS");
	
	
	

}
}