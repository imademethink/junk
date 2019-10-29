public class staticmethods {

    static int bikecost = 50000;

    public static int newcost(){
        int add = 10000;
        int newprice = add + staticmethods.bikecost;
        return newprice;
            }
    public static void main(String[] args) {

        System.out.println(staticmethods.newcost());
        //System.out.println(newcost().add);
    }
}
