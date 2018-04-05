package testcases;

import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import wdMethods.SeMethods;

public class Servicenowdragdrop extends SeMethods{
	
	@Test
	public void servicenw() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://dev40020.service-now.com/");
		WebElement swichframe = driver.findElementById("gsft_main");
		driver.switchTo().frame(swichframe);
		driver.manage().window().maximize();
		driver.findElementById("user_name").sendKeys("admin");
		driver.findElementById("user_password").sendKeys("KiranBedi123$");
		driver.findElementById("sysverb_login").click();
		Thread.sleep(7000);
		driver.findElementById("filter").sendKeys("Incident");
		Thread.sleep(3000);
		driver.findElementByXPath("(//div[text()='Incidents'])[2])").click();
		Thread.sleep(3000);
		Actions clickIncident = new Actions(driver);
		WebElement IncidentID = driver.findElementByXPath("//td/a[@class='linked formlink']");
		clickIncident.contextClick(IncidentID);
		driver.findElementByClassName("context_item").click();
		
	
	}

}
