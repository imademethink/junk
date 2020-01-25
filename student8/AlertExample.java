import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.WebElement;		
import org.openqa.selenium.chrome.ChromeDriver;	

public class AlertExample
{

	public static void main(String[] args)
	{
		WebDriver driver= new ChromeDriver(); 
		 driver.get("http://demo.guru99.com/test/delete_customer.php");
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		 
		 driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("dfgh");
		 driver.findElement(By.xpath("//input[@name='submit']")).click();
		 
		driver.switchTo().alert();
		driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
	}

}
