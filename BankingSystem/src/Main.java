public class Main {
    public static void main(String[] args) {
        Account account = new Account();
        account.Display();
        account.Insert(123, "Mike", 250F);
        account.Display();
        account.Withdraw(20);
        account.Display();
        account.Deposit(200);
        account.Display();
    }
}

class Account
{
    private  int accountID;
    private String accountName;
    private float accountBalance;

    public void Insert(int accountID, String accountName, float accountBalance)
    {
        this.accountID = accountID;
        this.accountName = accountName;
        this.accountBalance = accountBalance;
    }
    public boolean Deposit(float depositAmount)
    {
        if(depositAmount <= 0)
            return false;
        else
        {
            accountBalance += depositAmount;
            return true;
        }
    }
    public boolean Withdraw(float withdrawAmount)
    {
        if(withdrawAmount > accountBalance)
            return false;
        else
        {
            accountBalance -= withdrawAmount;
            return true;
        }
    }
    public float CheckBalance()
    {
        return accountBalance;
    }
    public void Display()
    {
        System.out.println("Account ID: " + accountID + "\nAccount Name: " + accountName + "\nAccount Balance: " + accountBalance);
    }
    public Account()
    {
        this(0,"",0F);
    }
    public Account(int accountID)
    {
        this(accountID, "", 0);
    }
    public Account(int accountID,String accountName)
    {
        this(accountID, accountName, 0);
    }
    public Account(int accountID, String accountName, float accountBalance)
    {
        this.accountID = accountID;
        this.accountName = accountName;
        this.accountBalance = accountBalance;
    }
}