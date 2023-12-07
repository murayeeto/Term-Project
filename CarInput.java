import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class CarInput here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CarInput extends Inputs 
{
    private static GreenfootImage image;
    private static String car = "";
    
    public void act()
    {
        if (Greenfoot.mouseClicked(this)){
            car = Greenfoot.ask("What car do you pick? Input a number: 1, 2, 3, or 4!");
            
            int num = CreditScore.scoreNumber;
            
            if(getCar().equals("1")){
                CreditScore.setCreditScore(num - 20);
            }
            else if(getCar().equals("2")){
                CreditScore.setCreditScore(num - 15);
            }
            else if(getCar().equals("3")){
                CreditScore.setCreditScore(num - 10);
            }
            else if(getCar().equals("4")){
                
            }
            else{
                car = Greenfoot.ask("Please enter a valid house number! 1, 2, 3, or 4 please!");
            }
            
            image.clear();
            
            //Must redraw the image in case the user types something in more than once.
            
            image.drawRect(0,0,170,27);
            image.drawImage(new GreenfootImage(car,22, Color.BLACK, new Color(0, 0, 0, 0)),5,3);
            setImage(image);
        }
    }
    
    public CarInput(){
        image = new GreenfootImage(171,30);
        image.drawRect(0,0,170,27);
        setImage(image);
    }
    
    public static String getCar(){
        return car;
    }
}
