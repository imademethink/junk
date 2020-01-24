package ClassObject;

public class Abc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer a=new StringBuffer("Hello");
		String b=" World ";
		System.out.println(a +" World");
		System.out.println(a.append(b));
		System.out.println(a.capacity());
		
		System.out.println(a.insert(1, b));
		
		StringBuffer d=new StringBuffer("Hello");
		System.out.println(d.replace(0, 2, "--"));
		StringBuffer r=new StringBuffer("Hello");
		System.out.println(r.delete(0, 2));
		StringBuffer e=new StringBuffer("Hello");
		System.out.println(e.reverse());
	}

}
