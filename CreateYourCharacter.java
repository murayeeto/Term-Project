import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CreateYourCharacterr here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CreateYourCharacter extends CharacterOptions
{
    /**
     * Act - do whatever the CreateYourCharacterr wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        
    }
    
    //Adds text "Appearance" w font size 30. Color(0,0,0,0) means transparent background
    
    public CreateYourCharacter()
    {
        setImage(new GreenfootImage("CREATE YOUR CHARACTER",30, TitleOptions.getColor(), new Color(0, 0, 0, 0)));
    }
}
