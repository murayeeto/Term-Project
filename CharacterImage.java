import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;
import java.io.File;
/**
 * Write a description of class CharacterImage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CharacterImage extends Actor
{
    /**
     * Act - do whatever the CharacterImage wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */ 

    public static boolean isAppear1;
    public static int index = 0;
    private static GreenfootImage image;
    public static String chosenCharacter;
    private static FileWriter writer;

    //When ForwardArrow() is clicked, skin index += 1 and the CharacterImage() is set to the image at the next index
    //When BackArrow() is clicked, skin index -= 1
    String [] fSkin = {"images/Avatars/Fskin1.png","images/Avatars/Fskin2.png","images/Avatars/Fskin3.png",
            "images/Avatars/Fskin4.png","images/Avatars/Fskin5.png"};
    String [] mSkin = {"images/Avatars/Mskin1.png","images/Avatars/Mskin2.png","images/Avatars/Mskin3.png",
            "images/Avatars/Mskin4.png","images/Avatars/Mskin5.png"};

    public void act()
    {   
        //constantly have the image set to skin[index]
        if (isAppear1){ //Female skin
            GreenfootImage image = (new GreenfootImage(fSkin[index]));
            image.scale(216, 200);
            setImage(image);
            chosenCharacter = fSkin[index];
        }
        if (!isAppear1){ //Male skin
            GreenfootImage image = (new GreenfootImage(mSkin[index]));
            image.scale(216, 200);
            setImage(image);
            chosenCharacter = mSkin[index];
        }
    }   

    public CharacterImage()
    {
        isAppear1 = true;
        image = (new GreenfootImage(fSkin[index]));
        image.scale(216, 200);
        setImage(image);
    }

    public static GreenfootImage getCharacter(){
        //New image necessary so the CharacterImage() doesn't shrink from CharacterIcon() code
        return new GreenfootImage(chosenCharacter);
    }

    //Creates a filewriter object that will read and write the file, "character.txt".
    //This avoids creating new filewriters each time you want to read character.txt (saves resources)
    static {
        try {
            writer = new FileWriter("save/character.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //Use the public methods below for saving & loading
    
    private static void save() {
        //saves the character file String in character.txt
        try {
            writer.write(chosenCharacter);
            writer.close(); //"flushes" the data and makes sure it's stored
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void load() {
        try (Scanner scanner = new Scanner(new File("save/character.txt"))) {
            if (scanner.hasNext()) { //if the character file string was saved in the file
                chosenCharacter = scanner.next();
            } 
            scanner.close(); //Apparently we should be closing the scanner to release resources
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void saveCharacter(){
        save();
    }

    public static void loadCharacter(){
        load();
    }

}
