import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BluePicker here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BluePicker extends Picker
{
    /**
     * Act - do whatever the BluePicker wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }   
    GumballMachine gumballmachine=new GumballMachine();
    public void pick(){
        Gumball gm=new BlueGumball();
        World world=getWorld();
        world.addObject(gm, 400, 400);
        setMessage(gm.getClass().getName());
        
        
    }
/*
    public void pick(Gumball gm){
        int randomNum=Greenfoot.getRandomNumber(30);
        if(randomNum <10){
        World world=getWorld();
        world.addObject(gm, 400, 400);
        }else{
            if(successor != null){
                successor.pick(gm);
            }
        }

    }
    
    Picker successor=null;
    public void setSuccessor(Picker next){
        this.successor=next;
        
    }
    
    */
}
