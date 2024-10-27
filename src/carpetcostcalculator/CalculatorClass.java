package carpetcostcalculator;

/**
 * Third class
 */

public class CalculatorClass {
    //Instance variable
    private FloorClass floorClass;
    private CarpetClass carpetClass;

    //Constructor
    public CalculatorClass(FloorClass floorClass, CarpetClass carpetClass){
        this.floorClass = floorClass;
        this.carpetClass = carpetClass;
    }

    //Method to calculate total cost
    public double getTotalCost(){
        return floorClass.getArea()* carpetClass.getCost();
    }
}
