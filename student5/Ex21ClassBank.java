/*  21. Create a class with name Bank.
	22. Add attributes accountName String, balance int, accountId int
	23. Add a method to check accountName. It should be min 10 char, should have no numbers. Return type is boolean.
	24. Add a method to check balance. It should not be nagative. Return type is boolean.
	25. Add a method to check accountId. It should not be nagative, exactly 5 digit. Return type is boolean.
*/



import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import com.sun.xml.internal.ws.policy.EffectiveAlternativeSelector;

import java.sql.SQLOutput;

public class Ex21ClassBank extends Bank
{


    public void setData(String accName, int bal, int id)
    {
        super.accountName = accName;
        super.balance = bal;
        super.accountId = id;
    }

    public void showData()
    {
        if (super.accountNameLength() && super.isDigitCheck())
        {
            System.out.println("Account Name : " + accountName);
        }
        else
            System.out.println("Account name is not valid");

        if (checkBalance() == true)
        {
            System.out.println("Balance : " + balance);
        }
        else
            System.out.println("Not a valid balance.");

        if (checkAccountID() == true)
        {
            System.out.println("Account ID : " + accountId);
        }
        else
            System.out.println("Account Id is not valid : Not equal to 5 digits");


    }

    public static void main(String[] args) {

        Ex21ClassBank obj1 = new Ex21ClassBank();
        obj1.setData("Tushar Waghmo23e", -1, 1234567);
        obj1.showData();

    }

}

