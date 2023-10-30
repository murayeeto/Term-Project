import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class JobInputt here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class JobInput extends Inputs
{
    /**
     * Act - do whatever the JobInputt wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    //The rectangle object for inputing the job. Use the getter method below to implement the job into the gameplay.
    //Feel free to change job to something else, or to remove this entirely.

    private static GreenfootImage image;
    private static String job;

    public void act()
    {
        if (Greenfoot.mouseClicked(this)){
            job = Greenfoot.ask("What's your occupation?");
            if (job.length()>14){
                job = job.substring(0,14); //character limit of 14
            }
            image.clear();
            image.drawRect(0,0,170,27);
            image.drawImage(new GreenfootImage(job,22, Color.BLACK, new Color(0, 0, 0, 0)),5,3);
            setImage(image);
        }
    }

    public JobInput(){
        image = new GreenfootImage(173,30);
        image.drawRect(0,0,170,27);
        setImage(image);
    }

    public String getJob(){
        return job;
    }
}
