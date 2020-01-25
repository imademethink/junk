import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import  org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.WebElement;	
public class WindowHandleExample
{

	public static void main(String[] args) throws Exception
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://chandanachaitanya.github.io/selenium-practice-site/");
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		// Get current window handle
	        String parentWinHandle = driver.getWindowHandle();
	        
	        System.out.println("Parent window handle: " + parentWinHandle);
	        
	        // Locate 'Click to open a new browser window!' button using id
	        WebElement newWindowBtn = driver.findElement(By.id("windowMaximize"));
	        // Click the button to open a new window
	        newWindowBtn.click();
	        // Get the window handles of all open windows
	        Set<String> winHandles = driver.getWindowHandles();
	        for(String handle: winHandles)
	        {
	            if(!handle.equals(parentWinHandle))
	            {
	            driver.switchTo().window(handle);
	            Thread.sleep(1000);
	            System.out.println("Title of the new window: " +
	            	driver.getTitle());
	            System.out.println("Closing the new window...");
	            driver.close();
	            }
	        }
	        // Switching the control back to parent window
	        driver.switchTo().window(parentWinHandle);
	        // Print the URL to the console
	        System.out.println("Parent window URL: " + driver.getCurrentUrl());


	}

}
