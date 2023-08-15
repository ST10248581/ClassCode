package com.sem2.monsters;

import javax.swing.JOptionPane;

/**
 *
 * @author troyk
 */

public class Monsters {

    public static void main(String[] args) {

        //Welcome Message
        JOptionPane.showMessageDialog(null, "Welcome to Monster Dictionary");

        String monster;


        // Prompt for monster Information
        String typeOne = JOptionPane.showInputDialog(null, "Please input a type of monster: ");
        monster = JOptionPane.showInputDialog(null, "Please enter some monsters of that type (Seperated by commas): ");
        String[] cat1 = monster.split(",");

        // Initialize monster objects
        monsterTypes monsterOne = new monsterTypes(typeOne, cat1);

        // Prompt for monster Information
        String typeTwo = JOptionPane.showInputDialog(null, "Please input a type of monster: ");
        monster = JOptionPane.showInputDialog(null, "Please enter some monsters of that type (Seperated by commas): ");
        String[] cat2 = monster.split(",");

        // Initialize monster objects
        monsterTypes monsterTwo = new monsterTypes(typeTwo, cat2);

        // Create monster type array
        String[] types = {typeOne, typeTwo};

        // Create Jagged Array
        String[][] monsterInfo = {monsterOne.getMonsters(), monsterTwo.getMonsters()};

        //Create message (StringBuilder)
        StringBuilder display = new StringBuilder("Types of Monsters").append("\n").append("-----------------------------------").append("\n");

        for (int i = 0; i < monsterInfo.length; i++) {

            display.append(types[i]).append(": ").append("\n");

            for (int j = 0; j < monsterInfo[i].length; j++) {

                display.append("    - ").append(monsterInfo[i][j]).append("\n");
            }
        }
        //Display Message
        JOptionPane.showMessageDialog(null, display);
    }
}
