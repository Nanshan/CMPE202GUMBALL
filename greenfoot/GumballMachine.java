import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GumballMachine here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GumballMachine extends Actor
{
    Message m=new Message();
    Coin haveCoin;
    Inspector inspector;
    static int num_Gumballs=2; //initial number of gummballs
    
    public GumballMachine()
    {
        GreenfootImage image = getImage() ;
        image.scale( 350, 400 ) ; 
    }
    
   
    
    public void setInspector(Inspector in){
        inspector=in;
    }
    protected void setMessage( String msg ) 
    {
        m.setText( msg ) ;       
        int mouseX, mouseY ;
        mouseX=getX();
        mouseY=getY();
        World world = getWorld();
        if ( m.getWorld() != null )
        {
            world.removeObject( m ) ;
        }
        world.addObject(m, mouseX, mouseY ) ;
    }
    
    public void act() 
    {    
       /*
        * when pressed the machine
        * then turn the crank
        * show " No Coin Now" if no coin over 
        * Show "Turned Crank" if there is a coin
        * 
        */
        if(Greenfoot.mousePressed(this)) { 
            
            MouseInfo mouse = Greenfoot.getMouseInfo();  
             if ( haveCoin == null ){
                setMessage( "No Coin Now!" ) ;
            }
            else
            {  
              
                setMessage( "Turned Crank!" ) ;
                Greenfoot.playSound("CRANK.wav");
               
                inspector.inspect( haveCoin ) ; // how to piak a gumball
            
                haveCoin = null ;
                
            }
        }
        
         Actor coin;
    
        coin=getOneObjectAtOffset(+5, +5, Coin.class);
        /*
         * if you have dragged any coin ( quarter, penny, fake) over machine;
         * then yo have the coin now
         * then remove the object
         * 
         */
        if ( coin != null )
        {
            
            haveCoin=(Coin) coin;
            setMessage("Have Coin Now");
            World world = getWorld() ;
            world.removeObject( haveCoin ) ;
            Greenfoot.playSound("INSERT.wav");
            
        }

        
       
    }    
}
