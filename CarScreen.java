import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CarScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CarScreen extends World
{

    /**
     * Constructor for objects of class CarScreen.
     * 
     */
    
    private Character player;
    public CarScreen(Character player)
    {    
        super(600, 400, 1); 
        this.player = player;
        GreenfootImage carBG = new GreenfootImage("images/Backgrounds/carworldone.png");
        carBG.scale(600,400);
        setBackground(carBG);
        
        addObject(new CharacterIcon(player, new GameScreen(player)),25,30);
        addObject(new CarInput(), 370, 37);
        addObject(new HouseText("Car Choice:"), 250, 47);
        addObject(new PreviousArrow(), 545, 365);
        addObject(new ContinueArrow(),45,365);
    }
}
