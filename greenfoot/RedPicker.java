import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class RedPicker extends Picker
{
    
    GumballMachine gumballmachine=new GumballMachine();
    public void pick(){
        Gumball gm=new RedGumball();
        World world=getWorld();
        world.addObject(gm, 400, 400);
        setMessage(gm.getClass().getName());
        
        
    }
}
