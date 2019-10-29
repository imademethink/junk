public class DigitsInNumber
{
    public static void main(String[] args) {
        int number = 10405;
        int cnt = 0;
        while (number !=0)
        {
            number = number/10;
            cnt++;
        }

        System.out.println(cnt);
    }

}
