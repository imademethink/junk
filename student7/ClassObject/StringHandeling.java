package ClassObject;

public class StringHandeling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name="RITESH";
String Surname="MISHRA";
System.out.println(name.charAt(2));
System.out.println(name.concat(Surname));
System.out.println(name.contentEquals(Surname));
System.out.println(name.equalsIgnoreCase(Surname));
System.out.println(name.length());
System.out.println(Surname.length());
System.out.println(name.replace("SH", "AA"));
System.out.println(name.substring(2));
System.out.println(name.toLowerCase());
System.out.println(name.split(" "));
	}

}
