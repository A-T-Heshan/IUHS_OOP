
public class CurrentAccount extends Account{
    private double feeCharge;
    
    public CurrentAccount(double initialBalance,double feeCharge) {
        super(initialBalance);
        this.feeCharge = feeCharge;
    }
    
    
    
    @Override
    protected void deposit(double depositAmount){
        super.deposit(depositAmount);
        accountBalance -= feeCharge;
        System.out.println("Fee Charged: Rs."+ feeCharge + "\n");
    }
    
    @Override
    protected void withdraw(double withdrawAmount){
        super.withdraw(withdrawAmount);
        accountBalance -= feeCharge;
        System.out.println("Fee Charged: Rs." + feeCharge + "\n");
    }
}

