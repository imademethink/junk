public class Cycle extends Vehicle
{
    int noofWheels;
    String brand;
    Cycle(String r, String brand,String m,int noofWheels)
    {
        super(r,m);

        this.brand = brand;
        this.noofWheels = noofWheels;
    }

    void display()
    {
        System.out.println("Cycle Details : ");
        super.display();
        System.out.println("Brand of the Cycle : " + brand);
        System.out.println("Number of wheels :" + noofWheels);
        System.out.println();
    }

}
