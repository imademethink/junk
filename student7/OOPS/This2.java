	package OOPS;
	
	public class This2 {
	void AA() {
		
		System.out.println("Hii");
	}
	void BB() {
		 this.AA();
		System.out.println("Hello");
	}
	public static void main(String[] args) {
		This2 obj=new This2();
		obj.BB();
	}
	}
