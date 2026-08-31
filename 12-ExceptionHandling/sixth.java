// Password Validation: Create a method:
// Rules: Password must contain at least 8 characters. Otherwise throw an exception.

// Example:

// Password: abc123

// Password must contain at least 8 characters.

import java.util.*;
public class sixth {
    static void validatePassword(String password){
        if(password.length()<8){
            throw new IllegalArgumentException("Password must contain atleast 8 characters!");
        }
        System.out.println("Valid password");
    }
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Password: ");
        String password=inp.nextLine();
        try{
            validatePassword(password);
        }
        catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        inp.close();
    }    
}
