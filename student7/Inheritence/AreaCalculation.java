 package Inheritence;
	
	public class AreaCalculation {
	
	 public static void main(String[] args) {
			// TODO Auto-generated method stub
		Rectangle rec=new Rectangle();
		
		rec.Set_value(10, 10);
		
		Tringle tri=new Tringle();
		
		tri.Set_value(10, 10);
		
		System.out.println(rec.area());
		
		System.out.println(tri.area());
		}
	
	}
