package HomeWork;

public class ReplacingPositiveWithNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [][] a= {{1,-3,-5}, {4,-6,-8}};
for (int r=0; r<a.length; r++) {
	for(int c=0; c<a[r].length; c++) {
		if (a[r][c]<0) {
			 a[r][c]=a[r][c];
		} 
			 if(a[r][c]>0) 
				 a[r][c]=-a[r][c];
				 System.out.print(a[r][c] +" ");
			 }
			 System.out.println("");
}
	}

}

