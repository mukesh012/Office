package selday2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		driver.findElementByLinkText("Contact Us").click();
		System.out.println(driver.getTitle());
		Set<String> Windows = driver.getWindowHandles();
		
		for (String allvalues : Windows) {
			System.out.println(allvalues);
		
		}
		List<String> eachVal = new ArrayList<String>();
		eachVal.addAll(Windows);
		driver.switchTo().window(eachVal.get(1));
		System.out.println(driver.getTitle());
		
	driver.switchTo().window(eachVal.get(0)).close();
		
	}

}
