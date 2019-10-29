public class MethodEg
{
    int no=0;
    float add=0.0f;
    int minus=0;

    MethodEg()
    {

    }
    MethodEg (int sub)
    {
       minus=sub;
    }
    MethodEg (int num, float addi)
    {
        no= num;
        add= addi;
        System.out.println(no);
        System.out.println(add);

    }
    public static void main(String[] args)
    {
        MethodEg M= new MethodEg(5,6.7f);
        /*System.out.println(m.tyres);
        System.out.println(m.speed);*/

        System.out.println(M.minus);

        MethodEg N= new MethodEg();
        N.no=1;
        N.add=3.5f;
        N.minus=-2;
        System.out.println(N.no);
        System.out.println(N.add);
        System.out.println(N.minus);
    }
}

