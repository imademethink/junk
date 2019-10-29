


class moped{
    int price = 20;
    int gears = 5;
    String colur = "Brown";
public void test()
{
    System.out.println("test");
}

    moped(){
        System.out.println("inside parent");
        colur = " Black";
        gears = 0;
    }
}

public class twowheelers extends moped{
    int price = 30000;
    String colur = "Red";

    twowheelers(){
        super();
        System.out.println(super.price);
        System.out.println(super.gears);
        System.out.println(this.colur);
        super.test();
    }

    public static void main(String[] args) {
        System.out.println("Hello");
        twowheelers t = new twowheelers();


    }
}

//class mopeds extends twowheelers{
//            int price = 50000;
//            String colur = "blue";
//            int gears = 0;
//            System.out.println("Moped colur : " +this.colur);
//            System.out.println("2wheeler price : "super.price);
//}
//
//    class gears extends twowheelers{
//        int price = 30000;
//        String colur = "red";
//        int gears = 5;
//        System.out.println("2 wheeler colur : "+super.colur);
//        System.out.println("gears no of gears : "+this.gears);
//
//    }
//}
//    public static void main(String[] args)
//    {
//        System.out.println(super.colur);
//}
