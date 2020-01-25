package Selenium111;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_chrome
{
public static void main(String[] args)
	{
		
	//System.setProperty("webdriver.chrome.driver","browser_driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();

		
			String baseUrl="https://www.toolsqa.com/automation-practice-form/";
			driver.get(baseUrl);
			driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
			driver.findElement(By.name("firstname")).sendKeys("admin");
			driver.findElement(By.id("lastname")).sendKeys("abc");
			
			driver.findElement(By.linkText("Link Test")).click();
			driver.navigate().back();
			driver.findElement(By.partialLinkText("Partial Link Test")).click();
			driver.navigate().back();
			
			driver.findElement(By.id("datepicker")).sendKeys("12/12/2019");
			
			driver.findElement(By.id("buttonwithclass")).click();
		
			driver.findElement(By.className("control-label"));
			driver.findElement(By.tagName("button")).click();
			
		//	int total_size=driver.findElement(By.tagName("input")).size();
			System.out.println("total_size");
			
	}

}
