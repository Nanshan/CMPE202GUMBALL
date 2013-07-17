import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GumballWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GumballWorld extends World
{

    /**
     * Constructor for objects of class GumballWorld.
     * 
     */
    public GumballWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        GumballMachine gumballmachine = new GumballMachine();
        addObject(gumballmachine, 350, 237);

        addObject( new Penny(), 57, 71 ) ;
        addObject( new Quarter(), 68, 156 ) ;
        addObject( new FakeQuarter(), 66, 248 ) ;

        Inspector inspector = new Inspector();
        addObject(inspector, 533, 291);

        Quarter quarter2 = new Quarter();
        addObject(quarter2, 63, 421);
        quarter2.setLocation(74, 354);

        Quarter quarter3 = new Quarter();
        addObject(quarter3, 92, 541);
        quarter3.setLocation(72, 452);

        BluePicker bluepicker = new BluePicker();
        addObject(bluepicker, 676, 121);

        GreenPicker greenpicker = new GreenPicker();
        addObject(greenpicker, 691, 322);

        RandomPicker randompicker = new RandomPicker();
        addObject(randompicker, 709, 471);

        RedPicker redpicker = new RedPicker();
        addObject(redpicker, 607, 435);

        gumballmachine.setInspector(inspector);
        
        inspector.addPicker(bluepicker);
        inspector.addPicker(greenpicker);
        inspector.addPicker(randompicker);
        inspector.addPicker(redpicker);
        
       

        bluepicker.setLocation(676, 65);
        inspector.setLocation(470, 264);
        greenpicker.setLocation(685, 231);
        randompicker.setLocation(709, 405);
        redpicker.setLocation(583, 477);
        gumballmachine.setLocation(252, 232);
        inspector.setLocation(415, 257);
        bluepicker.setLocation(610, 65);
        greenpicker.setLocation(715, 201);
        redpicker.setLocation(559, 467);
        randompicker.setLocation(611, 358);
        redpicker.setLocation(734, 452);

     
    }
}
