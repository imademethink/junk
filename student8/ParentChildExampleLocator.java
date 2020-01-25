package Selenium111;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParentChildExampleLocator
{
	public static void main(String[] args) 
	{
		 WebDriver driver= new ChromeDriver();   
		  
		//github website
    driver.get("https://github.com/");  
    driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
    
    
    //parent child method
  int a= driver.findElements(By.cssSelector(".input-label>label")).size();
     System.out.println(a);
		

	}

}
