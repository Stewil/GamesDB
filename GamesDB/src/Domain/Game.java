/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

import java.util.ArrayList;

/**
 *
 * @author Bjarke PC
 */
public class Game {
    /*
    Add name, String
    Add console, Console[array]
    Add genre, String
    Add age limit, int
    Add mulitiplayer, boolean
    add isSequel, boolean
    add isBestseller, boolean
    add price, int
    */
    private final String name;
    private ArrayList<Console> consolelist;
    private final String genre;
    private int age;
    private boolean multiplayer;
    private boolean isSequel;
    private boolean isBestSeller;
    private int price;
    
    public Game(String name, String genre, int age, boolean multiplayer, boolean isSequel, boolean isBestSeller, int price){
        consolelist = new ArrayList<>();
    }
    public void addConsole(Console c){
        consolelist.add(c);
        
    } 
}
