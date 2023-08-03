
package com.sem2.twodimensionalarray;

import javax.swing.JOptionPane;

/**
 *
 * @author troyk
 */

public class TwoDimensionalArray {

    public static void main(String[] args) {

        /*
        * Declare 2D Array
        * dataType arrayName[numRows][numColumns] = {{R1, R1, R1},
        *                                                                                 {R2, R2, R2},
        *                                                                                 {R3, R3, R3}}
         */
        int[][] rental = {{400, 500, 650},
        {650, 800, 950},
        {1050, 1200, 1450},
        {1650, 1900, 2450},};

        int floor = Integer.parseInt(JOptionPane.showInputDialog("What floor would you like to stay on (1, 2, 3 or 4): "));
        int roomNumber = Integer.parseInt(JOptionPane.showInputDialog("How Many Rooms would you Like (1, 2 or 3); "));

        JOptionPane.showMessageDialog(null, "A " + roomNumber + " room house on floor " + floor + " costs: R" + rental[floor - 1][roomNumber - 1]);
    }
}
