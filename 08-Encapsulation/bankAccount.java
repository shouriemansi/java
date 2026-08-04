// Bank Account
//Private: balance
//Methods= deposit(amount), withdraw(amount)
//Conditions: Cannot withdraw more than balance.

import java.util.Scanner;
public class bankAccount {
    private double balance;
    bankAccount(double balance){
        this.balance=balance;
    }
    public void deposit(double amount){
        if(amount>0){
            balance+=amount;
            System.out.println("Deposited: " + amount);
        }
        else{
            System.out.println("Invalid deposit amount.");
        }
    }
    public void withdraw(double amount){
        if(amount<=0){
            System.out.println("Invalid withdrawal amount.");
        }
        else if(amount>balance){
            System.out.println("Insufficient balance!");
        }
        else{
            balance-=amount;
            System.out.println("Withdrawn: " + amount);
        }
    }
    public double getBalance(){
        return balance;
    }
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter initial balance: ");
        double initial_balance=inp.nextDouble();
        bankAccount a=new bankAccount(initial_balance);
        System.out.println("Enter the amount to be deposited: ");
        double depositAmount=inp.nextDouble();
        a.deposit(depositAmount);
        System.out.println("Enter the amount to withdraw: ");
        double withdrawAmount=inp.nextDouble();
        a.withdraw(withdrawAmount);
        System.out.println("Current balance: " +  a.getBalance());
        inp.close();
    }
}
