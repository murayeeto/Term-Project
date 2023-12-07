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
    private int CreditImpact;
    
    public Event(String Description, double MoneyImpact, int CreditImpact) {
        this.Description = Description;
        this.MoneyImpact = MoneyImpact;
        this.CreditImpact = CreditImpact;
    }
    
    public String getDescription(){
        return Description;
    }
    
    
    public void setDescription(String Description){
        this.Description = Description;
    }
    
    public void setEventMoney(double MoneyImpact){
        this.MoneyImpact = MoneyImpact;
    }
    
    public double getEventMoney(){
        return MoneyImpact;
    }
    
    public void setEventCredit(int CreditImpact){
        this.CreditImpact = CreditImpact;
    }
    
    public int getEventCredit(){
        return CreditImpact;
    }

    public void act() {
        //BankAccount bankaccount = player.getBankAccount();

        //bankaccount.setBalance(player.getBalance() + MoneyImpact);
        //player.setCredit(player.getCredit() + CreditImpact);
        // You can put other specific stuff here like ifs and logic
        System.out.println("event ran");
    }
}

