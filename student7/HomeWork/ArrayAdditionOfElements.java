package HomeWork;

public class ArrayAdditionOfElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] a= {21,24,17,14,8,9};
int sum=0;
for(int r=0; r<a.length; r++) {
	if(a[r]%2==0) {
		sum=sum+a[r];
	}
}
System.out.println(sum);
}

	}


