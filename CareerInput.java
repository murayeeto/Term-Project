import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;

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

    private static GreenfootImage image;
    private static String career;
    public static boolean noCareer;
    private static FileWriter writer;

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
            Income.setIncome(82750);
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
            
            
            noCareer = false;
            image.clear();
            //Must redraw the image in case the user types something in more than once.
            image.drawRect(0,0,170,27);
            image.drawImage(new GreenfootImage(career,22, Color.BLACK, new Color(0, 0, 0, 0)),5,3);
            setImage(image);
        }
        
        //This is false by default but becomes true when ContinueArrow is clicked and getCareer() == null
        if (noCareer){
            image.drawRect(0,0,170,27);
            image.drawImage(new GreenfootImage("Please enter career",20, Color.GRAY, new Color(0, 0, 0, 0)),5,3);
            setImage(image);
        }
    }

    public CareerInput(){
        career= "";
        noCareer = false;
        image = new GreenfootImage(171,30);
        image.drawRect(0,0,170,27);
        setImage(image);
    }

    public static String getCareer(){
        return career;
    }
    
    //Use the public methods below for saving & loading
    
    private static void save(){
        //saves the career String in career.txt
        try {
            FileWriter writer = new FileWriter("save/career.txt");
            writer.write(career);
            writer.close(); //"flushes" the data and makes sure it's stored
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void load(){
        try (Scanner scanner = new Scanner(new File("save/career.txt"))) {
            if (scanner.hasNext()) { //if a career was saved in the file
                career = scanner.next();
            } 
            scanner.close(); //Apparently we should be closing the scanner to release resources
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static void saveCareer() {
        save();
    }
    
    public static void loadCareer(){
        load();
    }
}
