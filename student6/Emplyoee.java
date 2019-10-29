
 abstract class Salary
        {
abstract void name();
private String E="name";

        }

public class Emplyoee extends Salary
{
    void name(){
        System.out.println("Radha");
    }
    public static void main(String[] args)
    {   Salary S= new Emplyoee();
        S.name();
        //E.length();

    }
}


