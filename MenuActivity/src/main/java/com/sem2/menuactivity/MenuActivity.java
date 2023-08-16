
package com.sem2.menuactivity;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author troyk
 */
public class MenuActivity {

    public static void main(String[] args) {

        // User prompts
        final String WELCOME = "Wlecome to the Restaurant Menu App";
        final String INSTRUCTIONS = "You can set up today's menu by entering items one by one!" + "\n" + "NOTE: when you enter 'zzz' it will indicate the end of your menu input";
        final String PROMPT = "Please add an Item to your menu";
        final String QUIT = "zzz";

        String userInput;

        ArrayList<String> menu = new ArrayList<>();

        // User prompt
        JOptionPane.showMessageDialog(null, WELCOME);
        JOptionPane.showMessageDialog(null, INSTRUCTIONS);

        StringBuilder menuDisplay = new StringBuilder();

        do {

            // User Input
            userInput = JOptionPane.showInputDialog(null, PROMPT);

            // Checks for sentinal
            if (!userInput.equals(QUIT)) {
                menu.add(userInput);
            } else if (userInput.equals(QUIT)) {
                break;
            }

            // Builds current menu
            menuDisplay.append(userInput).append("\n");

            // Displays current menu
            JOptionPane.showMessageDialog(null, "Your current Menu: \n" + menuDisplay);

        } while (!userInput.equals(QUIT));

        //Builds final menu from arraylist
        StringBuilder finalMenu = new StringBuilder();

        for (String item : menu) {
            finalMenu.append(item).append("\n");
        }

        // Displays Mneu (Final)
        JOptionPane.showMessageDialog(null, "Your Final Menu: \n" + finalMenu);

        //Check availability
        do {
            userInput = JOptionPane.showInputDialog(null, "Please enter an Item to check its availablity (or 'zzz' to quit)");

            // Checks for sentinal
             if (userInput.equals(QUIT)) {
                break;
            }

            if (menu.contains(userInput)) {
                JOptionPane.showMessageDialog(null, "This item is available");
            } else {
                JOptionPane.showMessageDialog(null, "This Item is not available");
            }
        } while (!userInput.equals(QUIT));

        //Displays Thank you message
        JOptionPane.showMessageDialog(null, "Thank you for using Resturaunt Menu App");

    }
}
