package HomeWork;

public class PrintUsingWhileLoop1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [][] a= {{1,2,3}, {4,5,6}, {7,8,9}};
int r=0;
while (r<a.length) {
	int c=0;
while (c<a[r].length) {
	System.out.print(a[r][c]+ " ");
	
	c++;
}
r++;
System.out.println("");
}

	}
	
}
