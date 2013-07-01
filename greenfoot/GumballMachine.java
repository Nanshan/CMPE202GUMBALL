import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GumballMachine here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GumballMachine extends Actor
{

    public GumballMachine()
    {
        GreenfootImage image = getImage() ;
        image.scale( 350, 400 ) ; 
    }
    
    Message m=new Message();
    Coin haveCoin=new Coin();
    Inspector inspector=new Inspector();
    
    
    protected void setMessage( String msg ) 
    {
        int mouseX, mouseY ;
        MouseInfo mouse = Greenfoot.getMouseInfo();  
        mouseX=mouse.getX();  
        mouseY=mouse.getY();  
        World world = getWorld();
        if ( getWorld() != null )
        {
            world.removeObject(m ) ;
        }
        world.addObject(m, mouseX, mouseY ) ;
        m.setText( msg ) ;        
    }
    
    public void act() 
    {
        int mouseX, mouseY ;
        
        Actor coin;
        coin = getOneIntersectingObject( Coin.class ) ;
        /*
         * if you have dragged any coin ( quarter, penny, fake) over machine;
         * then yo have the coin now
         * then remove the object
         * 
         */
        if ( coin != null )
        {
            //System.out.println( coin.toString() ) ;
            setMessage("Have Coin Now");
            World world = getWorld() ;
            world.removeObject( coin ) ;
        }
       /*
        * when pressed the machine
        * then turn the crank
        * show " No Coin Now" if no coin over 
        * Show "Turned Crank" if there is a coin
        * 
        */
        if(Greenfoot.mousePressed(this)) {          
            MouseInfo mouse = Greenfoot.getMouseInfo();  
             if ( haveCoin == null )
                setMessage( "No Coin Now!" ) ;
            else
            {
                setMessage( "Turned Crank!" ) ;
                inspector.inspect( haveCoin ) ; // how to piak a green ball
                haveCoin = null ;
            }
        }

      
    }    
}
