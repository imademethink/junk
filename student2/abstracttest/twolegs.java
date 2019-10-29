package abstracttest;

public class twolegs extends animal {
    //@Override
    public void checklegs() {
        System.out.println("This is two legged animal");
    }

    public static void main(String[] args) {
animal obj = new twolegs();
obj.checklegs();
    }
}