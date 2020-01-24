	package Home_Work2;
	
	public class AreaCalculation {
	public static double Area(double r) {
	
		return 3.142*r*r;
		
	}
	public static double Area(int a,double b) {
		return a*b*.5;
	
	}
	public static  int Area(int c) {
		return c*c;
	}
	public static void main(String[] args) {
		
		 double a=Area(7.00);
		 
		 double aa= Area(4, 5.50);
		 
		 int bb=Area(10);
		 
		 System.out.println("area of circle is "+a);
		 System.out.println("area of tringle is " +aa);
		 System.out.println("area of square is "+bb);
		
		
		
	}
	}
