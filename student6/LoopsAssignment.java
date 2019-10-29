public class LoopsAssignment
{
    public static void main(String[] args)
    {
            //if loop,else if
        int age = 21;
        if ( age >= 18 && age <=35 )  {
            System.out.println( "between 18-35 " );
            if(age==21){
                System.out.println( "Teenager in college!" );
            }
        }
        else if(age >35 && age <=60)  {
            System.out.println("between 36-60");  }
        else  {
            System.out.println( "not matched" );  }

        // for loop with break and continue

        for ( int var = 0; var < 5; var++ )
        {
            System.out.println( "Var is : " + var );
            if ( var == 3 )  {
                break;
                //continue;
            }
            System.out.println( "Again Var is : " + var );
        }

        //While loop
        int n=1;
        while(n<=10)
        {
            System.out.println(n);
            n++;
        }


        //do while lopp

        int k = 4;
        do{
            System.out.println(k);
            ++k;
        }while(k<=10);







    }
}
