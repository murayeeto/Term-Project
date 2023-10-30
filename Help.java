import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Quit here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Help extends TitleOptions
{
    /**
     * Act - do whatever the Quit wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        textEffect("HELP",28);
        boolean clicked = Greenfoot.mouseClicked(this);
        if (clicked){
            Greenfoot.setWorld(new HelpScreen());
        }
    }
    
    public Help(){
        setImage(new GreenfootImage("HELP",28, getColor(), new Color(0, 0, 0, 0)));
    }
}
