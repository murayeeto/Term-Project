import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BadEndScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BadEndScreen extends EndScreen
{
    /**
     * Constructor for objects of class BadEndScreen.
     * 
     */
    private Character player;
    public BadEndScreen(Character player)
    {   
        this.player = player;
        addObject(new GameOver(),300,35);
        addObject(new GameSummary(player),300,200);
        addObject(new ContinueArrow(), 545,365);
    }
}
