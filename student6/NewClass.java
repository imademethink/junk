public class NewClass
{
        String color="red";
        int type=2;

        static String bankname="ABC";

        public boolean CompareFloat(float a, float b)
        {
            if(a>b)
                return (true);
                else
                return (false);
        }
        public void IncreaseSpeed(float newspeed)
        {
        System.out.println("increasing speed upto:"+newspeed);
        }

    public static void main(String[] args)
        {
            System.out.println("Hello cars");
            NewClass c=new NewClass();
            System.out.println(c.color);
            System.out.println(c.type);
            c.IncreaseSpeed(55.5f);
            NewClass D[]=new NewClass[0];
            boolean result =c.CompareFloat(2.3f,1.0f);
            System.out.println(result);

            System.out.println(NewClass.bankname);
            NewClass.bankname="1123";

        }

}
