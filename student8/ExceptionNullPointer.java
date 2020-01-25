package ExceptionExample11;

public class ExceptionNullPointer
{
	public static void main(String[] args) 
	{
		try
		{
			String S1=null;
		System.out.println(S1.charAt(0));
		}
		catch(NullPointerException e)
		{
			System.out.println("Null Pointer");
		}
	}


}
