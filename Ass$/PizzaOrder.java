
package Ass$;

public class PizzaOrder {
    Pizza p1 = new Pizza();
    Pizza p2 = new Pizza();
    Pizza p3 = new Pizza();
    public double calcTotal(){
        double total;
        total = p1.calcCost()+p2.calcCost()+p3.calcCost();
        return total;
    }
    
    
}
