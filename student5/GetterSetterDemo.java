public class GetterSetterDemo
{
    private int a = 0;
    private int b = 0;
    int c = 0;
    public void getterMethod(int n1,int n2)
    {
        a=n1;
        b=n2;
    }

    public void setterMethod()
    {
        c = a + b;
        System.out.println("C :" + c);
    }

    public static void main(String[] args) {
        GetterSetterDemo obj1 = new GetterSetterDemo();
        obj1.getterMethod(10,20);
        obj1.setterMethod();
    }
}
