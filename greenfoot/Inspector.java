import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;


public class Inspector extends Alien

{
    private ArrayList<Picker> pickers = new ArrayList<Picker>() ;
    
	public void addPicker(Picker obj) {
		System.out.println("Inside addPicker");
	    pickers.add(obj) ;
	}

	public void removePicker(Picker obj) {
		System.out.println("Inside removePicker");
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
    /*public void inspect (Coin coin) {
        System.out.println("Inside the Inspector");
        System.out.println( "Coin: " + coin.getClass().getName() ) ;
        setMessage( coin.getClass().getName() ) ;
        if (coin.getClass() == Quarter.class) {
            System.out.println("Inserted a quarter");
            int whichPicker = Greenfoot.getRandomNumber( pickers.size() ) ;
            PickerFactory pickerFactory = new PickerFactory();
            Picker pickerChosen = pickerFactory.getPicker(whichPicker);
            System.out.println("Picker: " + pickerChosen.getClass());
            pickerChosen.pick() ;
        }
    }*/

}
