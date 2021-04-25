/*
 Write a base class Computer that contains data members of wordsize(in bits), memorysize 
(in megabytes), storagesize (in megabytes) and speed (in megahertz). Derive a Laptop 
class that is a kind of computer but also specifies the object’s length, width, height, and 
weight. Member functions for both classes should include a default constructor, a 
constructor to inialize all components and a function to display data members.
 */
package lab_08_assigment_02;

/**
 *
 * @author Azka Malik
 */
public class Lab_08_assigment_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      computer c1 = new computer ();
      c1.toString();
      laptop l1 = new laptop();
    }
    
}
