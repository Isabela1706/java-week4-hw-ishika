package poolarea;

/**
 * Main Class
 */

public class MainClass {
    public static void main(String[] args) {
        //Test code
        RectangleClass rectangle = new RectangleClass(5,10);
        System.out.println("rectangle.width= " + rectangle.getWidth());
        System.out.println("rectangle.length= " + rectangle.getLength());
        System.out.println("rectangle.area= " + rectangle.getArea());


        CuboidClass cuboid = new CuboidClass(5,10,5);
        System.out.println("Cuboid.width= " + cuboid.getWidth());
        System.out.println("Cuboid.length= " + cuboid.getLength());
        System.out.println("Cuboid.area= " + cuboid.getArea());
        System.out.println("Cuboid.height= " + cuboid.getHeight());
        System.out.println("Cuboid.volume= " + cuboid.getVolume());
    }
}
