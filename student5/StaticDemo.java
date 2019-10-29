
public class StaticDemo
{
    int a =10;
    static int b =20;


    public static void add()
    {
        StaticDemo s = new StaticDemo();

        int c = s.a+b;
        System.out.println(c);
        //return c;
    }

    public static void main(String[] args) {


        StaticDemo.add();

    }

}
