public class EX12Pattern
{
    public static void main(String[] args) {

        int varLength = 10;

        for (int i = varLength; i >= 0; i--)
        {
            for (int j = 0; j < i; j++)
            {
                System.out.print(j + " ");
            }
            System.out.println("");
        }
    }
}
