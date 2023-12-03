import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameplayAchievements here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameAchievements extends GameSummary
{
    /**
     * Act - do whatever the GameplayAchievements wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    
    public GameAchievements(){
        setImage(new GreenfootImage("Achievements:\n\nPayment Master: Never missed a due date! \n Budget Pro: Maintained a positive balance!\n"+
        "Credit Master: Achieved a perfect score of 850!\n Debt-free Champion: Paid off all outstanding debt!\n"+
        "Retired Millionaire: Ended the game with over \n$1,000,000!", 24, TitleOptions.getColor(),new Color(0, 0, 0, 0)));
    }
}
