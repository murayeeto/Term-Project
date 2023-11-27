import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;

/**
 * Write a description of class Textbox here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NameInput extends Inputs
{

    //The rectangle object for inputing the name. Use the getter method below to implement the name into the gameplay.

    private static GreenfootImage image;
    private static String name;
    public static boolean noName;
    private static FileWriter writer;

    public void act()
    {
        if (Greenfoot.mouseClicked(this)){
            name = Greenfoot.ask("What's your name?");
            while (valid(name)==false){
                name = Greenfoot.ask("Please enter a valid name!");
            }
            name = name.trim();
            if (name.length()>15){
                name = name.substring(0,15); //character limit of 14
            }
            noName = false;
            image.clear();
            //Must redraw the image in case the user types something in more than once.
            image.drawRect(0,0,170,27);
            image.drawImage(new GreenfootImage(name,22, Color.BLACK, new Color(0, 0, 0, 0)),5,3);
            setImage(image);
        }

        //This is false by default but becomes true when ContinueArrow is clicked and getName() == null
        if (noName){
            image.drawRect(0,0,170,27);
            image.drawImage(new GreenfootImage("Please enter name",20, Color.GRAY, new Color(0, 0, 0, 0)),5,3);
            setImage(image);
        }
    }

    public NameInput(){
        name = "";
        noName = false;
        image = new GreenfootImage(171,30);
        image.drawRect(0,0,170,27);
        setImage(image);
    }

    public static String getName(){
        return name;
    }

    //Use the public methods below for saving & loading

    private static void save(){
        //saves the name String in name.txt
        try {
            writer = new FileWriter("save/name.txt");
            writer.write(name);
            writer.close(); //"flushes" the data and makes sure it's stored
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void load(){
        try (Scanner scanner = new Scanner(new File("save/name.txt"))) {
            if (scanner.hasNext()) { //if a name was saved in the file
                name = scanner.next();
            }
            scanner.close(); //Apparently we should be closing the scanner to release resources
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void saveName() {
        save();
    }

    public static void loadName() {
        load();
    }
}
