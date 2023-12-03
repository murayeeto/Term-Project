import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import greenfoot.GreenfootImage;

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    //creates a new world that uses the spawn method
    public MyWorld()
    {    
        // Create a new world with 500x510 cells with a cell size of 1x1 pixels.
        //super(500, 510, 1); 
        super(600, 400, 1); 
        setBackground("images/Backgrounds/cityandtown.PNG");
        spawn();
        
    }

    //creates objects in the world and sets their x and y values
    private void spawn() {
        PhoneScreen phone = new PhoneScreen();
        addObject(phone,310,195);
        StatScreenTitle statTitle = new StatScreenTitle();
        addObject(statTitle,310,70);
        BankAccount accountBalance = new BankAccount();
        addObject(accountBalance,350,140); 
        //accountBalance.increaseBalance(500000);
        Income userIncome = new Income();
        addObject(userIncome,390,220);
        CreditScore userScore = new CreditScore(0); 
        addObject(userScore,370,300);
        
        ContinueArrow goBack = new ContinueArrow();
        goBack.setImage("images/icons/cont_prevArrow.PNG");
        goBack.getImage().scale(80,50);
        addObject(goBack, 50, 50);
        
        if (Greenfoot.mouseClicked(goBack)){
            Greenfoot.setWorld(new GameScreen());
        }
        
    }
    //spawns the objects if there is less than one object.
    public void act(){
        if (numberOfObjects()<1){
            spawn();
        }
        
    }
}
