import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Zielona extends Ryba
{
    public Zielona(){
        szybkosc=2;
        setRotation(Greenfoot.getRandomNumber(20)+25);
    }
    public void act() 
    {
        // Add your action code here.
        super.act();
        //move(szybkosc);
    }    
}
