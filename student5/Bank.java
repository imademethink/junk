import AllBanks.CITI;
import AllBanks.HDFC;
import AllBanks.ICICI;

import java.util.Scanner;

public class Bank
{

    String BankName;
    Scanner s = new Scanner(System.in);
    public void getBankName()
    {
        System.out.println("Enter Bank Name : ");
        BankName = s.next();
    }

    public static void main(String[] args) {

        Bank obj = new Bank();
        obj.getBankName();
        switch (obj.BankName)
        {
            case "ICICI":
                ICICI ic = new ICICI();
                ic.getAccountDetails("ICICI1234567","Tushar Waghmode",100000.50f);
                ic.showAccountDetails();
                break;

            case "HDFC":
                HDFC hd = new HDFC();
                hd.getAccountDetails("HDFC1234567","Rohan Waghmode",200000.50f);
                hd.showAccountDetails();
                break;

            case "CITI":
                CITI ct = new CITI();
                ct.getAccountDetails("CITI1234567","Rudra Waghmode",500000.50f);
                ct.showAccountDetails();
                break;

            default:
                System.out.println("Entry is not valid.");
                break;

        }


    }
}
