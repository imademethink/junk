	package TryCatch;
	
	public class Division {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	int a=10, b=5, c=5;
	try {
		int result=a/(b-c);
		System.out.println("result "+result);
		
	}catch(ArithmeticException e) {
		System.out.println("exception is handled here");
	}
	finally {
		System.out.println("i am in final block");
	}
		}
	
	}
