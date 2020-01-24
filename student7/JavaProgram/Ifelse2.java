package JavaProgram;

public class Ifelse2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
float a=80.00f;
if (a>=0.00f && a<=35.00f) {
	System.out.println("fail");
}
else if (a>=35.01f && a<=60.00f) {
	System.out.println("pass");
}
else if (a>=60.01f && a<=80.00f) {
	System.out.println("distinction");
}
else if (a>80.01f && a<=100.00f) {
	System.out.println("merit");
}
	}

}
