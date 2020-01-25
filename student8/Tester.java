


class Rectangle extends Shape11
{
    void area() 
   {
      System.out.println("Inside area");
   }

    public void display()
    {
    
    	      System.out.println("Inside display");
    	   
    }
}

public class Tester
{
   public static void main(String[] arguments) 
   {
      Rectangle rect = new Rectangle();
      rect.display();
      rect.area();
   }
}






