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
            //career = Greenfoot.ask("What's your career?");
            career = Greenfoot.ask("Your options are: teacher, nurse, engineer, accountant, architect, lawyer, store manager, or electrician. Choose wisely!");
            
            if(getCareer().equals("teacher")){
            Income.setIncome(66397);
            }
            else if(getCareer().equals("electrician")){
            Income.setIncome(60040);
            }
            else if(getCareer().equals("nurse")){
            Income.setIncome(82750);
            }
            else if(getCareer().equals("engineer")){
            Income.setIncome(99411);
            }
            else if(getCareer().equals("accountant")){
            Income.setIncome(65000);
            }
            else if(getCareer().equals("architect")){
            Income.setIncome(131322);
            }
            else if(getCareer().equals("lawyer")){
            Income.setIncome(127990);
            }
            else if(getCareer().equals("store manager")){
            Income.setIncome(55428);
            }
            
            while ( (valid(career)==false) ){
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
    
    public void jobIncome(){
        if(career == "teacher"){
            Income income = new Income(500);
            
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
