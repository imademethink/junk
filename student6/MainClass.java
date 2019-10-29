abstract class Base{
    abstract void fun();
    public void moreFun()
    {
        System.out.println("FunMOre");
    }
}


public class MainClass extends Base
{
    void fun()
    {
        System.out.println("Main function called");
    }

    public static void main(String[] args)
    {
        Base B=new MainClass();
        B.fun();
    }
}


