public class MyApp {
    public static void main(String[] args) {
        SavingsAccount saving = new SavingsAccount(10001, "Amila", 10000);
        saving.deposite(1000);
        saving.withdraw(2000);
        saving.print();
        saving.calInterest(3);
        
        
        FixedDepositeAccount fixed = new FixedDepositeAccount(20001, "Kamal", 100000,12);
        fixed.print();
        fixed.calInterest(20);
        
        
    }
}