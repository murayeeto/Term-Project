import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HelpScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HelpScreen extends World
{

    /**
     * Constructor for objects of class HelpScreen.
     * 
     */
    public HelpScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        setBackground("images/Backgrounds/citypopup.png");
        addObject(new HowToPlay(),300,40);
        addObject(new PreviousArrow(),45,365);
        //The coordinate object. Remove when its no longer needed.
        addObject(new Coordinate(), 450,300);
        displayHelpMessage();
        PreviousArrow nextScreen = new PreviousArrow();
        addObject(nextScreen, 545, 365);
        addObject(new ContinueArrow(),45,365);
    }

    private void displayHelpMessage() {
        String helpMessage = "Hello! Welcome to the wonderful world of CreditLife.\n This Game is quite simple\n but it can be tough for newcomers.\n The goal is to finish your life with as much money \nand as good of credit as you possibly can. \n you can achieve this by making choices, \nand getting random events \nby clicking the plus button";
        TextOverlay helpText = new TextOverlay(helpMessage);
        addObject(helpText, getWidth() / 2, getHeight() / 2);
    }
    
}
