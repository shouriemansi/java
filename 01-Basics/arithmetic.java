import java.util.Scanner;
public class arithmetic {
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a=inp.nextInt();
        System.out.print("Enter second number: ");
        int b=inp.nextInt();

        int sum=a + b;

        int difference=a - b;

        int product=a * b;

        int division=a / b;

        int remainder=a % b;
        
        System.out.println("First Number: " + a);
        System.out.println("Second Number: " + b);

        System.out.println("Addition: " + sum);
        System.out.println("Subtraction: " + difference);
        System.out.println("Multiplication: " + product);
        System.out.println("Division: " + division);
        System.out.println("Remainder: " + remainder);
    }    
}
