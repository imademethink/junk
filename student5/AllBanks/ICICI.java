package AllBanks;

public class ICICI
{
    String AccNo;
    String Name;
    Float Balance;

    public void getAccountDetails(String AccNo,String Name,float Balance)
    {
        this.AccNo = AccNo;
        this.Name = Name;
        this.Balance = Balance;

    }
    public void showAccountDetails()
    {
        System.out.println("ICICI Bank details : ");
        System.out.println("Account Number: " + AccNo);
        System.out.println("Name : " + Name);
        System.out.println("Balance : " + Balance);
    }
}


