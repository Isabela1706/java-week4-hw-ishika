package cylinder;

/**
 * Cylinder Class
 * Extends the class
 */

public class CylinderClass extends CircleClass {
    //Instance variable
    private double height;


    //Constructor
    public CylinderClass(double radius, double height){
        super(radius);//call the parent constructor
        this.height = (height < 0) ? 0 : height;
    }
    //Method to get the height
    public double getHeight(){
        return height;

    }
    //Method to calculate the volume
    public double getVolume(){
        return getArea() * height;
    }
}
