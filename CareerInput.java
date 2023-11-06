import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class JobInputt here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CareerInput extends Inputs
{
    /**
     * Act - do whatever the JobInputt wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    //The rectangle object for inputing the career. Use the getter method below to implement the career into the gameplay.
    //Feel free to change career to something else, or to remove this entirely.

    private static GreenfootImage image;
    private static String career;

    public void act()
    {
        if (Greenfoot.mouseClicked(this)){
            career = Greenfoot.ask("What's your career?");
            while (valid(career)==false){
                career = Greenfoot.ask("Please enter a career - It can only contain English letters and spaces!");
            }
            career = career.trim();
            if (career.length()>15){
                career = career.substring(0,15); //character limit of 15
            }
            image.clear();
            
            //Must redraw the image in case the user types something in more than once.
            
            image.drawRect(0,0,170,27);
            image.drawImage(new GreenfootImage(career,22, Color.BLACK, new Color(0, 0, 0, 0)),5,3);
            setImage(image);
        }
    }

    public CareerInput(){
        image = new GreenfootImage(171,30);
        image.drawRect(0,0,170,27);
        setImage(image);
    }

    public static String getCareer(){
        return career;
    }
}
