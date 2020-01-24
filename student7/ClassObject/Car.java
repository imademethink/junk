package ClassObject;

public class Car {
	String brand="benz";
	String color="black";
	static int seat=2;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int cost=100000;
int tyres=4;
Car.seat=4;
seat=5;
Car city800=new Car();
city800.brand="maruti";
city800.color="red";
System.out.println(Car.seat);
System.out.println(city800.brand);
System.out.println(city800.color);
System.out.println(cost);
System.out.println(tyres);
System.out.println(seat);

	}

}
