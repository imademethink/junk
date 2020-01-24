package JavaProgram;

public class Array6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [][]a={{1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}};
for (int r=3; r>=0; r--){
	for (int c=0; c<a[r].length; c++){
		System.out.print(a[r][c] + " " );
		
	}
	System.out.println("");
}
}
}