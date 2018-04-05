package selday1;


import org.openqa.selenium.chrome.ChromeDriver;

public class Day1 {

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
//driver.findElementByLinkText("Leads").click();
//driver.findElementByLinkText("Create Lead").click();
//driver.findElementById("createLeadForm_companyName").sendKeys("FISGBS");
//driver.findElementById("createLeadForm_firstName").sendKeys("MukeshBabu");
//driver.findElementById("createLeadForm_lastName").sendKeys("Selvakumar");
//driver.findElementByXPath("//input[@id='createLeadForm_primaryPhoneNumber']").sendKeys("8122039188");
//driver.findElementByClassName("smallSubmit").click();
driver.findElementByXPath("//a[@href='/crmsfa/control/leadsMain']").click();
driver.findElementByXPath("//a[@href='/crmsfa/control/findLeads']").click();
driver.findElementByLinkText("Phone").click();
driver.findElementByXPath("//input[@name='phoneCountryCode']").clear();
//driver.findElementByXPath("//input[@name='phoneCountryCode']").sendKeys("91");
driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys("8122039188");
driver.findElementByXPath("//button[text()='Find Leads']").click();
//driver.findElementByXPath("//a[contains(text(),'15007')][1]").click();
//Multiple times this variable exists @Use collections
Thread.sleep(5000);
driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
//driver.findElementByLinkText("FISGBS").click();
//driver.findElementByXPath("//a[@href='updateLeadForm?partyId=15007']").click();
driver.findElementByXPath("//input[@id='updateLeadForm_companyName']").clear();
driver.findElementByXPath("//input[@id='updateLeadForm_companyName']").sendKeys("FISGBSM");
driver.findElementByXPath("//input[@value='Update']").click();
//driver.close();
	}
}
