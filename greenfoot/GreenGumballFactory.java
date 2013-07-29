/**
 * Write a description of class GreenGumballFactory here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GreenGumballFactory implements GumballFactory
{
    public Gumball getGumball() {
        return new GreenGumball();
    }
}
