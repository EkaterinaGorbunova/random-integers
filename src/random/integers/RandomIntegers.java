/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package random.integers;

import java.util.Random;

/**
 *
 * @author Kate
 */
public class RandomIntegers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Random randomNumbers = new Random(); // random number generator
        int face; // stores each random integer generated

        // loop 20 times
        for (int counter = 1; counter <= 20; counter++) {
            // pick random integer from 1 to 6
            face = 1 + randomNumbers.nextInt(6);

            System.out.printf("%d ", face); // display generated value

            // if counter is divisible by 5, start a new line of output
            if (counter % 5 == 0)
            System.out.println();
        } // end for
    } // end main
} // end class RandomIntegers
