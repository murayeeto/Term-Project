import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PreviousArrow here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ContinueArrow extends Actor
{
    /**
     * Act - do whatever the PreviousArrow wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    public void act()
    {
        new TitleOptions().textEffect("START",28);
        boolean clicked = Greenfoot.mouseClicked(this);
        if (clicked){
            if (getWorld() instanceof CharacterScreen){
                if (NameInput.getName() == "" || CareerInput.getCareer() == ""){
                    if (NameInput.getName() == ""){
                        NameInput.noName = true; 
                    }
                    if (CareerInput.getCareer() == ""){
                        CareerInput.noCareer = true;
                    } 
                } else {
                    CharacterImage.saveCharacter();
                    NameInput.saveName();
                    CareerInput.saveCareer();
                    Greenfoot.setWorld(new GameScreen());
                }
            } else if (getWorld() instanceof EndScreen && !(getWorld() instanceof AdviceScreen)){
                Greenfoot.setWorld(new AdviceScreen());
            } else {
                Greenfoot.setWorld(new TitleScreen());
            }
        }
    }

    public ContinueArrow(){
        setImage("images/icons/cont_prevArrow.PNG");
        getImage().mirrorHorizontally();
        getImage().scale(80,50);
    }
}
