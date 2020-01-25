
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.WebElement;		
import org.openqa.selenium.chrome.ChromeDriver;		
import org.openqa.selenium.interactions.Actions;		
public class ActionsMethod
{

	public static void main(String[] args)
	{
		
		WebDriver driver= new ChromeDriver();   			
        driver.get("http://demo.guru99.com/test/drag_drop.html");	
        
        driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
        
		//to drag.    		
       	WebElement From=driver.findElements(By.id("fourth")).get(0);	
        
        //to drop.		
        WebElement To=driver.findElement(By.id("amt8"));
        
        			
        Actions act=new Actions(driver);					
        
        act.dragAndDrop(From, To).build().perform();		

	}

}
