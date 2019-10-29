
abstract class base
{
    private String name = "tushar";
    public String company = "Capgemini";

    base()
    {
        System.out.println("Base class costructor");
        System.out.println("Private Varibale : " + name);
    }

    abstract void fun();
}

public class ParentAbstarct extends  base
{
    void fun()
    {
        System.out.println("Base class abstract method");
    }

    public static void main(String[] args) {

        base obj = new ParentAbstarct();
        obj.fun();
        System.out.println("Public Varibale : " + obj.company);

    }

}


