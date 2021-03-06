import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;


public class Inspector extends Alien implements GumballObserver

{
    private ArrayList<Picker> pickers = new ArrayList<Picker>() ;
    
	public void addPicker(Picker obj) {
	    pickers.add(obj) ;
	}

	public  void removePicker(Picker obj) {
		System.out.println("Inside removePicker");
        pickers.remove(obj) ;
	}

   public void update(Coin coin){
       inspect(coin);
       
    }
    
	public void inspect( Coin coin )
	{
	   
	   System.out.println( "Coin: " + coin.getClass().getName() ) ;
	 
	   setMessage( coin.getClass().getName() ) ;
	 
	   int whichPicker = Greenfoot.getRandomNumber( pickers.size() ) ;
	   /*
	    * 0: BluePicker 
	    * 1: GreenPicker
	    * 2: RandomPicker
	    * 3: RedPicker
	    */
	   
	   Picker pickerChosen = pickers.get( whichPicker ) ;
	   System.out.println( "Picker: " + pickerChosen.getClass() ) ;
	   
	   if (  coin.getClass() == Quarter.class){

	       if(GumballMachine.num_Gumballs !=0 ){
	           
             GumballMachine.num_Gumballs--;
             System.out.println("Num of balls left: "+ GumballMachine.num_Gumballs);
	         pickerChosen.pick() ;//at runtime
	         Greenfoot.playSound("BALLOUT.wav");
	       
	      }else{
	       
	       setMessage("No Gumball");
	       Greenfoot.playSound("OOPS.wav");
	       GumballMachine.num_Gumballs=10;
	       System.out.println("No Gumball, please insert more");
	      
	       
	      }
	
	   }else {
	       System.out.println("Not Qulified Quarter, Please insert a real quarter");
	      
	   }
	   
	}
  

}
