package JavaProgram;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []a= { 13,3,4,2,8,11};
for(int r=0; r<a.length; r++) {
	if(a[r]%a[r]==0 && a[r]%a[++r]!=0) {
		System.out.println(a[r]);
	}
}
	}

}
