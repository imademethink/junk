package HomeWork;

public class ArrayAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr1= {1,2,3,4,5};
		int []	arr2= {-1,-2,-3,-4,-5};
		int [] arr3= new int [arr1.length];
		for(int r=0; r<arr1.length; r++)
		{
			arr3[r]=arr1[r]+ arr2[r];
		}
		for(int c=0; c<arr1.length; c++) {
			System.out.print(arr3[c] +" ");
		}
			}
		}
		
	
	


