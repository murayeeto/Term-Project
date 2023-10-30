import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CharacterImage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CharacterImage extends Actor
{
    /**
     * Act - do whatever the CharacterImage wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */ 
    
    public void act()
    {
        
    }   
    public CharacterImage()
    {
        GreenfootImage image = (new GreenfootImage("Fskin1.png"));
        image.scale(216, 200);
        setImage(image);
    }

}
