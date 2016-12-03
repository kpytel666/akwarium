import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MyWorld extends World
{
    Ryba rybka;
    Licznik licznik;

    public Licznik zwrocLicznik(){
        return licznik;
    }

    public MyWorld()
    {    

        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        System.out.println("Hello ");

        licznik = new Licznik();
        addObject(licznik, 25, 5);
    }

    public void dodajRybke(){
        switch(Greenfoot.getRandomNumber(3)){
            case 0: {
                rybka = new Zlota();
                break;
            }    
            case 1: {
                rybka = new Zielona();
                break;
            } 
            case 2: {
                rybka = new Paskowana();
                break;
            } 

        }
        addObject(rybka, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(300)+100);
    }

    public void act(){
        if(Greenfoot.mousePressed(this)){
            dodajRybke();
        }
        if(numberOfObjects()== 1){
            for(int i=0; i<3; i++)
            {
                dodajRybke();
            }
        }

    }
}
