import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ContinueArrow here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ContinueArrow extends Actor
{
    /**
     * Act - do whatever the ContinueArrow wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(new TitleScreen());
        }
    }
    
    public ContinueArrow(){
        setImage("images/icons/cont_prevArrow.PNG");
        getImage().scale(80,50);
    }
}
