package ExceptionExample11;
import java.io.IOException;

public class Exception11
{
	void method()throws IOException
	{  
		  throw new IOException("device error");  
	 }  
		}  
		 class TestException
		{  
		   public static void main(String args[])
		   {  
		    try
		    {  
		    	Exception11 m=new Exception11();  
		     m.method();  
		    }
		    catch(Exception e)
		    {
		    	System.out.println("exception handled");
		    	}     
		    System.out.println("normal flow...");  
		  }

		
		}  

