package ExceptionExample11;

public class ExceptionArithmetic
{
public static void main(String[] args) 
{
	try
	{
		int data =100/0;
	}
	catch(ArithmeticException e)
	{
		System.out.println("Divide by zero");
	}
		
}

}
