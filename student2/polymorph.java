public class polymorph {
    public static int sum(int x, int y)
    {
        return x+y;
    }
    public static float sum(float x, float y)
    {
        return x-y;
    }

    public static void main(String[] args) {
        System.out.println(sum(14.33f,12.22f));
        System.out.println(sum(9,5));
    }
}
