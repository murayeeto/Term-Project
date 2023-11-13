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
    
    public boolean valid(String word)
    {
        //The NameInput() and JobInput() objects will use this method to check if the string contains special character(s). 
        //The loop checks each char in the word At(i) to see if it's a special character or an English letter/space/hyphen.
        //By default, valid = true so the loop will end when valid = false
        
        boolean valid = true;
        String validChar = " ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for (int i = 0; i < word.length() && valid==true; i++) {
            String iChar = String.valueOf(word.charAt(i)).toUpperCase();
            if (!validChar.contains(iChar)){ //if the character is not in validChar
                valid = false;
            }
        }
        if (word.trim().isEmpty()){
            valid = false;
        }
        return valid;
    }
}
