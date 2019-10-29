interface intf1{
    public void method1();

}
interface intf2 extends intf1{
    public void method2();
}

public class IntDemo implements intf2{


    public void method1()
    {
        System.out.println("Method 1");
    }
    public void method2()
    {
        System.out.println("Method 2");
    }

    public static void main(String[] args) {
        intf2 F=new IntDemo();
        F.method2();
        F.method1();
    }
}
