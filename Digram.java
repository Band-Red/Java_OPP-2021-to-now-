//Super class 
public abstract class Digram {
    protected int side;
    protected String name;
    
    //Constractor With argement
    public Digram(int side, String name){
        this.side = side;
        this.name = name;
    }
    
    //Create abstract Method name than Drow, and return Type void
    public abstract void Drow();
    
}