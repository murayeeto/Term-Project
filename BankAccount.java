import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class AccountBalance here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BankAccount extends Actor
{

    private GreenfootImage bankaccountImage;
    private static int balance;
    // dont really need number

    /**
     * Act - do whatever the CreditScore wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    // creates a bank account image with a balance of 0
    public BankAccount(){
<<<<<<< HEAD
        this.balance = balance;
=======
        balance = 0;
>>>>>>> parent of 66a1202 (Merge pull request #10 from murayeeto/teyonna-tasks)
        Font font = new Font(true, false, 20);
        bankaccountImage = new GreenfootImage(250, 50);
        bankaccountImage.setColor(Color.BLACK);
        bankaccountImage.setFont(font);
        bankaccountImage.drawString("Account Balance: \n      $"+balance, 0, 20);
        setImage(bankaccountImage);
    }
    
    public BankAccount(int balance){
        this.balance = balance;
        Font font = new Font(true, false, 20);
        bankaccountImage = new GreenfootImage(250, 50);
        bankaccountImage.setColor(Color.BLACK);
        bankaccountImage.setFont(font);
        bankaccountImage.drawString("Account Balance: \n      $"+balance, 0, 20);
        setImage(bankaccountImage);
    }

    public static void setBalance(int amount){
        balance = amount;
    }
    
    // updates bank account image
    public void act()
    {
<<<<<<< HEAD
        setBalance(this.balance);
=======
>>>>>>> parent of 66a1202 (Merge pull request #10 from murayeeto/teyonna-tasks)
        bankaccountImage.setColor(Color.BLACK);
        bankaccountImage.clear();
<<<<<<< HEAD
        bankaccountImage.drawString("Account Balance: \n      $"+balance, 0, 20);
        setImage(bankaccountImage);   
    }
    
    /*public void updateBalance(){
        this.balance = balance+character.getMoney();
        
        bankaccountImage.clear();
        setImage(bankaccountImage);
    }*/
    /*public void updateBalance(){
        setBalance(character.getMoney());
        
        bankaccountImage.clear();
        bankaccountImage.drawString("Account Balance: \n          $"+ getBalance(), 0, 20);
        setImage(bankaccountImage);
    }*/
    /*
    public void decreaseBalance(double amount){
        this.balance = balance - amount;
=======
        bankaccountImage.drawString("Account Balance: \n          $"+balance, 0, 20);
        setImage(bankaccountImage);   
    }
    
    public void increaseBalance(int amount){
        this.balance = this.balance + amount;
>>>>>>> parent of 66a1202 (Merge pull request #10 from murayeeto/teyonna-tasks)
        
        bankaccountImage.clear();
        bankaccountImage.drawString("Account Balance: \n      $"+ this.balance, 0, 20);
        setImage(bankaccountImage);
    }
    
    public void decreaseBalance(int amount){
        this.balance = this.balance - amount;
        
        bankaccountImage.clear();
        bankaccountImage.drawString("Account Balance: \n          $"+ this.balance, 0, 20);
        setImage(bankaccountImage);
    }
}

