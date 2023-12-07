import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class HouseInput here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HouseInput extends Inputs 
{
    private static GreenfootImage image;
    private static String house = "";
    
    public void act()
    {
        if (Greenfoot.mouseClicked(this)){
            house = Greenfoot.ask("What house do you pick? Input a number: 1, 2, 3, or 4!");
            
            int num = CreditScore.scoreNumber;
            
            if(getHouse().equals("1")){
                CreditScore.setCreditScore(num - 30);
            }
            else if(getHouse().equals("2")){
                CreditScore.setCreditScore(num - 40);
            }
            else if(getHouse().equals("3")){
                CreditScore.setCreditScore(num - 15);
            }
            else if(getHouse().equals("4")){
                CreditScore.setCreditScore(num - 20);
            }
            else{
                house = Greenfoot.ask("Please enter a valid house number! 1, 2, 3, or 4 please!");
            }
            
            image.clear();
            
            //Must redraw the image in case the user types something in more than once.
            
            image.drawRect(0,0,170,27);
            image.drawImage(new GreenfootImage(house,22, Color.BLACK, new Color(0, 0, 0, 0)),5,3);
            setImage(image);
        }
    }
    
    public HouseInput(){
        image = new GreenfootImage(171,30);
        image.drawRect(0,0,170,27);
        setImage(image);
    }
    
    public static String getHouse(){
        return house;
    }
}
