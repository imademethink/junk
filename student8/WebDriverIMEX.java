package Selenium111;
import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverIMEX 
{
	public static void main(String[] args)
	{
		WebDriver driver= new ChromeDriver();   
		driver.get("https://www.github.com/");
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[text()='Enterprise']")).click();
		
		WebDriverWait wait=new 	WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Start a free trial")));
		
		driver.findElement(By.linkText("Start a free trial")).click();
               
		


	}

}
