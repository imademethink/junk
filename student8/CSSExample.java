package Selenium111;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class CSSExample
{
public static void main(String[] args)
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.testandquiz.com/selenium/testing.html");
    driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
   
    //Tag and ID Selector
    driver.findElement(By.cssSelector("#fname"));
	driver.findElement(By.cssSelector("input#fname")).sendKeys("pooja");
  
	//Tag and class Selector
	driver.findElement(By.cssSelector("input.Automation")).click();
	driver.findElement(By.cssSelector("input.Performance")).click();
	
	//Tag and attribute Selector
	driver.findElement(By.cssSelector("input[id=fname]")).sendKeys("Selenium");
	driver.findElement(By.cssSelector("button[id=idOfButton]")).click();  

	driver.manage().window().maximize();
	driver.close();
}


}
