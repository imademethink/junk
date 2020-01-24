package Home_Practice;

public class Counting_Odd_Even_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {2,3,4,5,6,7,8,9,0,-6};
		for(int r=0; r<arr.length; r++) {
			if(arr[r]%2==0) {
				int [] a= new int [arr.length];
				a[r]=arr[r];
				System.out.print(a[r] +" ");
			}
		}
		System.out.println("");
			for(int r=0; r<arr.length; r++) {
				if(arr[r]%2!=0)  {
					int [] a= new int [arr.length];
					a[r]=arr[r];
					System.out.print(a[r]+" ");
			}
		}
		
	}
}

