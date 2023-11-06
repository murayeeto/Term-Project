import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

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
        super(500, 510, 1); 
        spawn();
    }

    //creates objects in the world and sets their x and y values
    private void spawn() {
        PhoneScreen phone = new PhoneScreen();
        addObject(phone,255,240);
        StatScreenTitle statTitle = new StatScreenTitle();
        addObject(statTitle,255,125);
        BankAccount accountBalance = new BankAccount();
        addObject(accountBalance,290,210);
        Income userIncome = new Income();
        addObject(userIncome,290,280);
        CreditScore userScore = new CreditScore(); 
        addObject(userScore,290,350);
    }
    //spawns the objects if there is less than one object.
    public void act(){
        if (numberOfObjects()<1){
            spawn();
        }
    }
}
