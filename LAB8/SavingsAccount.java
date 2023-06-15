/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jftdrdr68dr.bankmanager;

/**
 *
 * @author User
 */
public class SavingsAccount extends Account{
    private float interesRate = 0.02f;

    public SavingsAccount(int accountBalance) {
        super(accountBalance);
    }
    public float calculateInterest(float depositAmount){
        float interest = depositAmount * interesRate;
        return interest;
    }
    @Override
    protected void deposit(float depositAmount){
        accountBalance += depositAmount + calculateInterest(depositAmount);
    }
    
    @Override
    protected void withdraw(float withdrawAmount){
        super.accountBalance -= withdrawAmount;
    }
    
}
