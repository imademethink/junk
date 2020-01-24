	package Array;
	
	public class PrintingEvenAndOddNumber {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	   int [] a= {1,2,4,5,12,11,16,17,22,23};
	   for(int i=0; i<a.length; i++) {
		   
		   if(a[i]%2==0) {
			   System.out.print(a[i] +" ");
		   }
		   
	   }
	   System.out.println("");
	   for(int i=0; i<a.length; i++) {
		
		   if(a[i]%2!=0) {
			   System.out.print(a[i] +" ");
	   }
	   
		}
		}
	}
	
		
		
	
	
