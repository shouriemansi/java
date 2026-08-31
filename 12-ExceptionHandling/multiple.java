//Multiple Exceptions
//Write a program that: Takes two integers. Divides them. Stores some numbers in an array. Takes an index from the user.
//Handle both: ArithmeticException and ArrayIndexOutOfBoundsException

import java.util.*;
public class multiple {
    static int divide(int num1, int num2){
        return num1/num2;
    }
    static int index(int[] arr, int i){
        return arr[i];
    }
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter 2 numbers: ");
        int n1=inp.nextInt();
        int n2=inp.nextInt();
        int arr[]=new int[5];
        System.out.println("Enter array elements: "); 
        for(int i=0;i<5;i++){
            arr[i]=inp.nextInt();
        }  
        System.out.print("Enter index: ");
        int in=inp.nextInt();
        try{
            int result1=divide(n1,n2);
            System.out.println("Division result: " + result1);
            int value=index(arr, in);
            System.out.println("element: " + value);
        }
        catch(ArithmeticException e){
            System.out.println("Cant divide by 0");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array out of index!!");
        }
    }
}

// Once an exception occurs inside a try block, Java immediately stops executing the rest of that try block and jumps to the matching catch.



//To make both the exceptions possible

// try {
//     int result1 = divide(n1, n2);
//     System.out.println("Division result: " + result1);
// }
// catch (ArithmeticException e) {
//     System.out.println("Can't divide by 0");
// }

// try {
//     int value = index(arr, in);
//     System.out.println("Element: " + value);
// }
// catch (ArrayIndexOutOfBoundsException e) {
//     System.out.println("Array out of index!!");
// }