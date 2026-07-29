//Swap 2 numbers : 1. Using a third variable 2. Without using a third variable
import java.util.Scanner;
public class swap {
    // Method 1: Using a third variable
    static void swapWithThirdVariable(int a,int b){
        System.out.println("\nUsing Third Variable:");
        System.out.println("Before Swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        int temp=a;
        a=b;
        b=temp;
        System.out.println("After Swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
    // Method 2: Without using a third variable
    static void swapWithoutThirdVariable(int a, int b){
        System.out.println("\nWithout Third Variable:");
        System.out.println("Before Swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After Swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a=sc.nextInt();
        System.out.print("Enter second number: ");
        int b=sc.nextInt();
        swapWithThirdVariable(a,b);
        swapWithoutThirdVariable(a,b);
        sc.close();
    }
}
