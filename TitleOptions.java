import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class NewGame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TitleOptions extends Actor
{
    /**
     * Act - do whatever the NewGame wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    //Makes the text change color when the mouse hovers over it
    //All the subclasses inherits textEffect
    
    public void textEffect(String text, int size){
        MouseInfo mouse = Greenfoot.getMouseInfo();
        if (Greenfoot.mouseMoved(this)){
            setImage(new GreenfootImage(text,size, Color.YELLOW, new Color(0, 0, 0, 0)));
        }
        if (Greenfoot.mouseMoved(null) && !Greenfoot.mouseMoved(this)){
            setImage(new GreenfootImage(text,size, getColor(), new Color(0, 0, 0, 0)));
        }
    }
    
    //Getter method for the text color. Changing this will change the color for all text
    
    public static Color getColor(){ 
        return new Color(13,73,96);
    }
}
