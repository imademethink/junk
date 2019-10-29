public class MethodEx
{
    int gobalid=1;
    static String str= "XYZ";
    final int got=44;
    static void BasicTest()
    {
        System.out.println("The is the static menthod 1");
    }

    public final void talk()
    {
        System.out.println("Hello");
    }
    static void Testbasic()
    {
        System.out.println("The is the static menthod 2");
    }
    public void IncreaseSpeed(float newspeed)
    {
        System.out.println("increasing speed upto:"+newspeed);
    }

    public static void main(String[] args)
    {
        MethodEx.BasicTest();
        MethodEx.Testbasic();
        System.out.println(MethodEx.str);
        String str="123";
        System.out.println(str);
        MethodEx T=new MethodEx();
        System.out.println(T.gobalid);
        T.IncreaseSpeed(33.4f);
        System.out.println(T.got);
        T.talk();
    }
}
