public class ArrayWhileLoop
{
    public static void main(String[] args)
    {


    int arry[][]=new int[5][5];
        arry[0]= new int []{1,2,3,4,5};
        arry[1]= new int []{11,12,13,14,15};
        arry[2]= new int []{21,22,23,24,25};
        arry[3]= new int []{31,32,33,34,35};
        arry[4]= new int []{41,42,43,44,45};


        int i = 0;

        while(i<arry.length)
        {
            int j = 0;
            while (j < arry[i].length) {
                System.out.print(arry[i][j] +" ");
                j++;

            }
            i++;
            System.out.println(" ");

        }

    }
}
