  package Home_Practice;
	
	public class AverageValueOfArray {
	
	public static void main(String[] args) {
			// TODO Auto-generated method stub
			
	int [] a={1,2,3,4,5};
	
	int sum=0;
	
	for(int r=0; r<a.length; r++) {
		
	sum=sum+a[r];
	
	}
	
	int b=sum/a.length;
	
	System.out.println(b);
	
	}
	}