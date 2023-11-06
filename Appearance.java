import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Gender here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Appearance extends Character
{
    /**
     * Act - do whatever the Gender wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act()
    {
    
    }
    
    //Adds text "Appearance" w font size 28. Color(0,0,0,0) means transparent background
    
    public Appearance(){
        setImage(new GreenfootImage("Appearance",28, TitleOptions.getColor(), new Color(0, 0, 0, 0)));
    }
}
