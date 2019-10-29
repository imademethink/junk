public class StringOne
{
    public static void main(String[] args) {
        String s= new String("True");
        String t= new String("magic");
        String r= new String("True");
        System.out.println(s==t);
        System.out.println(s.length());

        System.out.println( s.toLowerCase());
        System.out.println( t.toUpperCase());
        System.out.println(s.equals(t));
        System.out.println(s.equals(r));
        String w= new String("World");
        w=w.replace("World","Earth");
        System.out.println(w);
        s=s.concat(t);
        System.out.println(s);







    }
}
