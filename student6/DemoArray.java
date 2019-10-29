public class DemoArray {
    public static void main(String[] args)
    {

        int[] mynumber={1, 2, 3, 4, 5,};
        System.out.println(mynumber[4]);
        mynumber[3]=7;
        System.out.println(mynumber[3]);

        float[] rate={11.2f,11.3f,11.4f};
        for(float rat: rate)
        {
            System.out.println(rat);
        }

        for(int n=0;n<rate.length;n++)
        {
            System.out.println(rate[n]);
        }

        String[] cars={"BMW","Volvo","Ford","Audi"};
        String[] cars1={"Mercedes","Landrover","","Maruti"};

    }
}
