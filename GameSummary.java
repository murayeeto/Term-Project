import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameplaySummary here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameSummary extends Actor
{
    /**
     * Act - do whatever the GameplaySummary wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    
    public GameSummary(){
        NameInput.loadName();
        setImage(new GreenfootImage(NameInput.getName()+" ended with "+"$"+new Character().getMoney()+" and a credit score of "+new Character().getCredit(),24,Color.BLACK,new Color(0, 0, 0, 0)));
    }
    
}
