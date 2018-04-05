package dataprovider;



import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
import wdMethods.ProjectMethods;


public class CreateLead extends ProjectMethods{

	@Test(dataProvider="data1",dataProviderClass=ExcelDataprovider.class)
	public void login(String Cmpnynm,String fn, String ln, String phn, String Email)  {	
		WebElement clickleadstab = locateElement ("link","Leads");
		click(clickleadstab);
		WebElement createlead = locateElement ("link","Create Lead");
		click(createlead);
		WebElement EnterCmpynm = locateElement ("createLeadForm_companyName");
		type(EnterCmpynm, Cmpnynm);
		WebElement Enterfn = locateElement ("createLeadForm_firstName");
		type(Enterfn, fn);
		WebElement Enterln = locateElement ("createLeadForm_lastName");
		type(Enterln, ln);
		WebElement Source = locateElement("id", "createLeadForm_dataSourceId");
		selectDropDownUsingText(Source, "Cold Call");
		type (locateElement("id", "createLeadForm_primaryEmail"),Email);
		WebElement EnterPhn = locateElement ("xpath","//input[@id='createLeadForm_primaryPhoneNumber']");
		type (EnterPhn,phn);
		WebElement submitlead = locateElement("class","smallSubmit");
		click(submitlead);
	
	}

}
