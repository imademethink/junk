public class Ex1Array
{
    public static void main(String[] args) {

        int [] arr = new int [10]; // blank array with size of 10
               // {10,20,30,40,50,60,70,80,90,100};
        int [] number = {10,20,30,40,50,60,70,80,90,100}; // int array of length 10

        for (int i = 0; i<=arr.length-1; i++)
        {
            arr[i]=number[i];           // coping int in number array to blank array arr.
        }

        for (int j=0; j<=number.length-1; j++)
        {
            System.out.println(arr[j]);         // Display new array.
        }

        /*

        for(int i=0; i<=arr.length-1; i++)
        {
            System.out.println(arr[i]);
        }
        */

    }

}
