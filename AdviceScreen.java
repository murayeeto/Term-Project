import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class AdviceScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AdviceScreen extends EndScreen
{
    /**
     * Constructor for objects of class AdviceScreen.
     * 
     */
    public AdviceScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        addObject(new WantTo(),300,35);
        addObject(new GameAdvice(), 301,216);
        addObject(new ContinueArrow(), 545,365);
    }
}
