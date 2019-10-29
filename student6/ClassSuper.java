public class ClassSuper
{
    public static void main(String[] args)
    {
        Biketype b= new Biketype();
        b.PrinbtSpec();
    }
}
class Bike
{
    String Name="Yamaha";

}
class Biketype extends Bike
{
    String type="120cc";

    void PrinbtSpec()
    {
        System.out.println(super.Name);
        System.out.println(type);
    }
}
