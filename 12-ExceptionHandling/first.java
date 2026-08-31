//Write a Java program that: Takes two integers from the user. Divides the first number by the second. Handles ArithmeticException if the second number is 0.

import java.util.*;
public class first {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter first number: ");
        int n1=inp.nextInt();
        System.out.print("Enter second number: ");
        int n2=inp.nextInt();
        try{
            int result=n1/n2;
            System.out.println("Division result: " + result);
        }
        catch(ArithmeticException e){
            System.out.println("Cannot divide by 0");
        }
    }
}
