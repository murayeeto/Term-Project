import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Textbox here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NameInput extends Actor
{
    private static GreenfootImage canvas;
    private static String name;
    
    public void act()
    {
        // Add your action code here.
        if (Greenfoot.mouseClicked(this)){
            name = Greenfoot.ask("What's your name?");
            if (name.length()>14){
                name = name.substring(0,14);
            }
            canvas.clear();
            canvas.drawRect(0,0,173,30);
            canvas.drawImage(new GreenfootImage(name,22, Color.BLACK, new Color(0, 0, 0, 0)),4,4);
        }
    }
    
    public NameInput(){
        canvas = new GreenfootImage(173,30);
        canvas.drawRect(0,0,173,30);
        setImage(canvas);
    }
    
    public String getName(){
        return name;
    }
}
