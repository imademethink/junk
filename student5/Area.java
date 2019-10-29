import java.util.Scanner;

public class Area
{
    int length = 0;
    int breadth = 0;
    int area;
    Area(int l,int b)
    {
//        Scanner s = new Scanner(System.in);
//        System.out.println("Enter Length of Rectangle : ");
//        int lenght = s.nextInt();
//        System.out.println("Enter breadth of rectangle : ");
//        int breadth = s.nextInt();
            length = l;
            breadth = b;
    }

    public int retrunArea()
    {
       area = length * breadth;
       return area;
    }

    public static void main(String[] args) {
        Area obj = new Area(10,20);
        System.out.println("Area of rectangle : " + obj.retrunArea());
    }
}
