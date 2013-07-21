import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RandomPicker here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RandomPicker extends Picker
{
    public void pick() {
        
        Gumball gb;
        int random=Greenfoot.getRandomNumber(3);
        switch(random) {
            case 0:
                GumballFactory bgf = new BlueGumballFactory();
                gb = bgf.getGumball();
                break;
            case 1:
                GumballFactory ggf = new GreenGumballFactory();
                gb = ggf.getGumball();
                break;
            case 2:      // falling case
            default:
                GumballFactory rgf = new RedGumballFactory();
                gb = rgf.getGumball();
                break;
        }
        System.out.println("Gumball: " + gb.getClass());

        World world=getWorld();
        world.addObject(gb, 400, 400);
        setMessage(gb.getClass().getName());
        System.out.println("random: "+ random);
        System.out.println("Gumball: "+ gb.getClass().getName());
        
        
    }
}
