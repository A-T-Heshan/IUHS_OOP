


public class Account {
    protected float accountBalance;

    protected Account(float accountBalance) {
        if (accountBalance > 0) {
            this.accountBalance = accountBalance;
        }
        else{
            System.out.println("Not valid the initial balance");
        }
    }
    
    protected void deposit(float depositAmount){
        
    }
    
    protected void withdraw(float withdrawAmount){
        if (withdrawAmount > accountBalance) {
            System.out.println("insufficient Account Balance");
        }
    }
    
    protected float getBalance(){
        return accountBalance;
    }
    
}
