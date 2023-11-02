import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HelpScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HelpScreen extends World
{

    /**
     * Constructor for objects of class HelpScreen.
     * 
     */
    public HelpScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        setBackground("images/Backgrounds/citypopup.png");
        addObject(new HowToPlay(),300,40);
        
        //The coordinate object. Remove when its no longer needed.
        addObject(new Coordinate(), 450,300);
    }
}
