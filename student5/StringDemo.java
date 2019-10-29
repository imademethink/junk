import java.sql.SQLOutput;

public class StringDemo
{
    public static void main(String[] args) {


       // String s = new String("True");
        String s1= "TrueQTrue";
        String s3 = "Pune";
        String s4 = "Ethans Tech";
        String [] s2 = s1.split("Q");

        System.out.println(s2[0]);
        System.out.println(s2[1]);

       // System.out.println(s1=s3);

        String s5 = s4.replace("Tech","Class");
        System.out.println(s5);
        System.out.println(s1.concat(s3));

        //

        StringBuffer obj1 = new StringBuffer("Tushar");
        System.out.println(obj1);

        obj1 = new StringBuffer("Suraj");
        System.out.println(obj1);

        obj1.append("Rohan");

        System.out.println(obj1);

        obj1.insert(1,"Rudra");
        System.out.println(obj1);





    }
}
