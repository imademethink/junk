public class Ex4Array
{
    public static void main(String[] args) {

        //float [] arr1 = new float[4];
        //float [] arr2 = new float[4];
        //float [] arr3 = new float[4];
        float [] arr4 = new float[3];

        float [] arr1 = {10.5f,11.5f,12.5f,13.5f};
        float [] arr2 = {20.5f,21.5f,22.5f,23.5f};
        float [] arr3 = {30.5f,31.5f,32.5f,33.5f};

        arr4[0]=arr1[0]; // copy first element of each array in arr4
        arr4[1]=arr2[0]; // copy first element of each array in arr4
        arr4[2]=arr3[0]; // copy first element of each array in arr4

        for (int i = 0; i<=arr4.length-1; i++)
        {

            System.out.println(arr4[i]); // Print arr4
        }


        //for (int i = 0; i<=arr4.length-1)

    }

}
