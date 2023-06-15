/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jftdrdr68dr.bankmanager;

/**
 *
 * @author User
 */
public class CurrentAccount extends Account{
    private final float feeCharge = 30;
    
    public CurrentAccount(float accountBalance) {
        super(accountBalance);
    }
    
    @Override
    protected void deposit(float depositAmount){
        super.accountBalance += depositAmount - feeCharge;
    }
    @Override
    protected void withdraw(float withdrawAmount){
        super.accountBalance -= (withdrawAmount + feeCharge);
    }
}
