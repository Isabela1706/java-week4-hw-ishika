package javaprogramme;

/**
 * Display right angle triangle of @ using nested for loops
 * @
 * @@
 * @@@
 * @@@@
 * @@@@@
 */

public class RightAngleTriangle {
    public static void main(String[] args) {
        //Calling instance method via a object
        RightAngleTriangle t = new RightAngleTriangle();
        t.angleTriangle();

    }
    //Instance method
    public void angleTriangle(){
        int rows = 5;//You can change this value for more or fewer rows

        //Outer loop for the number of rows
        for(int i = 1; i <= rows; i++){
            //Inner loop for printing '@' characters
            for(int j = 1; j <= i; j++){
                System.out.print("@");
            }
            //Move to the next line after each row
            System.out.println("");
        }

    }
}
