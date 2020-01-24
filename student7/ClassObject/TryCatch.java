package ClassObject;

public class TryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
int [] a= {1,2,3};
System.out.println(a[5]);
		}
		finally {
			System.out.println("somtehing went wrong ");
		}
		System.out.println("don't worry");
}
}