import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MoneyEvent here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MoneyEvent extends Event
{
    public MoneyEvent(int choice) {
        super("You invested in some sort of stock", 10.00, 0);
        switch(choice){
            case 0:
                setDescription("use getDescription() to retrieve whatevre the constructors message is or just set it to something new with the setter method" + "10.00$"); 
                break;
            case 1:
                setDescription("You got paid \nBalance: +$1523.67"); 
                setEventMoney(1523.67);
                setEventCredit(0);
                break;
            case 2:
                setDescription("You were approved for a car loan\n Credit Score:-30");
                setEventMoney(0);
                setEventCredit(-30);
            case 3:
                setDescription("You got a bonus\nBalance: +$1000 "); 
                setEventMoney(1000);
                setEventCredit(0);
                break;
            case 4:
                setDescription("You receive interest\nBalance: +$5 "); 
                setEventMoney(5);
                setEventCredit(0);
                break;
            case 5:
                setDescription("You got a loan for college\n Credit Score:-25 "); 
                setEventMoney(0);
                setEventCredit(-25);
                break;
            case 6:
                setDescription("You had a medical expense\n Balance: -$400 "); 
                setEventMoney(400);
                setEventCredit(0);
                break;
            case 7:
                setDescription("You missed work\n Balance: +$1200.98 "); 
                setEventMoney(1200.98);
                setEventCredit(0);
                break;
            case 8:
                setDescription("You paid car insurance\n Balance: -$50.32 "); 
                setEventMoney(-50.32);
                setEventCredit(0);
                break;
            case 9:
                setDescription("You paid health insurance\n Balance:-$125.25 "); 
                setEventMoney(-125.25);
                setEventCredit(0);
                break;
            case 10:
                setDescription("You got a credit card\n Credit Score:-20"); 
                setEventMoney(0);
                setEventCredit(-20);
                break;
            case 11:
                setDescription("You paid your credit card balance\n Credit Score:+20 "); 
                setEventMoney(0);
                setEventCredit(20);
                break;
            case 12:
                setDescription("You have not missed any payments\n Credit Score:+5 "); 
                setEventMoney(0);
                setEventCredit(15);
                break;
            case 13:
                setDescription("You made a lump sum payment on your loan\n Credit Score:+10 "); 
                setEventMoney(0);
                setEventCredit(40);
                break;
            case 14:
                setDescription("You became an authorized user on a credit card\n Credit Score:+12 "); 
                setEventMoney(0);
                setEventCredit(20);
                break;
            case 15:
                setDescription("Your credit limit increased \n Credit Score:+20 "); 
                setEventMoney(0);
                setEventCredit(20);
                break;
            case 16:
                setDescription("You missed a car payment \n Credit Score:-30 "); 
                setEventMoney(0);
                setEventCredit(-20);
                break;
            case 17:
                setDescription("You missed a credit card Payment \n Credit Score:-20 "); 
                setEventMoney(0);
                setEventCredit(-20);
                break;
            case 18:
                setDescription("You missed your rent payment \n Credit Score:-20 "); 
                setEventMoney(0);
                setEventCredit(-20);
                break;
        }
    }

    public void act() {
        super.act(); // Call the parent class's act method to update the character's attributes.
    }
}