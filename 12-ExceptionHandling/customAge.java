//Create your own exception: class InvalidAgeException extends Exception
// Then create: static void checkAge(int age). If age is below 18: throw new InvalidAgeException("Age must be 18 or above");
//Otherwise: Access granted.

import java.util.*;
class InvalidAgeException extends Exception{
    InvalidAgeException(String message){
        super(message);
    }
}
public class customAge {
    static void checkAge(int age) throws InvalidAgeException{
        if(age<18){
            throw new InvalidAgeException("Age must be above 18!");
        }
        System.out.println("Access granted");
    }
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter age: ");
        int age=inp.nextInt();
        try{
            checkAge(age);
        }
        catch(InvalidAgeException e){
            System.out.println(e.getMessage());
        }
        inp.close();
    }
}
