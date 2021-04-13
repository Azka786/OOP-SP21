/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_06_activity_02_main;

/**
 *
 * @author Azka Malik
 */
public class objects_02 {
    private static int no_of_obj=0;
    private int a;
    objects_06(){
        no_of_obj++;
    }
    objects_02(int x){
        a=x;
        no_of_obj++;
        }
    public static int get_obj(){
        return no_of_obj;
    }
    public void display(){
        System.out.println("objects created : "+get_obj()+" that is :"+a);
    }
    
}
