
public class SavingsAccount extends Account{
    private double interesRate = 0.02f;

    public SavingsAccount(double initialBalance,double interestRate) {
        super(initialBalance + initialBalance * interestRate);
        this.interesRate = interestRate;
    }
    public double calculateInterest(){
        double interest = super.accountBalance * interesRate;
        return interest;
    }
    @Override
    protected void deposit(double depositAmount){
        super.deposit(depositAmount);
        super.accountBalance +=  depositAmount * interesRate;
    }
    
    @Override
    protected void withdraw(double withdrawAmount){
        super.withdraw(withdrawAmount);
    }
    
}