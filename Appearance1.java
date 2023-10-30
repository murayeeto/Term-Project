import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Female here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Appearance1 extends CharacterImage
{
    /**
     * Act - do whatever the Female wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {

    }
    
    public Appearance1(){
        GreenfootImage image = new GreenfootImage("icons/appear1.jpg");
        image.scale(30,30);
        setImage(image);
    }
}
