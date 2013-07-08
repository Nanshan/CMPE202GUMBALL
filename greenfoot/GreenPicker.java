import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GreenPicker here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GreenPicker extends Picker
{
   
    
    public void pick(){
        Gumball gm=new GreenGumball();
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
