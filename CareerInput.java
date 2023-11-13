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
            career = Greenfoot.ask("What's your career?");
            while (valid(career)==false){
                career = Greenfoot.ask("Please enter a career - It can only contain English letters and spaces!");
            }
            career = career.trim();
            if (career.length()>15){
                career = career.substring(0,15); //character limit of 15
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
    
    //Creates a filewriter object that will read and write the file, "career.txt".
    //This avoids creating new filewriters each time you want to read career.txt (saves resources)
    static {
        try {
            writer = new FileWriter("save/career.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    //Use the public methods below for saving & loading
    
    private static void save(){
        //saves the career String in career.txt
        try {
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
