import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassExample
{
	
	public static void main(String[] args)
	{
		 WebDriver driver= new ChromeDriver();   
		 driver.get("https://global.oup.com/");  
		 driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		
		 //Single move
		Actions Obj= new Actions(driver);
	//	Object.moveToElement(driver.findElements(By.className("nav_text")).get(1)).build().perform();
		
		//Multi move
	   Obj.moveToElement(driver.findElement(By.xpath("//*[@id='top_navigation']/ul/li[1]/span[@class='nav_text']")));
		
		Obj.moveToElement(driver.findElements(By.xpath("//a[text()='Our Mission']")).get(0)).click().build().perform();
		
		

		

	}

}//*[
