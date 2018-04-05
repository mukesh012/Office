package selday2;

import org.openqa.selenium.chrome.ChromeDriver;

public class FramesAlerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		Thread.sleep(3000);
		driver.switchTo().frame("iframeResult");
		driver.findElementByXPath("//button[@onclick='myFunction()']").click();
		driver.switchTo().alert().sendKeys("Mkshbb");
		driver.switchTo().alert().accept();
		String ouTput = driver.findElementById("demo").getText();
		if(ouTput.contains("Mkshbb")) 
		{
			System.out.println("Verified");
		}
			else
			{
				System.out.println("Not Matched");
		}
	


	}

}
