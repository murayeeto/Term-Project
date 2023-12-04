import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;

/**
 * Write a description of class AgeButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AgeButton extends Actor {
    private Character player;
    private int currentAge;
    private GameScreen world;
    public Random rand = new Random();
 
    
    public AgeButton(Character player, GameScreen world) {
        currentAge = player.getAge();
        this.player = player;
        this.world = world;
        setImage(new GreenfootImage("+", 20, Color.BLACK, null));
        

        // Generate a random integer
        
    }
    
    public void act() {
        if (Greenfoot.mouseClicked(this)) {
            int randomNumber = rand.nextInt(15);
            player.setAge(currentAge + 1);
            world.handleMoneyEvent(randomNumber);
            world.displayEventHistory();
        }
    }
}
