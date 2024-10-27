package carpetcostcalculator;

/**
 * Child class
 */

public class CarpetClass {
    //Instance variable
    private double cost;

    //Constructor
    public CarpetClass (double cost){
        this.cost = (cost < 0) ? 0 : cost;


    }

    //Method to get the cost
    public double getCost(){
        return cost;
    }
}
