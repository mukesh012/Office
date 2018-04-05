package selday1;




import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownvals {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElementById("username").clear();
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Create Lead").click();
		Thread.sleep(5000);
		WebElement Source  = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select dropdown = new Select(Source);
		dropdown.selectByValue("LEAD_COLDCALL");
		//Select Source = new Select (driver.findElement(By.id("createLeadForm_dataSourceId")));
		//Source.selectByValue("LEAD_COLDCALL");
		
		List<WebElement> allvals = dropdown.getOptions();
		int soureVals = allvals.size();
		for(int l = 0; l < soureVals; l++)
		{
		    System.out.println(allvals.get(l).getText());
		}
		
	
		}
}
