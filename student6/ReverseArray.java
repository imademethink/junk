public class ReverseArray
{
    public static void main(String[] args)
    {
        int arr[]={1,2,3,4,5,6,7};

        for(int i=arr.length-1;i>=0;i--)
        {
            System.out.print(arr[i]+" ");
        }


        /*int var[]=new int[10];
        for(int i=var.length;i>=0;i--)
        {
            for (int j=0;j<=i;j++)
            {
                //System.out.println("");
                System.out.print(j +" ");

            }
            System.out.println();
        }*/

       /* int var1[]=new int[10];
        for(int i=var1.length;i>=0;i--)
        {
            for (int j=0;j<=i;j++)
            {
                //System.out.println("");
                System.out.print(i);

            }
            System.out.println();
        }*/

    }
}
