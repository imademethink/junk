
interface RBIBank
{

   public void account();
    public void savingAccount();

}

public class HDFCBank implements RBIBank{

    public void account()
    {
        System.out.println("Primary account");
    }
    public void savingAccount()
    {
        System.out.println("Saving account");
    }
    public static void main(String[] args)
    {
        HDFCBank H= new HDFCBank();
        H.account();
        H.savingAccount();
    }
}
