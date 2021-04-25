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
public class laptop extends computer {
    int length;
    int weight;
    int height;
    int width;
    //defaut or non argumented constructor
    laptop(){
        length= 0 ;
        weight = 0;
        height = 0;
        width = 0;
    }
//argumented constructor to intialize all componenets
     laptop(int length, int weight, int height, int width) {
        this.length = length;
        this.weight = weight;
        this.height = height;
        this.width = width;
    }

    @Override
    public String toString() {
        return "laptop{" + "length=" + length + ", weight=" + weight + ", height=" + height + ", width=" + width + '}';
    }
    
}
