	package OOPS;
	
	public class This3 {
	void AAA(int a) {
		 BBB(this);
		
		System.out.println("Hii");
	}
	void BBB(This3 bbbb) {
		
		
		System.out.println("Hello");
	}
	public static void main(String[] args) {
		This3 obj=new This3();
		obj.AAA(8);
	}
	}
