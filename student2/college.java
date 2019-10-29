



public class college extends Student {
    String degree = new String("Bachelors");

@Override
public void validate_admission(String name) {
    if (name == "gargi") {
        System.out.println("valid student");
    } else {
        System.out.println("invalid student");
    }

}
    public static void main(String[] args) {
        college c = new college();
        System.out.println(c.name);
        System.out.println(c.rollno);
        System.out.println(c.degree);
        c.validate_admission("yogesh1");
    }
}


