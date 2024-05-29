//Sub class 
public class Line extends Digram implements HashName
{
    
    //Constractor With out argement 
    public Line(){
        super(1,"Line");
    }
    
    //Uses Method found in interface HashName
    public void printName(){
        System.out.println(super.name);
    }
    
    //Recall Method Drow found in Super class Digram
    @Override
    public void Drow(){
        System.out.println("Drow Tringle");
        System.out.println("____________");
    }
}