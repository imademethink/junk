public class ArrayOfObject
{
    public static void main(String[] args)
    {
        Student obj[] = new Student[2];
        obj[0] = new Student();
        obj[1] = new Student();
        obj[0].setData("Tushar","Willingdan");
        obj[1].setData("Suraj","SRVM");

        System.out.println("For Object 0 ");
        obj[0].showData();

        System.out.println("For Object 1 ");
        obj[1].showData();
    }
}

class Student
{
    String student;
    String collage;

    public void setData(String a, String b)
    {
        student=a;
        collage=b;
    }

    public void showData()
    {
        System.out.println("Student :" + student + "----" + "Collage :" + collage );
    }
}
