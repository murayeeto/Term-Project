import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Textbox here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NameInput extends Inputs
{
    
    //The rectangle object for inputing the name. Use the getter method below to implement the name into the gameplay.
    
    private static GreenfootImage image;
    private static String name = "";
    
    public void act()
    {
        if (Greenfoot.mouseClicked(this)){
            name = Greenfoot.ask("What's your name?");
            if (name.length()>14){
                name = name.substring(0,14); //character limit of 14
            }
            image.clear();
            image.drawRect(0,0,170,27);
            image.drawImage(new GreenfootImage(name,22, Color.BLACK, new Color(0, 0, 0, 0)),5,3);
            setImage(image);
        }
    }
    
    public NameInput(){
        image = new GreenfootImage(173,30);
        image.drawRect(0,0,170,27);
        setImage(image);
    }
    
    public String getName(){
        return name;
    }
}
