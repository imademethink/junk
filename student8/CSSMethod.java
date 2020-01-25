package Selenium111;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSMethod
{
  public static void main(String[] args)
  {
	  WebDriver driver= new ChromeDriver();   
      driver.get("https://www.facebook.com/");  
      driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
      
      // Tag,Class and Attribute and 
      driver.findElement(By.cssSelector("input.inputtext[name='firstname']")).sendKeys("javaTpoint Tutorials");  
       
      driver.findElement(By.cssSelector("input.inputtext[name='lastname']")).sendKeys("admin");
        
      driver.findElement(By.cssSelector("input#email[data-testid='royal_email']")).sendKeys("pooja");
      
      driver.close();  
   }  
}