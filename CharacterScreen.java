import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CharacterScreen extends World
{

    /**
     * Constructor for objects of class Level1.
     * 
     */
    public CharacterScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        setBackground("Backgrounds/citypopup.png");
        addObject(new CreateYourCharacter(),300,40);
        addObject(new CharacterImage(),455,210);
        addObject(new Name(),83,130);
        addObject(new NameInput(),226,132);
        addObject(new Job(),83,185);
        addObject(new JobInput(),226,185);
        addObject(new Appearance(),125,246);
        addObject(new Appearance1(),235,248);
        addObject(new Appearance2(),287,248);
        addObject(new Skin(),180,308);
        addObject(new BackArrow(),110,296);
        addObject(new ForwardArrow(),253,318);
        
        addObject(new Coordinate(), 300,300);
    }
}
