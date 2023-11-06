import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Start here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Start extends TitleOptions
{
    /**
     * Act - do whatever the Start wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        textEffect("START",28);
        boolean clicked = Greenfoot.mouseClicked(this);
        if (clicked){
            //Need to change the world to the actual game world
            Greenfoot.setWorld(new GameScreen());
        }
    }
    
    //Adds text "CONTINUE" w font size 28. Color(0,0,0,0) means transparent background
    
    public Start(){
        setImage(new GreenfootImage("START",28, getColor(), new Color(0, 0, 0, 0)));
    } 
}
