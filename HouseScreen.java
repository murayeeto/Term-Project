import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
import java.util.ArrayList;

/**
 * Write a description of class HouseScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HouseScreen extends World
{

    /**
     * Constructor for objects of class HouseScreen.
     * 
     */
    public HouseScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        GreenfootImage houseBG = new GreenfootImage("images/Backgrounds/houseworldthree.png");
        houseBG.scale(600,400);
        setBackground(houseBG);
        
        addObject(new CharacterIcon(), 25,30);
        addObject(new HouseInput(), 370, 37);
        addObject(new HouseText("House Choice:"), 250, 47);
        addObject(new PreviousArrow(), 545, 365);
        addObject(new ContinueArrow(),45,365);
    }
    
}
