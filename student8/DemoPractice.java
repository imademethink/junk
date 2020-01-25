package Selenium111;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class DemoPractice
{
public static void main(String[] args)
	{
		 WebDriver driver= new ChromeDriver();   
		 driver.get("http://automationpractice.com/ ");		 
		 
		 int a= driver.findElements(By.xpath("html/body/div")).size();
	     System.out.println(a);
	  
	     int b= driver.findElements(By.xpath("//body/div")).size();
	     System.out.println(b);
	     
	     //Using traditional and  normal selectors
	     int t= driver.findElements(By.xpath("//input[@id='email']")).size();
	      System.out.println(t);
	      
	     int size= driver.findElements(By.xpath("//input[@name='passwd']")).size();
	     System.out.println(size);

	}

}
