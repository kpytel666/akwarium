import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Paskowana extends Ryba
{
    public Paskowana(){
        szybkosc=3;
        setRotation(Greenfoot.getRandomNumber(20)+25);
    }
    public void act() 
    {
        // Add your action code here.
        super.act();
        //move(szybkosc);
    }    
}
