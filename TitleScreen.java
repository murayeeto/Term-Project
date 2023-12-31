import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TitleScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TitleScreen extends World
{

    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        setBackground("images/Backgrounds/cityandtown.PNG");
        addObject(new CreditLife(),305,90);
        addObject(new NewGame(),300,175);
        addObject(new Continue(),300,220);
        addObject(new Help(),300,260);
        
        //The coordinate object. Remove when its no longer needed.
        addObject(new Coordinate(), 450,300);
    }
}
