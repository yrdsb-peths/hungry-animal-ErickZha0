import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The world is cool.
 * 
 * @author (Erick) 
 * @version (11/30/2022)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        
        Elephant elephant = new Elephant();
        addObject(elephant, 300, 200);
        
        createApple();
    }
    
    public void createApple()
    {
        int x= Greenfoot.getRandomNumber(600);
        int y= Greenfoot.getRandomNumber(300);
        Apple apple = new Apple();
        addObject(apple, 300, 0 );
    }
}
