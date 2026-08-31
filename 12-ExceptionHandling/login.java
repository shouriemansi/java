//Create a login system with: username and password. Store a correct username and password.
// If username is incorrect, throw: InvalidUsernameException
// If password is incorrect, throw: InvalidPasswordException
// (multiple custom exceptions)

import java.util.*;
class InvalidUsernameException extends Exception{
    InvalidUsernameException(String message){
        super(message);
    }
}
class InvalidPasswordException extends Exception{
    InvalidPasswordException(String message){
        super(message);
    }
}
public class login {
    static void login(String username, String password) throws InvalidUsernameException, InvalidPasswordException{
        String correctUsername="admin123";
        String correctPassword="123e";
        if(!username.equals(correctUsername)){
            throw new InvalidUsernameException("Username does not match!");
        }
        if(!password.equals(correctPassword)){
            throw new InvalidPasswordException("Password incorrect!");
        }
    }
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter username: ");
        String name=inp.next();
        System.out.println("Enter password: ");
        String pass=inp.next();
        try{
            login(name, pass);
        }
        catch(InvalidUsernameException e){
            System.out.println(e.getMessage());
        }
        catch(InvalidPasswordException e){
            System.out.println(e.getMessage());
        }
        inp.close();
    }
}
