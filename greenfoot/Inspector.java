import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;


public class Inspector extends Alien

{
    private ArrayList<Picker> pickers = new ArrayList<Picker>() ;
    
	public  void addPicker(Picker obj) {
	    pickers.add(obj) ;
	}

	public  void removePicker(Picker obj) {
		System.out.println("Inside removePicker");
        pickers.remove(obj) ;
	}

        
	public void inspect( Coin coin )
	{
	   
	   System.out.println( "Coin: " + coin.getClass().getName() ) ;
	   
	   /*
	   for( Picker picker : pickers){
	       
	       System.out.println("picker: "+ picker);
	   }*/
	   setMessage( coin.getClass().getName() ) ;
	   //System.out.println("Picker size: "+pickers.size());
	   int whichPicker = Greenfoot.getRandomNumber( pickers.size() ) ;
	   /*
	    * 0: BluePicker 
	    * 1: GreenPicker
	    * 2: RandomPicker
	    * 3: RedPicker
	    */
	   //System.out.println("which picker: "+whichPicker);
	   Picker pickerChosen = pickers.get( whichPicker ) ;
	   //System.out.println( "Picker: " + pickerChosen.getClass() ) ;
	   //System.out.println("num of ball: "+ GumballMachine.num_Gumballs);
	   if (  GumballMachine.num_Gumballs !=0  ){
	       if(coin.getClass() == Quarter.class){
           GumballMachine.num_Gumballs--;
           //System.out.println("num of ball: "+ GumballMachine.num_Gumballs);
	       pickerChosen.pick() ;
	       
	   }else{
	       
	       System.out.println("Not Qulified Quarter, Please insert a real quarter");
	   }
	
	   }else {
	       setMessage("No Gumball, please add more gumballs");
	       GumballMachine.num_Gumballs=10;
	       
	       System.out.println("No Gumball, please insert more");
	   }
	}
  

}
