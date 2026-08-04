//Circle: Private= radius. Constructor, Getter. Method: calculateArea()

import java.util.Scanner;
public class circle{
    private double radius;
    circle(double radius){
        this.radius=radius;
    }
    public double getRadius(){
        return radius;
    }
    public void calculateArea(){
        double area=3.14*radius*radius;
        System.out.println("Area is: " + area);
    }
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter radius: ");
        double radius=inp.nextDouble();
        circle c=new circle(radius);
        System.out.println("Radius = " + c.getRadius());
        c.calculateArea();
        inp.close();
    }
}