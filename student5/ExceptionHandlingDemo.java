public class ExceptionHandlingDemo
{


    public static void main(String[] args) {

        try
        {
            int data = 50/0;
        }
        catch(ArrayIndexOutOfBoundsException | ArithmeticException e)
        {
            System.out.println("123");
            e.printStackTrace();
            System.out.println(e);
        }
        catch (Exception e)
        {
            System.out.println("456");
            System.out.println(e);
        }

        finally {
            System.out.println("Exception handled");
        }

    }
}
