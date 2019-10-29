public class NumberReverse
{
    int number=0;
    int reverse = 0;

    NumberReverse(int no1)
    {
        number = no1;

        while (number!=0)
        {
             int digit = number % 10;
             reverse = reverse * 10 + digit;
             number = number / 10;
        }

        System.out.println("Reverse of " + no1 + " is " + reverse);
    }

    public static void main(String[] args)
    {
        NumberReverse obj1 = new NumberReverse(1234);
        System.out.println("Success");

    }
}
