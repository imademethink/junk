package Selenium111;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSExSubStringMethod
{
    public static void main(String[] args)
	{
    	 WebDriver driver= new ChromeDriver();   
  
    	 
    	 //github website
//         driver.get("https://github.com/");  
//         driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
//         
//         //Starts with (^)
//        int a= driver.findElements(By.cssSelector("input[name^='user']")).size();
//        System.out.println(a);
//        int b= driver.findElements(By.cssSelector("input[name*='email']")).size();
//        System.out.println(b);
//        int c= driver.findElements(By.cssSelector("input[name*='password']")).size();
//        System.out.println(c);
//         
        //facebok website
        driver.get("https://www.facebook.com/");  
        driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
        
        //Starts with (^)
       int a= driver.findElements(By.cssSelector("input[name^='firstname']")).size();
       System.out.println(a);
       int b= driver.findElements(By.cssSelector("input[name*='lastname']")).size();
       System.out.println(b);
       int c= driver.findElements(By.cssSelector("input[name*='reg_email']")).size();
       System.out.println(c);
       int d =driver.findElements(By.cssSelector("input[name*='reg_passwd']")).size();
      System.out.println(d);
        


	}

}
