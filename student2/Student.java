class Student {
    String name = new String("Ram");
    protected int rollno = 100;

    public void validate_admission(String name) {
        if (name == "yogesh") {
            System.out.println("valid student");
        } else {
            System.out.println("invalid student");
        }
    }
}