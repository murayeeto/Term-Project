import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Continuee here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Continue extends TitleOptions
{
    /**
     * Act - do whatever the Continuee wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        textEffect("CONTINUE",28);
        boolean clicked = Greenfoot.mouseClicked(this);
        if (clicked){
            CharacterImage.loadCharacter();
            NameInput.loadName();
            CareerInput.loadCareer();
            // Event.loadEvent();
            if (NameInput.getName()!= null && NameInput.getName()!= "" 
            && CareerInput.getCareer()!= null && CareerInput.getCareer()!= "" && CharacterImage.getCharacter()!= null){
                Greenfoot.setWorld(new GameScreen());
            }
        }
    }
    
    //Adds text "CONTINUE" w font size 28. Color(0,0,0,0) means transparent background
    
    public Continue(){
        setImage(new GreenfootImage("CONTINUE",28, getColor(), new Color(0, 0, 0, 0)));
    } 
}
