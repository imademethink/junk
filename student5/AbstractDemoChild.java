public class AbstractDemoChild extends AbstractDemoParent{

    public void display()
    {
        System.out.println("Name :"+ name);
        System.out.println("age :"+ age);
    }

    public static void main(String[] args) {

        AbstractDemoChild obj = new AbstractDemoChild();
        obj.show();
        obj.display();
    }
}
