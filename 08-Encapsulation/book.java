// Create a class with title, author, price

import java.util.Scanner;
public class book {
    private String title;
    private String author;
    private int price;
    public void setTitle(String title){
        this.title=title;
    }   
    public void setAuthor(String author){
        this.author=author;
    } 
    public void setPrice(int price){
        this.price=price;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public int getPrice(){
        return price;
    }
    public static void main(String[] args){
        book b1=new book();
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter the title: ");
        String title=inp.nextLine();
        String author=inp.nextLine();
        b1.setTitle(title);
        b1.setAuthor(author);
        b1.setPrice(300);
        System.out.println("Name of the book is " + b1.getTitle() + " and its author is " + b1.getAuthor() + ".The price is: " +  b1.getPrice());
    }
}
