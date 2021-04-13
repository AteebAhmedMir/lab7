
package Ass$;


public class RunnerPizza {
    public static void main(String[] args) {
        Pizza s1 = new Pizza();
        Pizza s2 = new Pizza();
        s1.setSize("large");
        s1.calcCost();
        s1.getDescription();
        s2.setSize("medium");
        s2.setCheeseT(1);
        s2.setChickenT(1);
        s2.setPepperoniT(1);
        s2.calcCost();
        s2.getDescription();
        
        
        PizzaOrder o1 = new PizzaOrder();
        o1.p1.setSize("large");
        o1.p1.setChickenT(2);
        o1.p1.setCheeseT(1);
        o1.p2.setSize("small");
        o1.p2.setPepperoniT(4);
        o1.p1.calcCost();
        o1.p2.calcCost();
        System.out.println(o1.calcTotal());
        
    }
    
}
