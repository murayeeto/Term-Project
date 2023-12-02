import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;

/**
 * Write a description of class Balloon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Balloon extends Actor
{
    private Random rand = new Random();
    private int speed = rand.nextInt(3)+5;
    /**
     * Act - do whatever the Balloon wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setLocation(getX(),getY()-(speed));
        if (isAtEdge() && getY() < 300){
            getWorld().removeObject(this);
        }
    }
    
    public Balloon(){
        setImage(new GreenfootImage("images/icons/balloon.png"));
        getImage().scale(80,115);
    }
}
