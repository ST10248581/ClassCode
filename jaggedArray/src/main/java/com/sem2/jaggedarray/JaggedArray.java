package com.sem2.jaggedarray;

/**
 *
 * @author troyk
 */

public class JaggedArray {

    public static void main(String[] args) {

        // Set Row not column
        int[][] studentCourse = new int[3][];

        // Define length of each Column
        studentCourse[0] = new int[]{30, 12, 45};
        studentCourse[1] = new int[]{1, 23, 56, 78, 8};
        studentCourse[2] = new int[]{6, 9};

        // Print using for loop
        // Outer
        for (int i = 0; i < studentCourse.length; i++) {
            //Prints out number of students in each course
            System.out.println("For Course " + (i + 1) + " There are " + studentCourse[i].length + " Students Registered: ");

            //Inner
            for (int j = 0; j < studentCourse[i].length; j++) {
                // Prints Student number
                System.out.println(studentCourse[i][j]);

            }
        }
    }
}
