public class Ex11Array
{
    public static void main(String[] args) {


        int [] arr1 = {1,2,3};
        int [] arr2 = {-1,-4,-3,-4,-5};
        int [] arr3 = new int[5];

        int len = (arr1.length > arr2.length) ? arr2.length: arr1.length;

        for(int i=0;i< len; i++)
        {
                    arr3[i]=arr1[i] + arr2[i];
                    System.out.println(arr3[i]);



        }

        /*for (int i =0 ; i<=arr1.length-1; i++)
        {
            arr3[i]= arr1[i] + arr2[i];
        }

        for (int j =0; j<=arr3.length-1;j++)
        {
            System.out.println("sum of array :" + arr3[j]);
        }*/


    }
}
