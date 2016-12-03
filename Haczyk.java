import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Haczyk extends Actor
{

    public void act() 
    {
        // Add your action code here.
        setLocation(getX(), getY()-5);
        if(isAtEdge()){
            getWorld().removeObject(this);
        }
    }    
}
