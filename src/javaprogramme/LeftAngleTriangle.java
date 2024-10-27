package javaprogramme;

/**
 * Display left angle triangle of * using nested for loops
 * *
 * * *
 * * * *
 * * * * *
 * * * * * *
 */

public class LeftAngleTriangle {
    public static void main(String[] args) {
        //Call Instance method here
        LeftAngleTriangle t = new LeftAngleTriangle();
        t.printLeftAngleTriangle();

    }
    //Instance method
    public  void printLeftAngleTriangle(){
        int rows = 5;//Specify the number of rows for the triangle

        // Outer loop for the number of rows
        for (int i = 1; i <= rows; i++){
            //Inner loop for printing '*' characters
            for (int j = 1; j <= i; j++){
            System.out.print(" *");
        }
            // Move to the next line after each row
            System.out.println();
        }
    }
}
