package poolarea;

/**
 * Child class
 */
public class CuboidClass extends RectangleClass {
    // Instance variable
    private double height;

    // Constructor
    public CuboidClass(double width, double length, double height){
        super (width, length);// Call the parent constructor
        this.height = (height < 0) ? 0 : height;

    }
    // Method to get the height
    public double getHeight(){
        return height;
    }
    // Method to calculate the volume
    public double getVolume(){
        return getArea() * height; // Volume = Base Area * Height
    }
}
