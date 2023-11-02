import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

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
    
    //When ForwardArrow() is clicked, skin index += 1 and the CharacterImage() is set to the image at the next index
    //When BackArrow() is clicked, skin index -= 1
    
                            //Array index 0                  index 1                  index 2, etc
    String [] fSkin = {"images/Avatars/Fskin1.png","images/Avatars/Fskin2.png","images/Avatars/Fskin3.png",
            "images/Avatars/Fskin4.png","images/Avatars/Fskin5.png"
        };
    String [] mSkin = {"images/Avatars/Mskin1.png","images/Avatars/Mskin2.png","images/Avatars/Mskin3.png",
            "images/Avatars/Mskin4.png","images/Avatars/Mskin5.png"
        };

    public void act()
    {   
        //constantly have the image set to skin[index]
        if (isAppear1){ //Female skin
            GreenfootImage image = (new GreenfootImage(fSkin[index]));
        image.scale(216, 200);
        setImage(image);
        }
        if (!isAppear1){ //Male skin
            GreenfootImage image = (new GreenfootImage(mSkin[index]));
        image.scale(216, 200);
        setImage(image);
        }
    }   

    public CharacterImage()
    {
        isAppear1 = true;
        GreenfootImage image = (new GreenfootImage(fSkin[index]));
        image.scale(216, 200);
        setImage(image);

    }
}
