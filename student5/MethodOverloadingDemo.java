public class MethodOverloadingDemo
{
    int a,b,c;
    int sum = 0;

    MethodOverloadingDemo(int n1,int n2)
    {
        a=n1;
        b=n2;
        sum = a + b;
        System.out.println("Sum of 1st constructor : "+ sum);
    }
    MethodOverloadingDemo(int n1,int n2,int n3)
    {
        a=n1;
        b=n2;
        c=n3;
        sum=a+b+c;
        System.out.println("Sum of 2nd constructor : "+ sum);
    }

    public static void main(String[] args) {

        MethodOverloadingDemo obj1 = new MethodOverloadingDemo(10,20);
       MethodOverloadingDemo obj2 = new MethodOverloadingDemo(10,20,30);
        //obj1.add(10,20);
        //obj1.add(10,20,30);
    }
}
