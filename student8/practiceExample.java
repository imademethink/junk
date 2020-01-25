package Selenium111;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;

public class practiceExample
{
  public static void main(String[] args)
  {
	 WebDriver driver= new ChromeDriver();   
    driver.get("https://www.toolsqa.com/automation-practice-form/");  
    driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
	
    driver.findElement(By.cssSelector("input[name=firstname]")).sendKeys("Selenium");
    driver.findElement(By.cssSelector("input[id=lastname]")).sendKeys("welcome");
    
    //int a=driver.findElements(By.cssSelector(("input[type='text]")).size();
    //System.out.println(a);
	driver.findElement(By.cssSelector("button[id=idOfButton]")).click();  
	
	driver.findElement(By.cssSelector("input[type='text']")).sendKeys("1/1/2020");
	driver.findElement(By.cssSelector("input[id=tool-0]")).click();
	driver.close();
  }
}


