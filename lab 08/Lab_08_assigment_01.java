/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_08_assigment_01;
import java.util.Scanner;
/**
 *
 * @author Azka Malik
 */
public class Lab_08_assigment_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Enter book titile , page count and price ");
        Scanner input = new Scanner(System.in);
        book b1 = new book(input.next(),input.nextInt(),input.nextInt());
        b1.display();
        System.out.println("\n Enter the playing time ");
        tape t1 = new tape(input.next(),"titile",23);
        t1.display();
    }
    
}
