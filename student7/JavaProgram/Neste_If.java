package JavaProgram;

public class Neste_If {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=2, b=3, c=4;
if (a>b && a>c) {
	System.out.println("largest number is " +a);
}
else
{
	if (b>c && b>a) {
		System.out.println("largest number is " +b);
	}
	else
			System.out.println("largest number is " +c);
		}
	}
	
	
}

