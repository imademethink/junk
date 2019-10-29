//        Class and object:
//        1. Create a class with name Bank.
//        2. Add attributes accountName String, balance int, accountId int
//        3. Add a method to check accountName. It should be min 10 char, should have no numbers. Return type is boolean.
//        4. Add a method to check balance. It should not be nagative. Return type is boolean.
//        5. Add a method to check accountId. It should not be nagative, exactly 5 digit. Return type is boolean.

import static com.sun.org.apache.xml.internal.security.keys.keyresolver.KeyResolver.length;

public class bank
{
    String accountName = "custone";
    int balance = 100;
    int accountId = 10001;
    //accountId.length();
    public static boolean balancecheck(int balance)
    { //assignment4
        if (balance>0) return true;
        else return false;
    }

    public static boolean accountidcheck(int accountId) {
        //assignment5
        String str = Integer.toString(accountId);
        if ((accountId >0) && ( str.length()==5)) // == 5))
        return true;
        else {return false;}
        }



    public static void main(String[] args)
    {
        bank b = new bank();
        boolean result = b.balancecheck(700);
        System.out.println("Balance check : " + result);

        boolean result1 = b.accountidcheck(89999);
        System.out.println("accountId check is  : " + result1);
    }
}
