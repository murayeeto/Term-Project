import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MenuIcon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MenuIcon extends Actor
{
    /**
     * Act - do whatever the MenuIcon wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        boolean clicked = Greenfoot.mouseClicked(this);
        if (clicked){
            Greenfoot.setWorld(new TitleScreen());
        }
    }
    
    public MenuIcon(){
        setImage("images/icons/menu.png");
        getImage().scale(40,40);
    }
}
