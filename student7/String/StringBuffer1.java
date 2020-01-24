package String;

public class StringBuffer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
StringBuffer str=new StringBuffer("Hello ");
String ab="World";
System.out.println(str  +  ab);
System.out.println(str.append(ab));
StringBuffer str1=new StringBuffer("Hello ");
System.out.println(str.capacity());
System.out.println(str1.reverse());
	}

}
