package ClassObject;

public class TryCatchFinally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] b= {22,12,25,145};
try {
	System.out.println(b[2]);
}
catch (Exception e) {
	System.out.println("something went wrong");
} finally {
	System.out.println(" the try catch is finished");
}
	}

}
