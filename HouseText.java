import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class HouseText here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HouseText extends Actor 
{
    private GreenfootImage houseTextImage;
    
    public static String word1;

    /**
     * Constructor for objects of class HouseText
     */
    public HouseText()
    {
        //setImage(new GreenfootImage("START",28, getColor(), new Color(0, 0, 0, 0)));
        Font font = new Font(true, false, 20);
        houseTextImage = new GreenfootImage(250, 50);
        houseTextImage.setColor(Color.BLACK);
        houseTextImage.setFont(font);
        houseTextImage.drawString("House 1", 0, 20);
        setImage(houseTextImage);
    }
    
    public HouseText(String word)
    {
        this.word1 = word;
        Font font = new Font(true, false, 20);
        houseTextImage = new GreenfootImage(250, 50);
        houseTextImage.setColor(Color.BLACK);
        houseTextImage.setFont(font);
        houseTextImage.drawString(word, 0, 20);
        setImage(houseTextImage);
    }
    
    public void act(){
       
    }
}
