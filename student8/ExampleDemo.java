package Selenium111;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.chrome.ChromeOptions;
	import org.openqa.selenium.remote.DesiredCapabilities;

	public class ExampleDemo 
	{
	   
		public static void main(String[] args)
	    {
	       // System.setProperty("webdriver.chrome.driver","browser_driver\\chromedriver.exe");

	        ChromeOptions options = new ChromeOptions();
	        options.addArguments("start-maximized");
	        options.addArguments("--disable-infobars");//controll by automation.
	        options.addArguments("--incognito");
	        options.addArguments("--disable-popup-blocking");
	        options.addArguments("--no-sandbox");
	        options.addArguments("--disable-dev-shm-usage");
	        DesiredCapabilities chromeCapabilities = DesiredCapabilities.chrome();
	        chromeCapabilities.setCapability(ChromeOptions.CAPABILITY, options);

			WebDriver driver = new  ChromeDriver(chromeCapabilities);

	        driver.get("https://www.youtube.com");

	    }
	}


