import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

public class Licznik extends Actor
{
    int iloscZlowionychRyb = 0;
    
    public int zwiekszlicznik(){
        return iloscZlowionychRyb++;
    }
    
    public Licznik(){
        setImage (new GreenfootImage("Wynik " + iloscZlowionychRyb, 24, Color.RED, null));
    }
    
    public void wynik(){
        iloscZlowionychRyb += 1;
        setImage (new GreenfootImage("" + iloscZlowionychRyb, 50, Color.RED, null));
        //return iloscZlowionychRyb;
    }
      public int wynik_int(){
        //iloscZlowionychRyb += 1;
        //setImage (new GreenfootImage("" + iloscZlowionychRyb, 50, Color.RED, null));
        return iloscZlowionychRyb;
    }
    
    public void act() 
    {
        // Add your action code here.
    }    
}
