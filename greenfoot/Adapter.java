
public class Adapter  implements Target



{
    private Adaptee adaptee;
    public Adapter(){
       adaptee = new Adaptee();
    }
    
    
    
    public int getRandomeNumber(int x){
        
        return adaptee.getRandomeNumber(x,3);
        
    }
    
    
}
