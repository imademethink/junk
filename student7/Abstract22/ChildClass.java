	package Abstract22;
	
	public class ChildClass extends  AbstractClass1 {
	
		public  void A() {
			System.out.println("Hello");
		}
		
		public static void main(String[] args) {
			
			ChildClass obj=new ChildClass();
			obj.A();
			obj.B();
			}
	}
