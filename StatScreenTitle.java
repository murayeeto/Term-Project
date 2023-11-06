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
        GreenfootImage statTitle = new GreenfootImage("StatTitle.png");
        statTitle.scale(200,50);
        setImage(statTitle);
        
    }
    
    //public void act()
    //{
    //    new StatScreenTitle();
    //}
}
