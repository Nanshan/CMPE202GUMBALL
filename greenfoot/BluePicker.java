import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BluePicker here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BluePicker extends Picker
{ 

    public void pick(){
        Gumball gm=new BlueGumball();
        World world=getWorld();
        world.addObject(gm, 400, 400);
        setMessage(gm.getClass().getName());
        
        
    }

}
