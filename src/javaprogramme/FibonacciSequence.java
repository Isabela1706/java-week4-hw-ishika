package javaprogramme;

/**
 * Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
 */

public class FibonacciSequence {
    public static void main(String[] args) {
        //Calling static method direct
        printFibonacci(8);

    }
    //static method
    public static void printFibonacci(int n){
        int terms = 8;
        int a = 0, b = 1; //Starting values for the Fibonacci sequence

        for(int i = 1; i <= n; i++){
            System.out.println(b + "");//Print the current Fibonacci number

            //Calculate the next Fibonacci number
            int next = a + b;
            a = b; //Update 'a' to the previous Fibonacci number
            b = next;//Update 'b' to the previous Fibonacci number
        }


    }
}
