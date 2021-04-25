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
public class tape extends publication{
    String playing_time;

    public tape(String playing_time, String title, int price) {
        super(title, price);
        this.playing_time = playing_time;
    }


    

    public void setPlaying_time(String playing_time) {
        this.playing_time = playing_time;
    }

    public String getPlaying_time() {
        return playing_time;
    }
   
    @Override
    public void display(){
     
        System.out.println(" \n playing time is : "+playing_time);
    }
    
}
