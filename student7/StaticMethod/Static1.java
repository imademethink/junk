	package StaticMethod;
	
	public class Static1 {
	
	int a=10;
	static int b=11;
	public void A() {
		b=111;
		System.out.println(a);
		System.out.println(b);
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		 Static1 obj=new Static1();
		 obj.A();
		 System.out.println(b);
		
	}
	}
