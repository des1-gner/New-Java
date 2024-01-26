class Account
{
    private String name;
    private String ID;
    private double balance;
    private int withdrawCount;

    public Account(String name, String ID, double balance)
    {
        this.name = name;
        this.ID = ID;
        this.balance = balance;
        this.withdrawCount = 0;
    }
    
    public double getBalance()
    {
        return balance;
    }

    public String getName()
    {
        return name;
    }
    
    public boolean withdraw(double amt)
    {
        if(balance >= amt) {
            balance -= amt;
            withdrawCount++;
            return true;
        } else {
            return false;
        }
    }
    
    public void deposit(double amt)
    {
        balance += amt;
    }

    public void addInterest(double interestRate) {
        balance += balance * interestRate / 100.0;
    }
}
