import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import greenfoot.GreenfootImage;

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StatScreen extends World
{
    private Character player;
    private GameScreen world;
    //private BankAccount bankAccount;
    //private CreditScore userCredit;
    //private Income income;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    //creates a new world that uses the spawn method
    //Character character, BankAccount balance, CreditScore scoreNumber, Income income
    
    public StatScreen(Character player, GameScreen world)
    {    
        // Create a new world with 500x510 cells with a cell size of 1x1 pixels.
        //super(500, 510, 1); 
        
        super(600, 400, 1); 
        
        setBackground("images/Backgrounds/cityandtown.PNG");
        this.player = player;
        this.world = world;
        //this.bankAccount = bankAccount;
        //this.userCredit = userCredit;
        //this.income = income;
        spawn();
        
    }

    //creates objects in the world and sets their x and y values
    
    private void spawn() {
        PhoneScreen phone = new PhoneScreen();
        addObject(phone,310,195);
        StatScreenTitle statTitle = new StatScreenTitle();
        
        //addObject(statTitle,310,70);
        //addObject(bankAccount,350,140);
        //addObject(bankAccount(character.getMoney()),350,140);
        addObject(player.getBankAccount(),350,140);
        addObject(player.getUserScore(),370,300);
        
        Income income = new Income();
        addObject(income,390,220); 
        
        //addObject(userCredit,370,300);
        ContinueArrow goBack = new ContinueArrow(world, player);
        goBack.setImage("images/icons/cont_prevArrow.PNG");
        goBack.getImage().scale(80,50);
        addObject(goBack, 50, 50);
    }
    //spawns the objects if there is less than one object.
    public void act(){
        if (numberOfObjects()<1){
            spawn();
        }
        
    }
}
