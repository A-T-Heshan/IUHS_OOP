


abstract public class Account {
    protected int accNumber;
    protected String name;
    protected double balance;

    public Account(int accNumber, String name, double balance) {
        this.accNumber = accNumber;
        this.name = name;
        this.balance = balance;
    }

    protected void deposite(double depositeAmount){
     balance += depositeAmount;
    }
 
 
 abstract protected void calInterest(double interestRate);
 abstract protected void print();
    
}
