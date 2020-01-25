package Selenium111;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo 
{
	public static void main(String args[])
	{
		//System.setProperty("webdriver.geckodriver, /usr/local/bin");
		WebDriver obj=new ChromeDriver();
	
		String baseUrl="http://www.toolsqa.com";
		obj.get(baseUrl);
		String a = obj.getTitle();
		String b =obj.getCurrentUrl();
		
		 System.out.println( a);
		 System.out.println( b);
	
		obj.navigate().to("gmail.com");
		//obj.close();
		//obj.quit();
		obj.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
	}
}