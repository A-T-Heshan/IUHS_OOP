public class FixedDepositeAccount extends Account{
    private double interest;
    private int depositPeriodInMonths;
    public FixedDepositeAccount(int accNumber, String name, double balance,int depositPeriodInMonths) {
        super(accNumber, name, balance);
        this.depositPeriodInMonths = depositPeriodInMonths;
    }

    @Override
   public void calInterest(double interestRate) {
        interest = balance * interestRate /100/12 * depositPeriodInMonths;
        System.out.println("");
        System.out.printf("%-10s%12s","Balance ",": Rs." + balance);
        System.out.println("");
        System.out.printf("%-10s%12s","Interest ",": Rs." + interest);
        System.out.println("");
    }

    @Override
   public void print() {
        System.out.println("\nAccount No : " + accNumber);
        System.out.println("Name       : " + name);
        System.out.println("Balance    : Rs." + balance);
    }
    
}
