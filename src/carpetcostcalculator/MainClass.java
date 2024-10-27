package carpetcostcalculator;

/**
 * Main class
 */

public class MainClass {
    public static void main(String[] args) {
        //Test code
        CarpetClass carpetClass = new CarpetClass(3.5);
        FloorClass floorClass = new FloorClass(2.75, 4.0);
        CalculatorClass calculatorClass = new CalculatorClass(floorClass, carpetClass);
        System.out.println("total= " + calculatorClass.getTotalCost());


        carpetClass = new CarpetClass(1.5);
        floorClass = new FloorClass(5.4, 4.5);
        calculatorClass = new CalculatorClass(floorClass, carpetClass);
        System.out.println("total= " + calculatorClass.getTotalCost());

    }
}
