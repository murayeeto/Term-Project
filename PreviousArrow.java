import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PreviousArrow here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PreviousArrow extends Actor
{
    /**
     * Act - do whatever the PreviousArrow wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public PreviousArrow(){
        setImage("images/icons/cont_prevArrow.PNG");
        getImage().mirrorHorizontally();
        getImage().scale(80,50);
    }
}
