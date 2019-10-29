public class StringReverse
{
    String s = null;
    String t = "";
    /*public void setData(String str1)
    {
        s=str1;
    }*/

    StringReverse(String str)
    {
        s = str;
        for (int i=s.length()-1; i>=0; i--)
        {
            t = t + s.charAt(i);     // Vaible t is for to store each character. "+" is used to concatenate each char, so that output will be in string.
        }

        System.out.println(t);
    }


    public static void main(String[] args) {

    StringReverse obj1 = new StringReverse("Tushar");


    }
}
