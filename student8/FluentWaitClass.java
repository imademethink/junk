package Selenium111;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.FluentWait; //FluentWait is a Class and it is a part of this package 
import com.google.common.base.Function;
import org.openqa.selenium.support.ui.WebDriverWait;
public class FluentWaitClass
{
	public static void main(String[] args)
	{
		WebDriver driver = new FirefoxDriver();
		 driver.get("http://softwaretestingplace.blogspot.com/2017/02/selenium-fluent-wait.html");
		 driver.findElement(By.xpath("//*[@id='post-body-5280210221385817166']/div[1]/button")).click();
		 
		 
		 FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
		        .withTimeout(30, TimeUnit.SECONDS)
		        .pollingEvery(5, TimeUnit.SECONDS)
		        .ignoring(NoSuchElementException.class);
		 
		 WebElement element = wait.until(new Function<WebDriver, WebElement>()
		 {
	public WebElement apply(WebDriver driver)
	{
		 WebElement element = driver.findElement(By.xpath("//*[@id='demo']"));
		 String getTextOnPage = element.getText();
		 if(getTextOnPage.equals("Software Testing Material - DEMO PAGE"))
		 {
		 System.out.println(getTextOnPage);
		 return element;
		 }else
		 {
		 System.out.println("FluentWait Failed");//polling processs.then run the code.
		 return null;
		 }
		 
	}
		 
		 });///full function as arguement for fluent webdriver
}
}
 

