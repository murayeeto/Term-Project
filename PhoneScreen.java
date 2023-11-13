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
       //GreenfootImage phone = new GreenfootImage("images/Backgrounds/phoneimage.png");
       GreenfootImage phone = new GreenfootImage("images/Backgrounds/phonenobg.png");
       //phone.scale(210,355);
       // phone.scale(phone.getWidth() + 500,phone.getHeight() + 500);
       //phone.setWidth(300);
       setImage(phone);
    }
    
    public void act()
    {
      //GreenfootImage phone = new GreenfootImage("images/Backgrounds/phoneimage.png");
      GreenfootImage phone = new GreenfootImage("images/Backgrounds/phonenobg.png");
       //phone.scale(210,355);
       phone.scale(phone.getWidth() + 100 ,phone.getHeight() - 40);
       
       setImage(phone);  
    }
}
