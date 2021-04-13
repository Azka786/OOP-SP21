/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizza;

/**
 *
 * @author Azka Malik
 */
public class PizzaOrder {

        static Pizza[] p1 = new Pizza[3];

    private static int x = 0;

    public PizzaOrder(Pizza pizza){

        p1[x] = pizza;

       x++;

    }

    public static double calculateTotal() {

        double Bill = 0;

        for(int y = 0; y < x; y++){

            Double Bill1 = p1[y].CalculateCost();

            Bill = Bill + Bill1;

        }

        return Bill;

    }

}


