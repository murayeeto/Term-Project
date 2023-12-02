import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EndScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GoodEndScreen extends EndScreen
{
    //Ideas
    /*Use:
     *Greenfoot.setWorld(new GoodEndScreen());
     *if the player ends with a creditscore>500 and money>100,000
     *else, set world to BadEndScreen.
     *
     *Inside Character() add instance var: private ArrayList<String> achievements;
     *add methods:
     *1. public ArrayList<String> getAchievements() {
     *   return achievements;}
     *2. public void addAchievement(String achievement) {
     *    achievements.add(achievement);}
     *    
     * Inside Event() act(), add: 
     * if (creditScore == 850){
	Character.addAchievement("Credit Master: Achieved a perfect score of 850!");}
     */
    /**
     * Constructor for objects of class EndScreen.
     * 
     */
    public GoodEndScreen()
    {    
        setBackground("images/Backgrounds/citypopup.png");
        addObject(new Congratulations(),300,35);
        addObject(new GameSummary(),300,100);
        addObject(new GameAchievements(),295,230);
        addObject(new ContinueArrow(), 545,365);
        
        //balloons
        addObject(new Balloon(),100,460); addObject(new Balloon(),180,440); addObject(new Balloon(),250,500); addObject(new Balloon(),350,520); 
        addObject(new Balloon(),450,420); addObject(new Balloon(),500,510); addObject(new Balloon(),580,455); 
        addObject(new Balloon(),80,605); addObject(new Balloon(),200,625); addObject(new Balloon(),280,600); addObject(new Balloon(),400,500);
        addObject(new Balloon(),50,695); addObject(new Balloon(),225,678); addObject(new Balloon(),380,640); addObject(new Balloon(),535,680);
    }
}
