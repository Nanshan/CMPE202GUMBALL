import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Message extends Actor
{
    GreenfootImage gi;

    public Message()
    {
        gi = new GreenfootImage( 100, 50);
        setImage(gi);        
    }

    public void setText( String msg )
    {
        gi.clear();
        gi.setColor( java.awt.Color.YELLOW ) ;
        gi.fill() ;
        gi.setColor( java.awt.Color.BLACK ) ;
        gi.drawString( msg, 0, 25 );  
    }
   

   protected void setMessage( String msg ) 
    {
        int mouseX, mouseY ;
        MouseInfo mouse = Greenfoot.getMouseInfo();  
        mouseX=mouse.getX();  
        mouseY=mouse.getY();  
        World world = getWorld();
        if ( getWorld() != null )
        {
            world.removeObject( this ) ;
        }
        world.addObject( this, mouseX, mouseY ) ;
        setText( msg ) ;        
    }


    public void act() 
    {
        if(Greenfoot.mousePressed(this)) {          
            World world = getWorld();
            world.removeObject( this ) ;
        }
    }    
}
