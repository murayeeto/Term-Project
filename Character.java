import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Character here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Character extends Actor
{
    /**
     * Act - do whatever the Character wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int Age;
    private double StartingMoney = 0.0;
    private double Money;
    private int StartingCredit = 0;
    private int Credit;
    private int Happiness;
    // Constructor
    public Character() {
        Age = 18;
        Money = StartingMoney;
        Credit = StartingCredit;
        String name = NameInput.getName();
        String career = CareerInput.getCareer();
        Happiness = 10;

    }
    
    //getters :))
    public int getAge() {
        return Age;
    }

    public double getMoney() {
        return Money;
    }

    public int getCredit() {
        return Credit;
    }
    
    public int getHappiness() {
        return Happiness;
    }
    
    //setters
    public void setCredit(int Credit) {
        this.Credit = Credit;
    }

    public void setMoney(double Money) {
        this.Money = Money;
    }
    
    public void setAge(int Age) {
        this.Age = Age;
    }
    public void setHappiness(int Happiness) {
        this.Happiness = Happiness;
    }
}
