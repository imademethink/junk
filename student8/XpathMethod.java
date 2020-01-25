package Selenium111;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathMethod 
{
public static void main(String[] args)
	{
		WebDriver driver= new ChromeDriver();   
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		driver.get("http://facebook.com/ ");
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("shjhfghjf");
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("234576");
		driver.findElement(By.xpath("//*[@id='u_0_b']")).click();
		//driver.findElement(By.xpath("//*[@id='u_0_m']")).clear();  

		
		List<WebElement> a= driver.findElements(By.xpath("//*[@id='u_0_r']"));
		 ((WebElement) a).getTagName();
		
		driver.findElement(By.xpath("//*[@id='email']")).getText();
		driver.findElement(By.xpath(("//*[@id='u_0_6']"))).isSelected();
		
	if(driver.findElement(By.xpath("//*[@id='pageFooterChildren']")).isDisplayed() );
	{
		System.out.println("Element found");
	}
	
	{
		System.out.println("Element Not found");
	}

		
		String s=	driver.findElement(By.xpath("//*[@id='u_0_m']")).getAttribute("//*[@name=firstname']");
		System.out.println(s);
		
	//driver.get("https://www.toolsqa.com/");
	//driver.findElement(By.xpath("//*[@id='primary-menu']")).findElement(By.xpath("//*[@id='primary-menu']")).click();	

	
	

	}

}


