package Selenium111;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PraticeForCssSelectorHOme
{
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/V1/index.php");
	    driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
	    
		//Tag and Atrribute
		driver.findElement(By.cssSelector("input[name=uid]")).sendKeys("pooja");
		
		driver.findElement(By.cssSelector("input[type=password]")).sendKeys("23345");
		
		//SubString Method
		int b= driver.findElements(By.cssSelector("input[name*='uid']")).size();
	    System.out.println(b);
	    int b1= driver.findElements(By.cssSelector("input[name*='password']")).size();
	    System.out.println(b1);
	    
	    //parent child method
	    int a= driver.findElements(By.cssSelector(".input-label>label")).size();
	     System.out.println(a);


	 
	}

}
