public class array {
    public static void main(String[] args)
    {
        int [] zip = {410021, 410008,410007,410005};
        float [] fdrate = {8.5f, 9.5f, 10.5f};
        //System.out.println(zip.length);
        //System.out.println(zip[3]);
        //System.out.println(fdrate.length);
        //System.out.println(fdrate[5]);

        for (int n = 0; n<zip.length; n++)
        {System.out.println(zip[n]);}
        for(int onezip : zip)
        {System.out.println(onezip);}
    }
}
