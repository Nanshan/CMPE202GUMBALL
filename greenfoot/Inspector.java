import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;

/**
 * Write a description of class Inspector here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Inspector extends Alien



{
    private ArrayList<Picker> pickers = new ArrayList<Picker>() ;
    
	public void addPicker(Picker obj) {
	    pickers.add(obj) ;
	}

	public void removePicker(Picker obj) {
        pickers.remove(obj) ;
	}
   //GumballMachine gm=new GumballMachine();
	
	public void inspect( Coin coin )
	{
	   
	   System.out.println( "Coin: " + coin.getClass().getName() ) ;
	   
	   setMessage( coin.getClass().getName() ) ;
	   System.out.println("Picker size: "+pickers.size());
	   int whichPicker = Greenfoot.getRandomNumber( pickers.size() ) ;
	   Picker pickerChosen = pickers.get( whichPicker ) ;
	   System.out.println( "Picker: " + pickerChosen.getClass() ) ;
	  System.out.println("num of ball: "+ GumballMachine.num_Gumballs);
	   if (  GumballMachine.num_Gumballs !=0 && coin.getClass() == Quarter.class ){
           GumballMachine.num_Gumballs--;
           System.out.println("num of ball: "+ GumballMachine.num_Gumballs);
	       pickerChosen.pick() ;
	       
	       
	   }
	}
	
}