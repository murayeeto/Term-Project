import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
import java.util.ArrayList;

/**
 * Write a description of class GameScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameScreen extends World
{

    /**
     * Constructor for objects of class GameScreen.
     * 
     */
    private List<Event> eventHistory = new ArrayList<>();
    public GameScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        setBackground("images/Backgrounds/citypopup.png");
        addObject(new CharacterIcon(),25,30);
        addObject(new MenuIcon(),560,30);
        addObject(new Character(), 590,30);
        if (getPlayer().getMoney() == 0){
            handleMoneyEvent(3);
        }
    }

    //handlers
    public void handleMoneyEvent(int eventnumber) {
        MoneyEvent MoneyEvent = new MoneyEvent(eventnumber);
        String Description = MoneyEvent.getDescription();
        // Add the Event to the world
        addObject(MoneyEvent, 100, 100);

        // Add the event to the history list.
        displayEvent(Description);
        eventHistory.add(MoneyEvent);
        Greenfoot.delay(100);

        // Remove the SchoolEvent from the world.
        removeObject(MoneyEvent);
        
    }

    public void displayEvent(String eventDescription) {
        TextOverlay eventText = new TextOverlay("");
        eventText.setText(eventDescription);
        addObject(eventText, getWidth() / 2, getHeight() / 2);
        

        //Greenfoot.delay(1000);
        
        //removeObject(eventText);
    }

    //Event history viewing
    public void displayEventHistory() {
        int y = 10; // Starting Y-coordinate for displaying events.
        for (Event event : eventHistory) {
            String Description = event.getDescription();
            displayEvent(Description);
            y += 30; // Spacing Adjuster
        }
    }
    
    //getter for the events
    public Character getPlayer() {
        // Get the player character (Person) from the world.
        List<Character> Player = getObjects(Character.class);
        
        if (!Player.isEmpty()) {
            return Player.get(0);
        } else {
            return null;
        }
    }
}
