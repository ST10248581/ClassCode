package com.sem2.class_activity;

import javax.swing.JOptionPane;

/**
 *
 * @author troyk
 */

public class ClassActivity {

    public static void main(String[] args) {

        int[][] deliveriesEachYear = {{128, 135, 139},
        {155, 129, 175},
        {129, 130, 185}};

        int[] years = {2018, 2019, 2020};

        int totalDeliveries = 0;
        int minimumDeliveries = 0;
        int maximumDeliveries = 0;

        // Outer:
        for (int i = 0; i < deliveriesEachYear.length; i++) {
            //inner
            for (int j = 0; j < deliveriesEachYear.length; j++) {
                // Find Total
                totalDeliveries += deliveriesEachYear[i][j];

                minimumDeliveries = i;

                // Find Min
              if (deliveriesEachYear[i][j] < minimumDeliveries) {
                    minimumDeliveries = deliveriesEachYear[i][j];
                }

                // Find Max
              if (deliveriesEachYear[i][j] > maximumDeliveries) {
                    maximumDeliveries = deliveriesEachYear[i][j];
                }
            }
        }

        StringBuilder deliveries = new StringBuilder(" DELIVERIES REPORT" + "\n" + "                             " + "Jan       Feb     March" + "\n");

        // Outer:
        for (int i = 0; i < years.length; i++) {
            deliveries.append("Deliveries ").append(years[i]).append(": ");

            //inner
            for (int j = 0; j < years.length; j++) {

                deliveries.append(deliveriesEachYear[i][j]).append("        ");
            }

            deliveries.append("\n");
        }

        StringBuilder statistics = new StringBuilder("STATISTICS" + "\n");

        statistics.append("Total Deliveries: ").append(totalDeliveries).append("\n");
        statistics.append("Minimum Deliveries: ").append(minimumDeliveries).append("\n");
        statistics.append("Maximum Deliveries: ").append(maximumDeliveries).append("\n");

        JOptionPane.showMessageDialog(null, deliveries + "\n" + statistics);
    }
}
