
package pizza;

/**
 *
 * @author Azka Malik
 */
public class runner {
    public static void main(String[] args) {
        System.out.println("Maximum  orders that can be placed is 3");
        Pizza pizza_1 = new Pizza("Small",9,10,11);
        System.out.println(pizza_1.getDescription() + " for Rupee" + pizza_1.CalculateCost());

        Pizza pizza_2 = new Pizza();
        pizza_2.setPizza_size("Large");
        pizza_2.setNo_of_cheeseToppings(6);
        pizza_2.setNo_of_pepperoniToppings(7);
        pizza_2.setNo_of_hamToppings(2);
        System.out.println(pizza_2.getDescription() + " for Rupee" + pizza_2.CalculateCost());
        Pizza pizza_3 = new Pizza("Medium",8,9,3);
        System.out.println(pizza_3.getDescription() + " for Rupee" + pizza_3.CalculateCost());

        PizzaOrder pizzaOrder_1 = new PizzaOrder(pizza_1);
        PizzaOrder pizzaOrder_2 = new PizzaOrder(pizza_2);
        PizzaOrder pizzaOrder_3 = new PizzaOrder(pizza_3);

        System.out.println("Your  bill is Rs." + PizzaOrder.calculateTotal());
    }
}
