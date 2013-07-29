/**
 * Write a description of class BlueGumballFactory here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BlueGumballFactory implements GumballFactory
{
    public Gumball getGumball() {
        return new BlueGumball();
    }
}
