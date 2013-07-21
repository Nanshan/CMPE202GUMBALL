import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
public class RandomPicker extends Picker
{
    public void pick() {
        
       Gumball gb;
       Adapter adapter=new Adapter();
       Random rm=new Random();
      int random2=rm.nextInt(100);
      int random=adapter.getRandomeNumber(random2);
       //System.out.println("rm.nextInt(100): " +random2);
       //System.out.println("random2%3: "+ random2%3);
       System.out.println("Random number in RandomPicker: " +random);
   
        switch(random) {
            case 0:
                GumballFactory bgf = new BlueGumballFactory();
                gb = bgf.getGumball();
                break;
            case 1:
                GumballFactory ggf = new GreenGumballFactory();
                gb = ggf.getGumball();
                break;
            case 2:      
                
            default:
                GumballFactory rrgf = new RedGumballFactory();
                gb = rrgf.getGumball();
                break;
        }
        System.out.println("Gumball Name: "+ gb.getClass().getName());
      
        World world=getWorld();
        world.addObject(gb, 400, 400);
        setMessage(gb.getClass().getName());
    
        
    }
}
