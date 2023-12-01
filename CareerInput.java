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
            //career = Greenfoot.ask("Your options are: teacher, nurse, engineer, accountant, architect, lawyer, store manager, or electrician. Choose wisely!");
            career = Greenfoot.ask("Enter a number: 1 = teacher, 2 = nurse, 3 = engineer, 4 = accountant, 5 = architect, 6 = lawyer, 7 = store manager, 8 = electrician. Choose wisely!");
            
            if(getCareer().equals("1")){
            Income.setIncome(66397);
            BankAccount.setBalance(19919);
            }
            else if(getCareer().equals("8")){
            Income.setIncome(60040);
            BankAccount.setBalance(18012);
            }
            else if(getCareer().equals("2")){
            Income.setIncome(2482);
            BankAccount.setBalance(24825);
            }
            else if(getCareer().equals("3")){
            Income.setIncome(99411);
            BankAccount.setBalance(29823);
            }
            else if(getCareer().equals("4")){
            Income.setIncome(65000);
            BankAccount.setBalance(19500);
            }
            else if(getCareer().equals("5")){
            Income.setIncome(131322);
            BankAccount.setBalance(39396);
            }
            else if(getCareer().equals("6")){
            Income.setIncome(127990);
            BankAccount.setBalance(38397);
            }
            else if(getCareer().equals("7")){
            Income.setIncome(55428);
            BankAccount.setBalance(16628);
            }
            else{
                career = Greenfoot.ask("Please enter a valid number! You can choose 1 through 8!");
            }
            
            /* while ( (valid(career)==false) ){
                career = Greenfoot.ask("Please enter one of the numbers given. You can choose 1 through 8!");
            }
            career = career.trim();
            if (career.length()>15){
                career = career.substring(0,15); //character limit of 15
            } */
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
