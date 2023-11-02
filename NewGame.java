import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class NewGamee here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NewGame extends TitleOptions
{
    /**
     * Act - do whatever the NewGamee wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    //The text "NEW GAME"
    
    public void act(){
        textEffect("NEW GAME",30);
        boolean clicked = Greenfoot.mouseClicked(this);
        if (clicked){
            Greenfoot.setWorld(new CharacterScreen());
        }
    }

    public NewGame(){
        setImage(new GreenfootImage("NEW GAME",30, getColor(), new Color(0, 0, 0, 0)));
    }
}
