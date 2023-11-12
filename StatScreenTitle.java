import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StatScreenTitle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StatScreenTitle extends Actor
{
    /**
     * Act - do whatever the StatScreenTitle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    //createss state screen title 
    public StatScreenTitle()
    {
        GreenfootImage statTitle = new GreenfootImage("images/icons/StatTitle.png");
        statTitle.scale(150,50);
        //statTitle.scale(statTitle.getWidth() - 120 ,statTitle.getHeight() - 120);
        setImage(statTitle);
        
    }
    
    //public void act()
    //{
    //    new StatScreenTitle();
    //}
}
