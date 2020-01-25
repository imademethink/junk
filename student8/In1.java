
interface In1 
{
	final int a =10;
	void display();
}

interface In2
{
	final int b =20;
	void display1();
}


 class TestClass implements In1,In2
{
	public void display()
	{
        System.out.println("Exam");
    }
	public void display1()
	{
        System.out.println("Study");
    }
	
	public static void main(String args[])
	{
		TestClass obj=new TestClass();
		obj.display();
		obj.display1();
        //System.out.println("a");
        //System.out.println("b");

		
	}
	
}
