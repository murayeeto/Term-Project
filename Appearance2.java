import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Appearance2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Appearance2 extends CharacterImage
{
    /**
     * Act - do whatever the Appearance2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private CharacterImage characterImage;
    
    public void act()
    {
    
    }
    
    
    public Appearance2(){
        GreenfootImage image = new GreenfootImage("appear2.jpg");
        image.scale(30,30);
        setImage(image);
    }
}
