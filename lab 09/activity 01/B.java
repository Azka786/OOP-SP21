/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_09_activity_01;

/**
 *
 * @author Azka Malik
 */
public class B extends A{
    int k;
    B(int i,int j,int k){
        super(i,j);
        this.k=k;
    }
    @Override
    void show(){
        //super.show();
         System.out.println("k is "+k);
    }
}
