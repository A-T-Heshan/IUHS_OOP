
public class MainApp {
     public static void main(String[] args) {
        Account obj1 = new CurrentAccount(10000,50);
        Account obj2 = new SavingsAccount(20000,0.02);
        
        obj1.deposit(3000);
        obj1.withdraw(12900);
        System.out.println("Current Account Balance : " + obj1.getBalance());

        obj2.deposit(1000);
        obj2.withdraw(2000);
        System.out.println("Saving Account Balance  : " + obj2.getBalance());
    }   
}
