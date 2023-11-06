import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class TextOverlay extends Actor {
    private GreenfootImage image;

    public TextOverlay(String text) {
        image = new GreenfootImage(text, 24, Color.BLACK, null);
        setImage(image);
    }

    public void setText(String text) {
        image = new GreenfootImage(text, 24, Color.BLACK, null);
        setImage(image);
    }
}