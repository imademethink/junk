public class ClassDemo {

    int tyres = 4;
    String colour = "Red";

    public void speed(float newSpeed, int gear)
    {
        System.out.println("Speed and Gear of Car :" + newSpeed);
        System.out.println("Gear :"+ gear);
    }

    public boolean compareTwo(float no1, float no2)
    {
        if(no1>no2)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static void main(String[] args) {

        System.out.println("Hello Car");

        ClassDemo obj = new ClassDemo();
        System.out.println("Colour of car :" + obj.colour);
        System.out.println("Tyres of car :"+ obj.tyres);
        obj.speed(55.5f,4);
        boolean result = obj.compareTwo(10.5f,9.5f);
        System.out.println(result);
    }
}










