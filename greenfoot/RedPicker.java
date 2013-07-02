import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RedPicker here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RedPicker extends Picker
{
    /**
     * Act - do whatever the RedPicker wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
    
    GumballMachine gumballmachine=new GumballMachine();
    public void pick(){
        Gumball gm=new RedGumball();
        World world=getWorld();
        world.addObject(gm, 400, 400);
        setMessage(gm.getClass().getName());
        
        
    }
}
