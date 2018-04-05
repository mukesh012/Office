package testcases;


import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class jquery {
	
	@Test
	public void dragdrop() {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/sortable/");
		driver.manage().window().maximize();
		WebElement switchframe1 = driver.findElementByClassName("demo-frame");
		driver.switchTo().frame(switchframe1);
		WebElement selectitem1 = driver.findElementByXPath("//li[@class='ui-state-default ui-sortable-handle'][1]");
		System.out.println(selectitem1.getLocation());
		WebElement selectitem4 = driver.findElementByXPath("//li[@class='ui-state-default ui-sortable-handle'][4]");
		System.out.println(selectitem4.getLocation());
		Actions builder = new Actions(driver);
		builder.dragAndDropBy(selectitem1, 11, 135).perform();
		
	}

}
