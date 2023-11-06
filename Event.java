import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Event here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Event extends Actor{
    private String Description;
    private double MoneyImpact;
    private int HappinessImpact;
    private int CreditImpact;

    public Event(String Description, double MoneyImpact, int HappinessImpact, int CreditImpact) {
        this.Description = Description;
        this.MoneyImpact = MoneyImpact;
        this.HappinessImpact = HappinessImpact;
        this.CreditImpact = CreditImpact;

    }
    
    public String getDescription(){
        return Description;
    }

    public void act() {
        Character Player = ((GameScreen)getWorld()).getPlayer(); 

        Player.setMoney(Player.getMoney() + HappinessImpact);
        Player.setHappiness(Player.getHappiness() + HappinessImpact);
        Player.setCredit(Player.getCredit() + CreditImpact);
        // You can put other specific stuff here like ifs and logic
    }
}

