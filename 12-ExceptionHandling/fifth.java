// Ask the user for their age. If age is less than 18, throw an exception
//  Age must be 18 or above. Otherwise print: You are eligible.

// import java.util.*;
// public class fifth {
//     static void checkAge(int age){
//         if(age<18){
//             throw new IllegalArgumentException();
//         }
//         System.out.println("You are eligible");
//     }
//     public static void main(String[] args) {
//         Scanner inp=new Scanner(System.in);
//         System.out.print("Enter age: ");
//         int age=inp.nextInt();
//         try{
//             checkAge(age);
//         }
//         catch(IllegalArgumentException e){
//             System.out.println("You are not eligible!");
//         }
//         inp.close();
//     }
// }


// Positive Number Validation: Create a method: static void checkNumber(int num)
// If the number is negative, throw an exception. Otherwise print: Valid number

import java.util.*;
public class fifth {
    static void checkNum(int num){
        if(num<0){
            throw new IllegalArgumentException();
        }
        System.out.println("Valid number");
    }
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter number: ");
        int n=inp.nextInt();
        try{
            checkNum(n);
        }
        catch(IllegalArgumentException e){
            System.out.println("Not a valid number!");
        }
        inp.close();
    }
}