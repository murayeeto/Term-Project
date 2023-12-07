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
        this.player = player;
        this.world = world;
        setImage(new GreenfootImage("Age Increase/\nNew Scenario", 20, Color.BLACK, null));
        

        // Generate a random integer
        
    }
    
    public void checkAgeEnding() {
        if (player.getAge()+1 > 100) {
            if (player.getBalance() >= 100000 || player.getCredit() > 400 ) {
                 Greenfoot.setWorld(new GoodEndScreen(player));
            } else {
                Greenfoot.setWorld(new BadEndScreen(player));    
            }
        }
    }
    public void act() {
        if (Greenfoot.mouseClicked(this)) {
            checkAgeEnding();
            int randomNumber = rand.nextInt(32);
            player.setAge(player.getAge() + 2);
            world.removeTextOverlays();
            world.handleMoneyEvent(randomNumber);
            
        }
    }
    public void clearEvents(){
       // Description.clear();
    }
}
