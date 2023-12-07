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
    public static int scoreNumber;
    //private Character character;
    //private int current_score = character.getCredit();
    
    /**
     * Act - do whatever the CreditScore wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    //creates credit score image with a value of 300
    public CreditScore(int scoreNumber){
        setScoreNumber(300);
        Font font = new Font(true, false, 20);
        creditscoreImage = new GreenfootImage(250, 50);
        creditscoreImage.setColor(getColor());
        creditscoreImage.setFont(font);
        creditscoreImage.drawString("Credit Score: \n      "+scoreNumber, 0, 20);
        setImage(creditscoreImage);
    }
    
    /*public CreditScore(int scoreNumber)
    {
      setScoreNumber(scoreNumber);  
    }*/
    /*
    public CreditScore(CreditScore userCredit){
        scoreNumber = userCredit.scoreNumber;
    }*/
    
    //updates new credit score image with a new score
    //updates the font color to the value in the getColor method
    public void act()
    {
        //new CreditScore();
        creditscoreImage.setColor( getColor() );
        creditscoreImage.clear();
        creditscoreImage.drawString("Credit Score: \n      "+ scoreNumber, 0, 20);
        setImage(creditscoreImage);
         
    }
    
    public static void setCreditScore(int amount){
        scoreNumber = amount;
    }
    
    // method that returns a color based on the scoreNumber value
    private Color getColor(){
        if (scoreNumber <= 629){
            return Color.RED;    
        }
        else if (scoreNumber >= 630 && scoreNumber<=689){
            return Color.ORANGE;
        }
        else if (scoreNumber >= 690 && scoreNumber<=719){
            return Color.YELLOW;
        }
        return Color.GREEN;
    }
    
    /*public void increaseScoreNumber(int amount){
        this.scoreNumber = this.scoreNumber + amount;
        
        creditscoreImage.clear();
        creditscoreImage.drawString("Credit Score: \n      "+ this.scoreNumber, 0, 20);
        setImage(creditscoreImage);
    }
    
    
    public void decreaseScoreNumber(int amount){
        this.scoreNumber = this.scoreNumber - amount;
        
        creditscoreImage.clear();
        creditscoreImage.drawString("Credit Score: \n      "+ this.scoreNumber, 0, 20);
        setImage(creditscoreImage);
    }*/
    public int getScoreNumber(){
        return scoreNumber;
    }
    
    public void setScoreNumber(int scoreNumber){
        this.scoreNumber = scoreNumber;
    }
    
}