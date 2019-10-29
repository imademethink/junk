interface RBI1
{
    int a =4;

    public void fun1();
}

interface RBI2
{
    int a = 100;
    public void fun2();
}

class HDFC2 implements RBI1,RBI2
{
    @Override
    public void fun1() {

    }
    public void fun2()
    {

    }

    public static void main(String[] args) {
        RBI1 obj1 = new HDFC2();
        System.out.println(obj1.a);
    }
}
