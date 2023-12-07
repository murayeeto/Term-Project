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
    //public double StartingMoney = 0.0;
    //public static double Money;
    public BankAccount bankAccount;
    private CreditScore userScore;
    private Income income;
    //public int StartingCredit = 300;
    //public static int Credit;
    //private BankAccount bankAccount;
    //private CreditScore userCredit;
    // Constructor
    public Character() {
        Age = 18;
        bankAccount = new BankAccount(100);
        userScore = new CreditScore(600);
        
        //Money = StartingMoney;
        //Credit = StartingCredit;
        String name = NameInput.getName();
        String career = CareerInput.getCareer();
        //bankAccount.setBalance(this.Money);
        //userCredit.setScoreNumber(this.Credit);

    }
    
    //getters :))
    public int getAge() {
        return Age;
    }

    public double getBalance() {
        return bankAccount.getBalance();
    }
    
    public BankAccount getBankAccount(){
        return bankAccount;
    }

    public int getCredit() {
        return userScore.getScoreNumber();
    }
    
    public CreditScore getUserScore(){
        return userScore;
    }
    //setters
    public void setCredit(int credit) {
        userScore.setScoreNumber(credit);
    }

    public void setMoney(double Money) {
        bankAccount.setBalance(Money);
    }
    
    public void setAge(int Age) {
        this.Age = Age;
    }
}
