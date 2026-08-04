import java.util.Scanner;
public class pass{
    private String pass;
    public void setPass(String name){
        if(name.length()<=8){
            pass=name;
        }
        else{
            System.out.println("Password too long!");
        }
    }
    public String getPass(){
        return pass;
    }
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        pass p=new pass();
        System.out.println("Enter password: ");
        p.setPass(inp.nextLine());
        System.out.println(p.getPass());
        inp.close();
    }
}
