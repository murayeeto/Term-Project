import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PhoneBG here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
//creates phone screen image
public class PhoneScreen extends Actor
{
    /**
     * Act - do whatever the PhoneBG wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public PhoneScreen(){
       GreenfootImage phone = new GreenfootImage("cityandtown.PNG");
       phone.scale(210,355);
       setImage(phone);
    }
    //public void act()
    //{
    //  new PhoneScreen();  
    //}
}
