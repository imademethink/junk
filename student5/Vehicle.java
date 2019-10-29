public class Vehicle
{

    String regno;
    String model;

    Vehicle(String regno,String model)
    {
        this.regno = regno;
        this.model=model;
    }

    void display()
    {
        System.out.println("Registration number : " + regno);
        System.out.println("Model number :" + model);

    }
}
