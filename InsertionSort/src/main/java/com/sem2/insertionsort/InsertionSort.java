package com.sem2.insertionsort;

import java.util.Arrays;

/**
 *
 * @author troyk
 */
public class InsertionSort {

    public static void main(String[] args) {

        // Declare an array
        int[] numArray = {13, 4, 55, 1, 56, 78};

        // Display original values to user
        System.out.println("Original Values:" + Arrays.toString(numArray));

        //Apply Insertion Sort
        for (int k = 1; k < (numArray.length - 1); k++) {

            // Create temporary variable (Hold value in question)
            int temp = numArray[k];

            //Used to compare against temp;
            int j = k - 1;

            // Both conditions need to be true (Comparison takes place in loop decleration)
            while (j >= 0 && temp <= numArray[j]) {

                // swaps value with the subscript before it, with each iteration, at the end of the while loop, the value has been 'inserted' in the correct place
                numArray[j + 1] = numArray[j];

                // Decrementing Loop Control
                j = j - 1;
            }

            numArray[j + 1] = temp;

        }

        // Print out the sorted array
        System.out.println("Sorted Values: " + Arrays.toString(numArray));
    }
}
