package testngimp;


import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
import wdMethods.ProjectMethods;


public class CreateLead extends ProjectMethods{

	@Test(groups="smoke")
	public void login() throws InterruptedException {		
		WebElement clickleadstab = locateElement ("link","Leads");
		click(clickleadstab);
		WebElement createlead = locateElement ("link","Create Lead");
		click(createlead);
		WebElement EnterCmpynm = locateElement ("createLeadForm_companyName");
		type(EnterCmpynm, "FISGBS");
		WebElement Enterfn = locateElement ("createLeadForm_firstName");
		type(Enterfn, "Praveen");
		WebElement Enterln = locateElement ("createLeadForm_lastName");
		type(Enterln, "Selvakumar");
		WebElement Source = locateElement("id", "createLeadForm_dataSourceId");
		selectDropDownUsingText(Source, "Cold Call");
		type (locateElement("id", "createLeadForm_primaryEmail"),"mukesh012@live.com");
		WebElement EnterPhn = locateElement ("xpath","//input[@id='createLeadForm_primaryPhoneNumber']");
		type (EnterPhn,"8122039188");
		WebElement submitlead = locateElement("class","smallSubmit");
		click(submitlead);
	
	}


}
