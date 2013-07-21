public interface Subject  
{
   public void registerObserver(GumballObserver o);
   public void removeObserver(GumballObserver o);
   public void notifyObservers();
}