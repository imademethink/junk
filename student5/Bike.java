public class Bike extends Vehicle
{
    int noOfWheels;
    String brand;
    Bike(String r,String m, String brand,int noOfWheels)
    {
        super(r,m);

        this.brand = brand;
        this.noOfWheels = noOfWheels;

    }

    @Override
    void display()
    {
        System.out.println("Bike Details : ");
        super.display();
        System.out.println("Brand of the Bike : " + brand);
        System.out.println("Number of wheels of the Bike : " +  noOfWheels);
        System.out.println();
    }
}
