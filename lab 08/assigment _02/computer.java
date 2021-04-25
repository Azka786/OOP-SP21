/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_08_assigment_02;

/**
 *
 * @author Azka Malik
 */
public class computer {
    protected int word_size;
    protected int memory_size;
    protected int storage_size;
    protected int speed;
    //defaut or non argumented constructor
    computer(){
        word_size = 0;
        memory_size = 0;
        storage_size = 0;
        speed = 0;
        
    }
//argumented constructor to intialize all componenets
    computer(int word_size, int memory_size, int speed) {
        this.word_size = word_size;
        this.memory_size = memory_size;
        this.speed = speed;
    }

 
    @Override
    public String toString() {
        return "computer{" + "word_size=" + word_size + ", memory_size=" + memory_size + ", storage_size=" + storage_size + ", speed=" + speed + '}';
    }
    
    
}
