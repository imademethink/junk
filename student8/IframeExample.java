

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.WebElement;			

public class IframeExample
{

	public static void main(String[] args) 
	{
		
		WebDriver driver= new ChromeDriver(); 
		 driver.get("https://www.toolsqa.com/iframe-practice-page");
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		 
		 WebElement element=driver.findElement(By.name("iframe1"));
		 driver.switchTo().frame(0);
		
		 driver.findElement(By.xpath("//*[text()='Tutorial']")).getAttribute("class");
		 driver.switchTo().defaultContent();
		 
		 
		 WebElement element1=driver.findElement(By.name("iframe2"));
		 driver.switchTo().frame(element1);
		
		 driver.findElement(By.xpath("//*[text()='Sortable']")).click();
		 
		
		 
		 driver.switchTo().defaultContent();
		 		 
		
		 
		 

	}

}
