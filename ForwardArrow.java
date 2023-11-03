import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ForwardArrow here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ForwardArrow extends CharacterImage
{
    /**
     * Act - do whatever the ForwardArrow wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    //The forward arrow icon for skin
    
    public void act()
    {
        if (Greenfoot.mouseClicked(this)){
            index += 1;
            index = index%5; //Once we reach index 4 (darkest skin), clicking the arrow again (index=5) should make it start back with index 0 (lightest skin) 
        }
    }

    public ForwardArrow(){
        GreenfootImage arrow = new GreenfootImage("images/icons/arrow.PNG");
        arrow.scale(30,30);
        arrow.rotate(180);
        setImage(arrow);
    }
}
