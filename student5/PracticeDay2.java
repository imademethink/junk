public class PracticeDay2
{
    public static void main(String[] args) {

        for ( int var = 0; var < 5; var++ )
        {
            System.out.println( "Var is : " + var );
            if ( var == 3 )  {
                break;
                //continue;
            }
            System.out.println( "Again Var is : " + var );
        }

    }

}
