import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RandomPicker here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RandomPicker extends Picker
{
    /**
     * Act - do whatever the RandomPicker wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
   
    public void pick(){
        
        System.out.println("Random picking");
        
        Gumball gb= new Gumball();
        int random=Greenfoot.getRandomNumber(3);
        switch(random){
            
            case 0: gb=new BlueGumball(); break;
            case 1: gb=new GreenGumball(); break;
            case 2: gb=new RedGumball(); break;
            
            
        }
        World world=getWorld();
        world.addObject(gb, 400, 400);
        setMessage(gb.getClass().getName());
        System.out.println("random: "+ random);
        System.out.println("Gumball: "+ gb.getClass().getName());
        
        
    }
}
