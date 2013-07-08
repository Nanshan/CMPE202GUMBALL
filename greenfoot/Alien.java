import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Alien extends Actor
{
    Message m=new Message();
  
    public Alien()
    {
        GreenfootImage image = getImage() ;
        image.scale( 150, 180 ) ; 
    }

     
  
      protected void setMessage( String msg ) 
    {
        int x, y;
        x = getX();
        y = getY();
        m.setText( msg ) ; 
        World world = getWorld();
        if ( m.getWorld() != null )
        {
            world.removeObject( m ) ;
        }
        world.addObject(m, x, y ) ;
               
    }
}
