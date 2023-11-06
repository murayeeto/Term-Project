import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CharacterIcon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class CharacterIcon extends Actor
{
    /**
     * Act - do whatever the PreviousArrow wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public CharacterIcon(){
        GreenfootImage image = CharacterImage.getCharacter();
        setImage(image);
        getImage().scale(50,50);
    }
}
