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
public class ABC_activity_03 {
    public static int i;
    public String s;
    ABC_activity_03(int i,String s){
        this.i = i;
        this.s = s;
    }
    //static method : to display static variable
    public static void display_static(){
        System.out.println("\nthe static varaiable is");
        System.out.println("i : "+i);
    }
    //non-static method
    public void display(){
        System.out.println("\ni : "+i);
        System.out.println("s : "+s);

    }
}
