import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The world is cool.
 * 
 * @author (Erick) 
 * @version (11/30/2022)
 */
public class MyWorld extends World
{
    public int score = 0;
    Label scoreLabel;
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false);
        
        Elephant elephant = new Elephant();
        addObject(elephant, 300, 300);
        
        scoreLabel = new Label(0,80);
        addObject(scoreLabel, 50,50);
        
        createApple();
    }
    
    public void gameOver()
    {
        //game ends when apple drops to the bottom of screen.
        Label gameOverLabel = new Label("Game Over", 100);
        addObject(gameOverLabel, 300, 200);
    }
    
    public void increaseScore()
    {
        //increase score when apple gets eat.
        score++;
        scoreLabel.setValue(score);
    }
    
    public void createApple()
    {
        Apple apple = new Apple();
        int x= Greenfoot.getRandomNumber(600);
        int y=  0;
        addObject(apple, x, y);
    }
}
