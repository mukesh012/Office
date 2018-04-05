package selday2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homeworktask {

	public static void main(String[] args) throws InterruptedException {
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
		//driver.findElementById("createLeadForm_companyName").sendKeys("FISGBS");
		//driver.findElementById("createLeadForm_firstName").sendKeys("MukeshBabu");
	//	driver.findElementById("createLeadForm_lastName").sendKeys("Selvakumar");
		//driver.findElementByXPath("//input[@id='createLeadForm_primaryPhoneNumber']").sendKeys("8122039188");
	//	driver.findElementByClassName("smallSubmit").click();
		driver.findElementByLinkText("Merge Leads").click();
		driver.findElementByXPath("(//img[@src='/images/fieldlookup.gif'])[1]").click();
		Set<String> Windows = driver.getWindowHandles();
		
		for (String allvalues : Windows) {
			System.out.println(allvalues);
		}
		List<String> eachVal = new ArrayList<String>();		eachVal.addAll(Windows);
		driver.switchTo().window(eachVal.get(1));
		System.out.println(driver.getTitle());
		driver.findElementByXPath("//input[@name='id']").sendKeys("10277");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(3000);
		driver.findElementByLinkText("10277").click();
		driver.switchTo().window(eachVal.get(0));
		driver.findElementByXPath("(//img[@src='/images/fieldlookup.gif'])[2]").click();
		
Set<String> Windows2 = driver.getWindowHandles();
		
		for (String allvalues2 : Windows2) {
			System.out.println(allvalues2);
		}
		List<String> eachVal2 = new ArrayList<String>();
		eachVal2.addAll(Windows2);
		driver.switchTo().window(eachVal2.get(1));
		System.out.println(driver.getTitle());
		driver.findElementByXPath("//input[@name='id']").sendKeys("10278");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(3000);
		driver.findElementByLinkText("10278").click();
		driver.switchTo().window(eachVal2.get(0));
		driver.findElementByXPath("//a[@class='buttonDangerous']").click();
		driver.switchTo().alert().accept();
		driver.findElementByXPath("//a[@href='/crmsfa/control/findLeads']").click();
		driver.findElementByXPath("//input[@name='id']").sendKeys("10277");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(3000);
		WebElement verify = driver.findElementByXPath("//div[text()='No records to display']");
		System.out.println(verify.getText());
		driver.close();
	}

}
