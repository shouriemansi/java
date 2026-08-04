//Rectangle
//Private= length, breadth
//Method= area(), perimeter()

import java.util.Scanner;
public class rectangle {
    private int length;
    private int breadth;
    rectangle(int l, int b){
        length=l;
        breadth=b;
    }
    public int area(){
        return length*breadth;
    }
    public int perimeter(){
        return 2*(length+breadth);
    }
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter length: ");
        int l=inp.nextInt();
        System.out.println("Enter breadth: ");
        int b=inp.nextInt();
        rectangle r=new rectangle(l, b);
        int result1=r.perimeter();
        int result2=r.area();
        System.out.println("Area is " + result2);
        System.out.println("Perimeter is " + result1);
        inp.close();
    }
}
