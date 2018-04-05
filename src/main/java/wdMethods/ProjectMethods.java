package wdMethods;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class ProjectMethods extends SeMethods{
	
	@Parameters({"browser","URL","usernm","passwrd"})
	@BeforeMethod(groups="common")
	public void LoginLeaftaps(String browser,String URL, String usernm,String passwrd)
	{
		startApp(browser, URL);
		WebElement userName = locateElement("username");
		type(userName, usernm);
		WebElement password = locateElement("password");
		type(password, passwrd);
		WebElement submit = locateElement("class", "decorativeSubmit");
		click(submit);
		WebElement click = locateElement("link","CRM/SFA");
		click(click);
	}
	@AfterMethod(groups="common")
	public void CloseApp()
	{
		closeBrowser();
	}
}
	

/*
<parameter name="browser" value="chrome"></parameter>
<parameter name="URL" value="http://leaftaps.com/opentaps"></parameter>
<parameter name="usernm" value="DemoSalesManager"></parameter>
<parameter name="password" value="crmsfa"></parameter>*/