//Product Price. Private= productName, price. Price cannot be negative.

import java.util.Scanner;
public class product {
    private String name;
    private int price;
    public void setName(String name){
        this.name=name;
    }
    public void setPrice(int price){
        if(price>0){
            this.price=price;
        }
        else{
            System.out.println("Invalid amount!");
        }
    }
    public String getName(){
        return name;
    }
    public int getPrice(){
        return price;
    }
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        product p=new product();
        System.out.println("Enter product name: ");
        String name=inp.nextLine();
        p.setName(name);
        System.out.println("Enter the price of the product: ");
        int price=inp.nextInt();
        p.setPrice(price);
        System.out.println("Product name: " + p.getName());
        System.out.println("Price: " + p.getPrice());
        inp.close();
    }
}
