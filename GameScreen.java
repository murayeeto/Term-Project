import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
import java.util.ArrayList;
import java.io.IOException;

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
    public ProjectComm comm;
    private Income income;

    public GameScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        player = new Character();
            /**
        try{
            comm = new ProjectComm("minecrafters");
        } catch (IOException ioe){
            System.out.println(ioe);
        }
             */
        income = new Income();
        setBackground("images/Backgrounds/citypopup.png");
        addObject(new MenuIcon(),560,30);
        addObject(player, 590,30);
        //addObject(new ContinueArrow(),545,365);
        addObject(new CharacterIcon(player, this),25,30);
        addObject(new AgeButton(player, this), 500, 325);
        player.setMoney(income.getIncome()*1.00);
    }

    public GameScreen(Character player)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        this.player = player;
          /**
        try{
            comm = new ProjectComm("minecrafters");
        } catch (IOException ioe){
            System.out.println(ioe);
        }
             */
        setBackground("images/Backgrounds/citypopup.png");
        addObject(new MenuIcon(),560,30);
        addObject(player, 590,30);
        addObject(new CharacterIcon(player, this),25,30);
        addObject(new AgeButton(player, this), 500, 300);
    }

    //handlers
    public void handleMoneyEvent(int eventnumber) {
        MoneyEvent MoneyEvent = new MoneyEvent(eventnumber);
        BankAccount bankaccount = player.getBankAccount();
        bankaccount.setBalance(MoneyEvent.getEventMoney() + player.getBalance());
        player.setCredit(player.getCredit() + MoneyEvent.getEventCredit());
            /**
        try{
            if (mapScoreToAngle(player.getCredit()) > 90.0){
                 System.out.println(comm.sendCommand(String.valueOf(mapScoreToAngle(90.0))));
            } else if (mapScoreToAngle(player.getCredit()) < -90.0){
                System.out.println(comm.sendCommand(String.valueOf(mapScoreToAngle(-90.0))));
            } else {
                System.out.println(comm.sendCommand(String.valueOf(mapScoreToAngle(player.getCredit()))));
            }

        } catch (IOException ioe){
            System.out.println(ioe);
        }
             */
        if (eventnumber == 40){
            income.setIncome(income.getIncome()+5000);
        }
        
        switch (eventnumber) {
            case 0:
                displayChoices(eventnumber);
                break;
            case 4:
                displayChoices(eventnumber);
                break;
            case 20:
                displayChoices(eventnumber);
                break;
            case 22:
                displayChoices(eventnumber);
                break;
            case 25:
                displayChoices(eventnumber);
                break;    
            case 29:
                displayChoices(eventnumber);
                break;
            case 30:
                displayChoices(eventnumber);
                break;
            case 31:
                displayChoices(eventnumber);
                break;
            case 32:
                displayChoices(eventnumber);
                break;
                // Add more cases for more events/choices 
        }

        String Description = MoneyEvent.getDescription();
        // Add the Event to the world
        addObject(MoneyEvent, 100, 100);
        
        // Add the event to the history list.
        displayEvent(Description);
        eventHistory.add(MoneyEvent);

        // Remove the Event from the world.
        removeObject(MoneyEvent);
        //displayEventHistory();
    }

    public void displayEvent(String eventDescription) {
        TextOverlay eventText = new TextOverlay(eventDescription);
        addObject(eventText, getWidth() / 2, getHeight() / 2);
    }

    //choice handler
    public void handleChoice(Choice choice) {
        //Calls the event based on the choice
        removeTextOverlays();
        removeChoiceButton();
        switch (choice.getEventNumber()) {
            case 1:
                handleMoneyEvent(37);
                break;
            case 2:
                handleMoneyEvent(34);
                break;
            case 3:
                handleMoneyEvent(40);
                break;
            case 4:
                handleMoneyEvent(33);
                break;
            case 5:
                handleMoneyEvent(35);
                break;
            case 6:
                handleMoneyEvent(36);
                break;
            case 7:
                handleMoneyEvent(38);
                break;
            case 8:
                handleMoneyEvent(39);
                break;
            case 9:
                handleMoneyEvent(41);
                break;
            case 10:
                handleMoneyEvent(42);
                break;
            case 11:
                handleMoneyEvent(43);
                break;
            case 12:
                handleMoneyEvent(44);
                break;
            case 13:
                handleMoneyEvent(45);
                break;
            case 14:
                handleMoneyEvent(46);
                break;
            case 15:
                handleMoneyEvent(49);
                break;
            case 16:
                handleMoneyEvent(50);
                break;
            case 19:
                handleMoneyEvent(47);
                break;
            case 20:
                handleMoneyEvent(48);
                break;
            // Add more cases for more events/choices 
        }
    }

    private void displayChoices(int eventNumber) {
        int y = 300;
        int x =  (getWidth() / 2) - 50;
        choices.clear(); // Clear existing choices

        // Generate choices based on the event number
        switch (eventNumber){
            case 29:
                choices.add(new Choice("Pay it", 1));
                choices.add(new Choice("Not yet", 2));
                break;
            case 30:
                choices.add(new Choice("Take the job", 3));
                choices.add(new Choice("Don't take it", 4));
                break;
            case 31:
                choices.add(new Choice("Consult", 5));
                choices.add(new Choice("Don't consult", 6));
                break;
            case 32:
                choices.add(new Choice("Attend", 7));
                choices.add(new Choice("Stay home", 8));
                break;
                
            case 0:
                choices.add(new Choice("Invest/Save", 9));
                choices.add(new Choice("Buy a New Car", 10));
                break;
            case 4:
                choices.add(new Choice("Relocate", 11));
                choices.add(new Choice("Stay", 12));
                break;
            case 20:
                choices.add(new Choice("Use credit", 13));
                choices.add(new Choice("Don't use credit", 14));
                break;
            case 22:
                choices.add(new Choice("Get a loan", 15));
                choices.add(new Choice("Wait/Find cheaper", 16));
                break;
            case 25:
                choices.add(new Choice("Keep it", 19));
                choices.add(new Choice("Sell it", 20));
                break;
        }

        // Display the choices
        for (Choice choice : choices) {
            ChoiceButton choiceButton = new ChoiceButton(choice, this);
            addObject(choiceButton, x, y);
            x += 120; // Change the value to adjust spacing
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


        Greenfoot.delay(150);
        //removeObjects(textOverlays);
    }
    
    //getter for the player
    public Character getPlayer() {
        List<Character> Player = getObjects(Character.class);

        if (!Player.isEmpty()) {
            return Player.get(0);
        } else {
            return null;
        }
    }
    
    //remover methods for all the events/choices because its insanely quicker to do that here
    public void removeTextOverlays() {
        List<TextOverlay> textOverlays = getObjects(TextOverlay.class);
        removeObjects(textOverlays);
    }
    
    public void removeChoiceButton() {
            List<ChoiceButton> choiceButtons = getObjects(ChoiceButton.class);
            removeObjects(choiceButtons);
    }
    
    //artifact stuff
    private static double mapScoreToAngle(double score) {
            double minScore = 300;
            double maxScore = 850;
            double minAngle = -90;
            double maxAngle = 90;
    
            double slope = (maxAngle - minAngle) / (maxScore - minScore);
            double intercept = minAngle - slope * minScore;
            double mappedAngle = slope * score + intercept;
    
            return mappedAngle;
    }
}

