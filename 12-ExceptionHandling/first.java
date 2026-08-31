//Write a Java program that: Takes two integers from the user. Divides the first number by the second. Handles ArithmeticException if the second number is 0.

// import java.util.*;
// public class first {
//     public static void main(String[] args) {
//         Scanner inp=new Scanner(System.in);
//         System.out.print("Enter first number: ");
//         int n1=inp.nextInt();
//         System.out.print("Enter second number: ");
//         int n2=inp.nextInt();
//         try{
//             int result=n1/n2;
//             System.out.println("Division result: " + result);
//         }
//         catch(ArithmeticException e){
//             System.out.println("Cannot divide by 0");
//         }
//     }
// }



//Null String: Create a String variable and initially assign: String name = null;
// Try to call: name.length(); Handle the exception.

// import java.util.*;
// public class first {
//     public static void main(String[] args) {
//         Scanner inp=new Scanner(System.in);
//         String str=null;
//         try{
//             System.out.println("Size: " + str.length());
//         }
//         catch(NullPointerException e){
//             System.out.println("Null pointer exception!");
//         }
//     }
// }


// with finally: 

import java.util.*;
public class first {
    static int division(int n1, int n2){
        return n1/n2;
    }
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter first number: ");
        int n1=inp.nextInt();
        System.out.print("Enter second number: ");
        int n2=inp.nextInt();
        try{
            int result=division(n1, n2);
            System.out.println("Division result: " + result);
        }
        catch(ArithmeticException e){
            System.out.println("Cannot divide by 0");
        }
        finally{
            System.out.println("Program executed!");
        }
    }
}