import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Coordinate here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Coordinate extends Actor
{
    /**
     * Act - do whatever the Coordinate wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    //Run the program and move the foot object around to know where to place things
    
    public void act()
    {
        if (Greenfoot.mouseDragged(this)){
            MouseInfo mouse = Greenfoot.getMouseInfo();
            setLocation(mouse.getX(),mouse.getY());
            setImage(new GreenfootImage("X: "+getX()+"\nY: "+getY(), 24, null, null));
        }
    }
    
    public Coordinate(){
    }
}
