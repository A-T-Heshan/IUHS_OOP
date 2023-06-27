
public class SavingsAccount extends Account{
        private double interest;
    public SavingsAccount(int accNumber, String name, double balance) {
        super(accNumber, name, balance);
    }

    
    public void withdraw(double withdrawAmount){
        balance -= withdrawAmount;
        System.out.println("\nSuccessfully withdrawed Rs." + withdrawAmount);
        System.out.println("New Balance : Rs." + balance );
        System.out.println("");
    }
    
    
    @Override
    public void deposite(double depositeAmount){
        super.deposite(depositeAmount);
        System.out.println("\nSuccessfully deposited Rs." + depositeAmount);
        System.out.println("New Balance : Rs." + balance );
        System.out.println("");
    }
     
    @Override
    public void print() {
        System.out.println("\nAccount No : " + accNumber);
        System.out.println("Name       : " + name);
        System.out.println("Balance    : Rs." + balance);
        System.out.println("");
        System.out.println("-------------------------------");
    }

    @Override
    public void calInterest(double interestRate) {
        interest = balance * interestRate /100/12;
        System.out.println("");
        System.out.println("Balance " +": Rs." + balance);
        System.out.println("Interest "+": Rs." + interest);
        System.out.println("");
        balance += interest;
        System.out.println("");
        System.out.println("With Interset");
        print();
    }
    
}
