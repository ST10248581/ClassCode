package com.sem2.bubblesort;

import javax.swing.JOptionPane;

/**
 *
 * @author troyk
 */

public class BubbleSort {

    public static void main(String[] args) {

        // Get the number of elements in the array from the user
        //Prompt
        int arraySize = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter the number of items you would like to sort: "));

        //Initialize Array
        int[] arr = new int[arraySize];

        //Populate
        for (int i = 0; i < arraySize; i++) {
            arr[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter element " + (i + 1) + ": "));
        }

        // Make use of StringBuilder
        StringBuilder display = new StringBuilder("Original Array values: ");

        for (int i = 0; i < arraySize; i++) {
            display.append(arr[i]).append(", ");
        }

        JOptionPane.showMessageDialog(null, display.toString());

        bubbleSort(arr);

        StringBuilder newDisplay = new StringBuilder("Sorted Array Values: ");

        for (int i = 0; i < arraySize; i++) {
            newDisplay.append(arr[i]).append(", ");
        }

        JOptionPane.showMessageDialog(null, newDisplay.toString());


    }

    //Bubble Sort Method
    public static void bubbleSort(int[] arr) {
        // Determine the array size (Keeps loop in bounds)
        int n = arr.length;
        boolean swapped;

        //Outer (Used to pass the number of iterations completeted based on array size)
        for (int i = 0; i < (n - 1); i++) {
            // Flag
            swapped = false;

            //Inner (The actuat swop of elements)
            for (int j = 0; j < (n - 1); j++) {

                if (arr[j] > arr[j + 1]) {

                    //Swap arround the elements, introduce temp and hold moving variable
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            // If no elements swapped in inner loop the array is already sorted
            if (!swapped) {
                break;
            }
        }
    }
}
