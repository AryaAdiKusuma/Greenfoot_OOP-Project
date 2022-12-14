import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PowerUp here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PowerUp extends Actor
{
    /**
     * Act - do whatever the PowerUp wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public PowerUp(){
        setImage("PowerUp.png");
        getImage().scale(30, 30);
    }
    public void act()
    {
        if(isTouching(Player.class)){
            Player player = (Player)getOneIntersectingObject(Player.class);
            player.fireUp();
            getWorld().removeObject(this);
        }
    }
}
