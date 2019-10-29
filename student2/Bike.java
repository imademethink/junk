public class Bike {

            int tyres = 2;
            String colour  = "black";

         public boolean pricecompare(float newprice, float oldprice){
             if (newprice>oldprice)
                 return true;
             else return false;
         }

            //public void cost(float newcost)

            public static void main(String[] args){
                System.out.println("Hello World");
                Bike b = new Bike();
                System.out.println(b.colour);
                System.out.println(b.tyres);
                boolean result = b.pricecompare(9.9f, 8.8f);
                System.out.println(result);

        }

    }

