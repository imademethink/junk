public class ThisDemo
{
    int no1 = 0;
    int no2 = 0;
    int sum = 0;

    ThisDemo()
    {
        System.out.println("This Demo");
    }

    ThisDemo(int no1,int no2)
    {
        this();
        this.no1=no1;
        this.no2=no2;
        sum = no1 + no2;
        System.out.println(sum);
    }

    public static void main(String[] args) {
        ThisDemo obj1 = new ThisDemo(10,40);


    }

}
