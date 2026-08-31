// Division Method with throws
// Create: static int divide(int a, int b) throws ArithmeticException
// Handle division by zero in the calling method.

import java.util.*;
public class throwdiv {
    static int divide(int a, int b) throws ArithmeticException{
        return a/b;
    }
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a=inp.nextInt();
        System.out.print("Enter second number: ");
        int b=inp.nextInt();
        try{
            int result=divide(a,b);
            System.out.println(result);
        }
        catch(ArithmeticException e){
            System.out.println("Cannot divide by 0");
        }
        inp.close();
    }
}
