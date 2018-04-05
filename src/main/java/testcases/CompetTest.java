package testcases;

import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import wdMethods.SeMethods;

public class CompetTest extends SeMethods{
	@Test
	public void servicenow() throws InterruptedException
	{
		startApp("chrome", "https://dev39457.service-now.com/");
		WebElement Setichframe = locateElement("id","gsft_main");
		switchToFrame(Setichframe);
		WebElement EnterUserNm = locateElement("id","user_name");
		type(EnterUserNm, "admin");
		WebElement EnterPw = locateElement("id","user_password");
		type(EnterPw, "KiranBedi123$");
		WebElement ClickLogin = locateElement("id","sysverb_login");
		click(ClickLogin);
		Thread.sleep(3000);
		WebElement IncidentEntr = locateElement ("id","filter");
		type(IncidentEntr, "Incident");
		WebElement ClickIncident = locateElement("xpath"," //div[text()='Create New']");
		click(ClickIncident);
		Thread.sleep(3000);
		WebElement Swtichframe1 = locateElement("xpath","//iframe[@id='gsft_main']");
		switchToFrame(Swtichframe1);
		String CaptureID = locateElement("xpath","//input[@id='incident.number']").getAttribute("value") ;
		WebElement SelectContact = locateElement("id","incident.contact_type");
		selectDropDownUsingText(SelectContact, "Email");
		WebElement clickSrch = locateElement("xpath","(//span[@class='icon icon-search'])[1]");
		clickWithoutSnap(clickSrch);
		Thread.sleep(9000);
		switchToWindow(1);
		WebElement SearchEl = locateElement("xpath","//input[@class='form-control']");
		Thread.sleep(3000);
		type(SearchEl, "Abel");
		SearchEl.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		WebElement clickresult = locateElement("xpath","(//a[@class='glide_ref_item_link'])[1]");
		clickWithoutSnap(clickresult);
		Thread.sleep(3000);
		switchToWindow(0);
		WebElement Setichframe2 = locateElement("xpath","//iframe[@id='gsft_main']");
		switchToFrame(Setichframe2);
		WebElement EnterShortDesc = locateElement("id","incident.short_description");
		type(EnterShortDesc,"Ticket Created Successfully");
		WebElement clicksubmit = locateElement("id","sysverb_insert");
		click(clicksubmit);
		Thread.sleep(3000);
		switchToWindow(0);
		WebElement Swtichframe3 = locateElement("xpath","//iframe[@id='gsft_main']");
		switchToFrame(Swtichframe3);
		Thread.sleep(3000);
		WebElement SearchE2 = locateElement("xpath","//input[@class='form-control']");
		type(SearchE2,CaptureID);
		SearchE2.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		WebElement ticketID = locateElement("xpath","(//a[@class='linked formlink'])[1]");
		verifyExactText(ticketID,CaptureID);
			}


}




