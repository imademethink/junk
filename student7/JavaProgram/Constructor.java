package JavaProgram;

public class Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Car maruti= new Car("swift vdi", 8000, 10);
     Car benz= new Car("class a", 200000, 14);
     Car audi= new Car("A7", 80000, 15);
     
     maruti.carDetails();
     benz.carDetails();
     audi.carDetails();
    
	}

}
class Car {
	String carModel;
	int cost;
	double milege;
	public Car(String carModel, int cost,int milege) {
		this.carModel=carModel;
		this.cost=cost;
		this.milege=milege;
	}
	
	public void carDetails () {
		System.out.println("The model of the car is "+carModel);
		System.out.println("The cost of car is "+cost);
		System.out.println("The milege of the car is "+milege);
		System.out.println("..................................");
	}
}
