// Bank Account. Private: accountNumber and balance
//Setter for balance should not allow negative values.

import java.util.Scanner;
public class bank {
    private int accountNumber;
    private double balance;
    public void setBalance(double balance){
        if(balance>0){
            this.balance=balance;
        }
        else{
            System.out.println("Invalid balance!");
        }
    }
    public void setAccountNumber(int accountNumber){
        this.accountNumber=accountNumber;
    }
    public int getAccountNumber(){
        return accountNumber;
    }
    public double getBalance(){
        return balance;
    }
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        bank b=new bank();
        System.out.print("Enter Account Number: ");
        b.setAccountNumber(inp.nextInt());
        System.out.print("Enter Balance: ");
        b.setBalance(inp.nextDouble());

        System.out.println("\nAccount Details:");
        System.out.println("Account Number: " + b.getAccountNumber());
        System.out.println("Balance: " + b.getBalance());
        inp.close();
    }
}
