// Create a simple ATM program. The user enters: Balance and Withdrawal amount. If the withdrawal amount is greater than the balance, throw an exception.

// Example: Balance: 5000, Withdraw: 7000.Insufficient balance.

import java.util.*;
public class fourth {
    static void atm(double balance, double withdraw){
        if(balance<withdraw){
            throw new ArithmeticException("Insufficient balancce!");
        }
        System.out.println("Withdrawal successful!");
        System.out.println("Remaining balance: " + (balance-withdraw));
    }
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Balance: ");
        double balance=inp.nextDouble();
        System.out.print("Withdraw: ");
        double amount=inp.nextDouble();
        try{
            atm(balance, amount);
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        inp.close();
    }
}
