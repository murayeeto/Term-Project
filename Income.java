import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Income here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Income extends Actor
{

    private GreenfootImage incomeImage;
    private int income;

    /**
     * Act - do whatever the CreditScore wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    //creates an income image with an initial value of 0
    public Income(){
        income = 0;
        Font font = new Font(true, false, 20);
        incomeImage = new GreenfootImage(250, 50);
        incomeImage.setColor(Color.BLACK);
        incomeImage.setFont(font);
        incomeImage.drawString("Income: \n    $"+ income, 0, 20);
        setImage(incomeImage);
    }

    //updates income image
    public void act()
    {
        incomeImage.setColor(Color.BLACK);
        incomeImage.clear();
        incomeImage.drawString("Income: \n    $"+ income, 0, 20);
        setImage(incomeImage); 
    }
    
    public void increaseIncome(int amount){
        this.income = this.income + amount;
        
        incomeImage.clear();
        incomeImage.drawString("Income: \n    $"+ this.income, 0, 20);
        setImage(incomeImage); 
    }
    
    
    public void decreaseIncome(int amount){
        this.income = this.income - amount;
        
        incomeImage.clear();
        incomeImage.drawString("Income: \n    $"+ this.income, 0, 20);
        setImage(incomeImage);
    }
}

