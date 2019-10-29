public class Parrot extends Bird
{
    String language = null;
    public void talk()
    {
        System.out.println("This bird can talk");
    }

    public void talk(String language)
    {
        this.language = language;
        System.out.println("This Parrot knows " + language + " language");
    }

    public static void main(String[] args)
    {
        Parrot obj = new Parrot();
        obj.walk();
        obj.eat();
        obj.talk();
        obj.talk("English");
    }
}
