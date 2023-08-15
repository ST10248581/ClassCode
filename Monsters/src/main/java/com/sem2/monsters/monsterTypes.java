package com.sem2.monsters;

/**
 *
 * @author troyk Holds fields of monsters
 */

public class monsterTypes {

    //stores the type of monster
    private String type;

    //Stores the monsters the user inputs
    private String[] monsters;

    // Paramerised constructor
    public monsterTypes(String type, String[] monsters) {
        this.type = type;
        this.monsters = monsters;
    }

    // Returns monsterType to main
    public String getType() {
        return type;
    }

    // Returns The stored monsters to main
    public String[] getMonsters() {
        return monsters;
    }
}
