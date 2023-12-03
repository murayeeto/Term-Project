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
    public BadEndScreen()
    {    
        addObject(new GameOver(),300,35);
        addObject(new GameSummary(),300,100);
        if (true){//should be Character.getAchievements().size > 0 
            addObject(new GameAchievements(),295,230);
        }
        addObject(new ContinueArrow(), 545,365);
    }
}
