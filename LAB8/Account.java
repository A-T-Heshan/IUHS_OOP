
public class Account {
    protected double accountBalance;

    protected Account(double initialBalance) {
        if (initialBalance > 0) {
            this.accountBalance = initialBalance;
        }
        else{
            System.out.println("Not valid the initial balance\n");
        }
    }
    
    protected void deposit(double depositAmount){
            accountBalance += depositAmount;
            System.out.println("Deposited: Rs." + depositAmount + "\n");
           }
    
    protected void withdraw(double withdrawAmount){
        if (withdrawAmount > accountBalance) {
            System.out.println("insufficient account balance\n");
        }
        else{
            accountBalance -= withdrawAmount;
            System.out.println("Withdrawed: Rs." + withdrawAmount + "\n");
        }
        
    }
    
    protected double getBalance(){
        return accountBalance;
    }
    
}
