/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_08_assigment_01;

/**
 *
 * @author Azka Malik
 */
public class publication {
    String title;
    int price;

     publication(String title, int price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public int getPrice() {
        return price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public void display(){
        System.out.println("the tiltle is : "+ title+"\nand the price is "+price);
    }
}
