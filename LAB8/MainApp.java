/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jftdrdr68dr.bankmanager;

/**
 *
 * @author User
 */
public class MainApp {
    
    public static void main(String[] args) {
        Account obj1 = new CurrentAccount(10000);
        Account obj2 = new SavingsAccount(20000);
        
        obj1.deposit(3000);
        obj1.withdraw(900);
        System.out.println(obj1.getBalance());

        obj2.deposit(1000);
        obj2.withdraw(2000);
        System.out.println(obj2.getBalance());
    }   
}
