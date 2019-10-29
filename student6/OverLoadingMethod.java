public class OverLoadingMethod

{

    public int sum(int x, int y)
    {
        System.out.println("method 1");
        int add=x+y;
        return(add);
    }
    public void sum(int x, float y)
    {
        System.out.println(x+y);

    }
    public static void main(String[] args)
    {
        OverLoadingMethod OV=new OverLoadingMethod();

        System.out.println(OV.sum(2,3));
        OV.sum(3,12.3f);

    }

}
