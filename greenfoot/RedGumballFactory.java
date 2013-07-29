/**
 * Write a description of class RedGumballFactory here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RedGumballFactory implements GumballFactory
{
    public Gumball getGumball() {
        return new RedGumball();
    }
}
