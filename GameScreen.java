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
    private List<Choice> choices = new ArrayList<>();
    public static Character player;

    public GameScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        player = new Character();
        setBackground("images/Backgrounds/citypopup.png");
        addObject(new MenuIcon(),560,30);
        addObject(player, 590,30);
        addObject(new CharacterIcon(player, this),25,30);
        addObject(new AgeButton(player, this), 500, 300);
        if (player.getBalance() == 100){
            handleMoneyEvent(3);
            displayChoices(1); 
        }
        displayEventHistory();
    }

    public GameScreen(Character player)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        this.player = player;
        setBackground("images/Backgrounds/citypopup.png");
        addObject(new MenuIcon(),560,30);
        addObject(player, 590,30);
        addObject(new CharacterIcon(player, this),25,30);
        addObject(new AgeButton(player, this), 500, 300);
        if (player.getBalance() == 100){
            handleMoneyEvent(3);
            displayChoices(1);
        }
        displayEventHistory();
    }

    //handlers
    public void handleMoneyEvent(int eventnumber) {
        MoneyEvent MoneyEvent = new MoneyEvent(eventnumber);
        BankAccount bankaccount = player.getBankAccount();
        bankaccount.setBalance(MoneyEvent.getEventMoney() + player.getBalance());
        player.setCredit(player.getCredit() + MoneyEvent.getEventCredit());
        String Description = MoneyEvent.getDescription();
        // Add the Event to the world
        addObject(MoneyEvent, 100, 100);
        
        // Add the event to the history list.
        displayEvent(Description);
        eventHistory.add(MoneyEvent);
        Greenfoot.delay(100);

        // Remove the Event from the world.
        removeObject(MoneyEvent);

    }

    public void displayEvent(String eventDescription) {
        TextOverlay eventText = new TextOverlay(eventDescription);
        addObject(eventText, getWidth() / 2, getHeight() / 2);

        Greenfoot.delay(100);

        removeObject(eventText);
    }

    //choice handler
    public void handleChoice(Choice choice) {
        //Calls the event based on the choice
        switch (choice.getEventNumber()) {
            case 1:
                handleMoneyEvent(1);
                break;
            case 2:
                handleMoneyEvent(2);
                break;
                // Add more cases for more events/choices 
        }
    }

    private void displayChoices(int eventNumber) {
        int y = 300;
        choices.clear(); // Clear existing choices

        // Generate choices based on the event number
        switch (eventNumber) {
            case 1:
                choices.add(new Choice("Choice", 1));
                choices.add(new Choice("Other Choice", 2));
                break;
            case 2:
                choices.add(new Choice("Choice X", 3));
                choices.add(new Choice("Choice Y", 4));
                break;
            case 3:
                choices.add(new Choice("Option 1", 5));
                choices.add(new Choice("Option 2", 6));
                break;
        }

        // Display the choices
        for (Choice choice : choices) {
            ChoiceButton choiceButton = new ChoiceButton(choice, this);
            addObject(choiceButton, getWidth() / 2, y);
            y += 30; // Change the value to adjust spacing
        }
    }

    //choice class, basically anything that isn't the choice handler
    public class Choice {
        private String description;
        private int eventNumber;

        public Choice(String description, int eventNumber) {
            this.description = description;
            this.eventNumber = eventNumber;
        }

        public String getDescription() {
            return description;
        }

        public int getEventNumber() {
            return eventNumber;
        }
    }

    //Event history viewing
    public void displayEventHistory() {

        int y = getHeight() / 2 - 30 * Math.min(eventHistory.size(), 2);


        List<TextOverlay> textOverlays = new ArrayList<>();

        for (int i = Math.max(0, eventHistory.size() - 2); i < eventHistory.size(); i++) {
            Event event = eventHistory.get(i);
            String description = event.getDescription();
            TextOverlay eventText = new TextOverlay(description);
            addObject(eventText, getWidth() / 2, y);
            textOverlays.add(eventText);
            y += 50; // Spacing Adjuster
        }


        Greenfoot.delay(300);
        removeObjects(textOverlays);
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
