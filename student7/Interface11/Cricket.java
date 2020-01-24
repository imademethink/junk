	package Interface11;
	
	public class Cricket implements Game, Football  {

	public void A() {
		System.out.println("Hiii");
	}
	public void B() {
		System.out.println("Hello World");
		
		}
	public void C() {
		int aa=10;
		System.out.println("Hellooo");
	}
	public static void main(String[] args) {
		Cricket obj=new Cricket();
		obj.A();
		obj.B();
		obj.C();
		
	}
	}
