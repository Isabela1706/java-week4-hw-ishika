package cylinder;

/**
 * MainClass
 */

public class MainClass {
    public static void main(String[] args) {
        //Test code
        CircleClass circle = new CircleClass(3.75);
        System.out.println("Circle.radius = " + circle.getRadius());
        System.out.println("Circle.area= " + circle.getArea());

        CylinderClass cylinderClass = new CylinderClass(5.55, 7.25);
        System.out.println("cylinder.radius= " + cylinderClass.getRadius());
        System.out.println("cylinder.height= " + cylinderClass.getHeight());
        System.out.println("cylinder.area= " + cylinderClass.getArea());
        System.out.println("cylinder.volume= " + cylinderClass.getVolume());
    }
}
