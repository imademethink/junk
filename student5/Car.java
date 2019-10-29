public class Car extends Vehicle
{
    String brand;
    int noOfWheels;
    Car(String r,String m,String brand,int noOfWheels)
    {
        super(r,m);
        this.noOfWheels = noOfWheels;
        this.brand = brand;
    }

    void display()
    {
        System.out.println("Car Deatils : ");
        super.display();
        System.out.println("Brand of the car : " + brand);
        System.out.println("Number of wheels of Car : " + noOfWheels);
        System.out.println();
    }

}
