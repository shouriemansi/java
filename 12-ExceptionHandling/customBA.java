// Create: class InsufficientBalanceException extends Exception
// Create a BankAccount class If: amount > balance. throw your custom exception.

import java.util.*;
class InsufficientBalanceException extends Exception{
    InsufficientBalanceException(String message){
        super(message);
    }
}
class BankAccount{
    double balance;
    BankAccount(double balance) {
        this.balance=balance;
    }
    void withdraw(double amount) throws InsufficientBalanceException{
        if(amount>balance){
            throw new InsufficientBalanceException("Insufficient amount");
        }
        balance=balance-amount;
        System.out.println("Withdrawal amount: " + amount);
        System.out.println("Remaining balance: " + balance);
    }
}
public class customBA {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter balance: ");
        double balance=inp.nextDouble();
        System.out.println("Enter amount to be withdrawn: ");
        double amount=inp.nextDouble();
        BankAccount b1=new BankAccount(balance);
        try{
            b1.withdraw(amount);
        }
        catch(InsufficientBalanceException e){
            System.out.println(e.getMessage());
        }
        inp.close();
    }    
}
