import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Arrow here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BackArrow extends CharacterImage
{
    /**
     * Act - do whatever the Arrow wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    //The back arrow icon for skin
    
    public void act()
    {
        if (Greenfoot.mouseClicked(this)){
            if (index<=0){
                index = 4; //if index is 0 or <0, clicking the back arrow should make it cycle back to index 4 (darkest skin)
            } else {
                index -= 1; 
            }
        }
    }

    public BackArrow(){
        GreenfootImage arrow = new GreenfootImage("images/icons/arrow.PNG");
        arrow.scale(130,130);
        setImage(arrow);
    }
}
