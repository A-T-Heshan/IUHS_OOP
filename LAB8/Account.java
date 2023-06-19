
public class Account {
    protected double accountBalance;

    protected Account(double initialBalance) {
        if (initialBalance > 0) {
            this.accountBalance = initialBalance;
        }
        else{
            System.out.println("Not valid the initial balance");
        }
    }
    
    protected void deposit(double depositAmount){
        accountBalance += depositAmount;
    }
    
    protected void withdraw(double withdrawAmount){
        if (withdrawAmount > accountBalance) {
            System.out.println("insufficient account balance");
        }
        else{
            accountBalance -= withdrawAmount;
        }
        
    }
    
    protected double getBalance(){
        return accountBalance;
    }
    
}
