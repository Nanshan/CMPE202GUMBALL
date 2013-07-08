import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;


public class Inspector extends Alien



{
    private ArrayList<Picker> pickers = new ArrayList<Picker>() ;
    
	public void addPicker(Picker obj) {
	    pickers.add(obj) ;
	}

	public void removePicker(Picker obj) {
        pickers.remove(obj) ;
	}

	
	public void inspect( Coin coin )
	{
	   
	   System.out.println( "Coin: " + coin.getClass().getName() ) ;
	   
	   setMessage( coin.getClass().getName() ) ;
	   System.out.println("Picker size: "+pickers.size());
	   int whichPicker = Greenfoot.getRandomNumber( pickers.size() ) ;
	   Picker pickerChosen = pickers.get( whichPicker ) ;
	   System.out.println( "Picker: " + pickerChosen.getClass() ) ;
	  System.out.println("num of ball: "+ GumballMachine.num_Gumballs);
	   if (  GumballMachine.num_Gumballs !=0  ){
	       if(coin.getClass() == Quarter.class){
           GumballMachine.num_Gumballs--;
           System.out.println("num of ball: "+ GumballMachine.num_Gumballs);
	       pickerChosen.pick() ;
	   }else{
	       
	       System.out.println("Not Qulified Quarter, Please insert a real quarter");
	   }
	
	   }else {
	       setMessage("No Gumball");
	       GumballMachine.num_Gumballs=10;
	       
	       System.out.println("No Gumball, please insert more");
	   }
	}
	
}