//Mobile Class= Store: brand, model, price. Take input from user and print details.

import java.util.Scanner;
public class mobile {
    private String brand;
    private String model;
    private int price;
    public void setBrand(String brand){
        this.brand=brand;
    }
    public void setModel(String model){
        this.model=model;
    }
    public void setPrice(int price){
        this.price=price;
    }
    public String getBrand(){
        return brand;
    }
    public String getModel(){
        return model;
    }
    public int getPrice(){
        return price;
    }
    public static void main(String[] args){
        mobile m1=new mobile();
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter Brand name: ");
        String brand=inp.nextLine();
        System.out.println("Enter model: ");
        String model=inp.nextLine();
        System.out.println("Enter price: ");
        int price=inp.nextInt();
        m1.setBrand(brand);
        m1.setModel(model);
        m1.setPrice(price);
        System.out.println("Brand and model of the mobile: " + m1.getBrand() + m1.getModel());
        System.out.println("Price: " + m1.getPrice());
    }
}
