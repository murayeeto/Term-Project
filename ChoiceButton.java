import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

/**
 * Write a description of class ChoiceButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class ChoiceButton extends Actor {

    private GameScreen.Choice choice;
    private GameScreen world;

    public ChoiceButton(GameScreen.Choice choice, GameScreen world) {
        this.choice = choice;
        this.world = world;
        setImage(new GreenfootImage(choice.getDescription(), 20, Color.BLACK, null));
    }

    public void act() {
        if (Greenfoot.mouseClicked(this)) {
            world.handleChoice(choice);

        }
    }
}
