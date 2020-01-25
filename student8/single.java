
class Level
{
   public void Gparent()
	{
		System.out.println("This is Gparent");
	}
}
class parent extends Level
{
	public void child()
	{
		System.out.println("This is parent");
	}
}
	public class single
	{
	public static void main (String [] args){
		parent S = new parent();
		S.Gparent();
		S.child();
		
	}
	}





