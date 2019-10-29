public class Day2Ex12
{
    public static void main(String[] args) {
        int varLength = 10;

        for (int i = 0 ; i <= varLength-1; i++)
        {
            System.out.println(i);
            for (int j = i; j <= varLength-1; j++)
            {
                System.out.println(j);
            }
            //System.out.println("/n");
        }

    }
}
