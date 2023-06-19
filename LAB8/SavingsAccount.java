public class SavingsAccount extends Account{
    private double interesRate;

    public SavingsAccount(double initialBalance,double interestRate) {
        super(initialBalance);
        this.interesRate = interestRate;
    }
    public double calculateInterest(){
        double interest = super.accountBalance * interesRate;
        System.out.println("Interest: Rs."+ interest);
        return interest;
    }
}