public abstract class GrandParent
{
    public abstract void FamilyName();
    public void name()
    {
        System.out.println("Checking non abstract method");
    }


}
class Parents extends GrandParent
{
    public void FamilyName()
    {
        System.out.println("The Parent Name: Deepak");
        int i=4;
        System.out.println(i);
    }

    public static void main(String[] args)
    {
        Parents P= new Parents();
        P.FamilyName();
        P.name();

    }
}


