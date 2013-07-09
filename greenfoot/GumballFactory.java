/**
 * Implements factory for Gumball
 * 
 * @author Anand Sherkhane
 * @version 1.0
 */
public class GumballFactory  
{
    public Gumball getGumball(int gumballType) {
        if (gumballType == 0) {
            return new BlueGumball();
        } else if (gumballType == 1) {
            return new GreenGumball();
        } else if (gumballType == 2) {
            return new RedGumball();
        } else {
            return null;
        }
    }
}
