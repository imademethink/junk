import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.WebElement;		
import org.openqa.selenium.chrome.ChromeDriver;	
public class JavaScriptHandlerExample
{
public static void main(String[] args)
{
	WebDriver driver= new ChromeDriver();   			
    driver.get("http:github.com");	
    JavascriptExecutor js = (JavascriptExecutor)driver;
    
    driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
    
    js.executeScript("window.scrollBy(0,600)");
    
   

    
    
    
    
    
}

}
