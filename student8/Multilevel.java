

class Grandparent {
   public void display() {
      System.out.println("This id GrandParent");
   }
}
class Parent extends Grandparent{
   public void display() {
      System.out.println("This is Parent");
   }
}
class Children extends Parent {
   public void volume() {
      System.out.println("This is Children");
   }
}
public class Multilevel {
   public static void main(String[] arguments) {
      Children C = new Children();
      C.display();
      C.display();
      C.volume();
   }
}



