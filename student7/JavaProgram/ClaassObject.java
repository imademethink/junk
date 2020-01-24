package JavaProgram;

public class ClaassObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student ritesh=new Student();
ritesh.setName("ritesh");
ritesh.setAge(24);
ritesh.setId(212);
System.out.println(ritesh.getName() + " has " + ritesh.getId() + " id "+ " and " + ritesh.getAge() + " years old " );

	}

}
class Student {
	String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	int age;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	int id;
}