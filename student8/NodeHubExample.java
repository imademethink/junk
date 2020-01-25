import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
 
import java.net.MalformedURLException;
import java.net.URL;
 
public class NodeHubExample
{

	public static void main(String[] args) throws MalformedURLException, InterruptedException
	{
		
		String URL = "http://www.DemoQA.com";
		 String Node = "http://192.168.0.4:4444/wd/hub";
		 DesiredCapabilities cap = DesiredCapabilities.chrome();

		 WebDriver	 driver = new RemoteWebDriver(new URL(Node), cap);
		 
		 driver.navigate().to(URL);
		 Thread.sleep(5000);
		 driver.quit();
	}
 } 

