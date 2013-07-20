/**
 * Write a description of class GreenGumballFactory here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GreenGumballFactory extends GumballFactory
{
    public Gumball getGumball() {
        return new GreenGumball();
    }
}
