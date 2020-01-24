package ClassObject;

public class exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a=30, b=0;
			int c=a/b;
			System.out.println(c);
		}
		catch (ArithmeticException e) {
			System.out.println("cant divide a number by 0");
		}
	}

}
