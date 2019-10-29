public class Child extends Parent
{
    static void method1()
    {
        System.out.println("Child class method");
    }

    public static void main(String[] args) {
        Child obj = new Child();
        obj.method1();

        Parent obj1 = new Child();
        obj1.method1();
    }
}
