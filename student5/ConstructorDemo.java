public class ConstructorDemo
{
    int a = 0;
    int b = 0;
    int sum =0;

    ConstructorDemo()
    {
        System.out.println("Constructor Demo :");
    }

    ConstructorDemo(int no1,int no2)
    {
        a=no1;
        b=no2;
        sum = no1 + no2;
        System.out.println("sum :" + sum);
    }


    public static void main(String[] args) {

        ConstructorDemo obj1 = new ConstructorDemo();
        ConstructorDemo obj2 = new ConstructorDemo(10,20);


    }

}
