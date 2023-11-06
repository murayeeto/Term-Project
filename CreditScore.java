import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CreditScore here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */


public class CreditScore extends Actor
{
    private GreenfootImage creditscoreImage;
    private int scoreNumber;
    
    /**
     * Act - do whatever the CreditScore wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    //creates credit score image with a value of 300
    public CreditScore(){
        scoreNumber = 300;
        Font font = new Font(true, false, 20);
        creditscoreImage = new GreenfootImage(250, 50);
        creditscoreImage.setColor(getColor());
        creditscoreImage.setFont(font);
        creditscoreImage.drawString("Credit Score: "+scoreNumber, 0, 20);
        setImage(creditscoreImage);
    }
    
    public CreditScore(int scoreNumber)
    {
      this.scoreNumber = scoreNumber;  
    }
    
    
    //updates new credit score image with a new score
    //updates the font color to the value in the getColor method
    public void act()
    {
        //new CreditScore();
        creditscoreImage.setColor(getColor());
        creditscoreImage.clear();
        creditscoreImage.drawString("Credit Score: "+scoreNumber, 0, 20);
        setImage(creditscoreImage);
         
    }
    
    // method that returns a color based on the scoreNumber value
    private Color getColor(){
        if (300<=scoreNumber && scoreNumber<=579){
            return Color.RED;    
        }
        else if (580<=scoreNumber && scoreNumber<=669){
            return Color.ORANGE;
        }
        else if (670<=scoreNumber && scoreNumber<=739){
            return Color.YELLOW;
        }
        else if (740<=scoreNumber && scoreNumber<=799){
            return Color.BLUE;
        }
        return Color.GREEN;
    }
    
    public void increaseScoreNumber(int amount){
        this.scoreNumber = this.scoreNumber + amount;
        
        creditscoreImage.clear();
        creditscoreImage.drawString("Credit Score: $"+ this.scoreNumber, 0, 20);
        setImage(creditscoreImage);
    }
    
    
    public void decreaseScoreNumber(int amount){
        this.scoreNumber = this.scoreNumber - amount;
        
        creditscoreImage.clear();
        creditscoreImage.drawString("Credit Score: $"+ this.scoreNumber, 0, 20);
        setImage(creditscoreImage);
    }
    
}