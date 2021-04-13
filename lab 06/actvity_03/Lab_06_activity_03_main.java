/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_06_activity_03_main;

/**
 *
 * @author Azka Malik
 */
public class Lab_06_activity_03_main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ABC o1 = new ABC(22,"age");
        o1.display();
        o1.display_static();
        ABC.display_static();
//SO HERE WE CAN ACESS THE STATIC METHOD BY USING BOTH CLASS NAME AND OBJECT NAME
    }
    
}
