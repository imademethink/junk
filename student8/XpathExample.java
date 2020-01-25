package Selenium111;


	import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathExample
{
	public static void main(String[] args)
	{
		 WebDriver driver= new ChromeDriver();   
		
    driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
    
    
    // driver.get("https://www.amazon.com/ap/signin?_encoding=UTF8&ignoreAuthState=1&openid.assoc_handle=usflex&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2F%3Fref_%3Dnav_custrec_signin&switch_account=");
   // int c= driver.findElements(By.xpath("//input[@id='ap_email']")).size();
   // System.out.println(c);
    
    //int t= driver.findElements(By.xpath("//input[@class='a-input-text']")).size();
   // System.out.println(t);
    
    
    
  		//github website
      driver.get("https://github.com/");  
  int a= driver.findElements(By.xpath("html/body/div")).size();
     System.out.println(a);
  
     int b= driver.findElements(By.xpath("//body/div")).size();
     System.out.println(b);
  
  //contain method 		
    int x=driver.findElements(By.xpath("//input[contains(@autocomplete,'off')]")).size();
    System.out.println(x);
    
   
    
   ///text method
   int s=driver.findElements(By.xpath("//*[text()='enterprise']")).size();
   System.out.println(s);
  
   int r=driver.findElements(By.xpath("//*[text()='marketplace']")).size();
   System.out.println(r);
  
	}
	
}

