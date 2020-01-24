package ClassObject;

public class StringHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String a="RITESH ";
String b="MISHRA";
String c="how are you";
System.out.println(a.length());
System.out.println(a.contentEquals(b));
System.out.println(a.equalsIgnoreCase(b));
System.out.println(a.charAt(1));
System.out.println(a.concat(b));
System.out.println(a.toLowerCase());
System.out.println(a.toUpperCase());
System.out.println(a.replace("ESH", "BBB"));
System.out.println(a.replace("vijay", ""));
System.out.println(a.substring(6));
System.out.println(c.substring(6));
System.out.println(a.substring(2, 4));
System.out.println(a.split(a));
 
	}

}
