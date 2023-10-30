import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ForwardArrow here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ForwardArrow extends CharacterImage
{
    /**
     * Act - do whatever the ForwardArrow wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }

    public ForwardArrow(){
        GreenfootImage arrow = new GreenfootImage("arrow.PNG");
        arrow.scale(130,130);
        arrow.rotate(180);
        setImage(arrow);
    }
}
