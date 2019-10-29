public class ArrayAssignment1
{

    public static void main(String[] args)
    {
        /*Assignment 1*Delare empty array of int with lenght 10 */
        int[] emptyarr=new int [10];
        System.out.println("numbers in empty array are as");
        for (int i=0; i<10; i++)
        {
        System.out.println(i);
        }
        /*Assignment 1Decalre 2D array of char 4*10 and write letters of favorite flower*/
        char[][] flowers=new char[4][10];
        flowers[0]=new char []{'D','A','F','F','O','D','I','L'};
        flowers[1]=new char []{'R','O','S','E'};
        flowers[2]=new char [] {'L','I','L','L','Y'};
        flowers[3]=new char [] {'T','U','L','I','P'};

        System.out.println("Name of the flower is :");

        for (int i=0; i<1; i++)
        {

            for (int j = 0; j <1;j++)
            {

                System.out.print(flowers[2]);

            }

        }

    }
}
