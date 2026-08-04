//ATM
//Private: pin, balance
//Methods= changePin(), withdraw(), deposit()

import java.util.Scanner;
public class atm {
    private int pin;
    private double balance;
    atm(int pin, double balance){
        this.pin=pin;
        this.balance=balance;
    }
    public void changePin(int oldPin, int newPin){
        if(oldPin==pin){
            pin=newPin;
            System.out.println("Pin changed successfully!");
        }
        else{
            System.out.println("Incorrect old pin!");
        }
    }
    public void deposit(double amount){
        if(amount>0){
            balance+=amount;
            System.out.println(amount + "deposited successfully!");
        }
        else{
            System.out.println("Enter valid amount!");
        }
    }
    public void withdraw(int enteredPin, double amount){
        if(enteredPin!=pin){
            System.out.println("Incorrect PIN");
            return;
        }
        if(amount<=0){
            System.out.println("Enter valid amount");
            return;
        }
        else if(balance<amount){
            System.out.println("Insufficient balance");
            return;
        }
        else{
            balance-=amount;
            System.out.println("Withdrawn successfully!");
        }
    }
    public double getBalance(){
        return balance;
    }
    public static void main(String[] args){
        atm a1 = new atm(1234, 10000);

        a1.deposit(2000);
        a1.withdraw(1234, 3000);
        a1.changePin(1234, 5678);

        System.out.println("Current Balance: " + a1.getBalance());
        a1.withdraw(1234, 500);
    }
}
