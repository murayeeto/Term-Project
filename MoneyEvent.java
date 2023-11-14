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
                setDescription("test 2 " + "+ 15.00$"); 
                setEventMoney(15.00);
                break;
            case 2:
                setDescription("test 3 " + "+ 30.00$" + "+ 20 to your credit score"); 
                setEventMoney(30.00);
                setEventCredit(10);
                break;
                
            case 3:
                setDescription("HELLO!!!! " + "+ 202103981298309123.00$" + "+ 20 to your credit score"); 
                setEventMoney(202103981298309123.00);
                setEventCredit(10);
                break;
        }
    }

    public void act() {
        super.act(); // Call the parent class's act method to update the character's attributes.
    }
}