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
        setBackground("images/Backgrounds/citypopup.png");
        addObject(new CreateYourCharacter(),300,40);
        addObject(new CharacterImage(),455,210);
        addObject(new Name(),83,130);
        addObject(new NameInput(),226,132);
        addObject(new Career(),87,184);
        addObject(new CareerInput(),226,185);
        addObject(new Appearance(),125,246);
        addObject(new Appearance1(),235,248);
        addObject(new Appearance2(),287,248);
        addObject(new Skin(),180,302);
        addObject(new BackArrow(),115,300);
        addObject(new ForwardArrow(),248,302);
        addObject(new ContinueArrow(),545,365);
        addObject(new PreviousArrow(),45,365);
        //The coordinate object. Remove when its no longer needed.
        //addObject(new Coordinate(), 300,300); 
    }
}
