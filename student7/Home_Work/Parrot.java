	package Home_Work;
	
	public class Parrot extends Bird {
	public void talk() {
		int a=32;
		String b="ritesh";
		System.out.println(a +b);
	}
	public void talk(int aa, String bb) {
		int aaa=77 ;
		String bbb="dfnjn";
		System.out.println(aaa +bbb);
		
	}
	public void talk(Double c, String d) {
		c=55.77;
		d="bjhdhj";
		System.out.println(c +d);
	}
	public void walk() {
		System.out.println("Hiiii");
	}
	public void eat() {
		System.out.println("Hello");
	}
	public static void main(String[] args) {
		Parrot obj=new Parrot();
		obj.talk();
		obj.talk(77, "jndjnfjn");
	}

	}
	
