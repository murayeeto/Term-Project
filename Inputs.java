import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Inputs here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Inputs extends Actor
{
    /**
     * Act - do whatever the Inputs wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        
    }
    
    //Working method that checks if a word is valid (doesn't contain numbers or special symbols)
    //Needs to be implemented in NameInput and JobInput
    
    public boolean valid(String word)
    {
        String validChar = " ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz-";
        boolean valid = true;
        for (int i = 0; i < word.length() && valid==true; i++) {
            if (!validChar.contains(String.valueOf(word.charAt(i)))){
                valid = false;
            }
        }
        return valid;
    }
}
