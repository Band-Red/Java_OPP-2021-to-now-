//Sub class 
public class Tringle extends Digram implements HashName, HashColor
{    
    //Constractor With out argement
    public Tringle(){
        super(3,"Tringle"); 
    }
    
    //Uses Method found in interface HashName
    public void printName(){
        System.out.println(super.name);
    }
    
    //Uses Method found in interface HashColor
    public void printColor(){
        System.out.println("one: Blue");
        System.out.println("two: White");
    }
    
    //Recall Method Drow found in Super class Digram
    @Override
    public void Drow(){
        System.out.println("Drow Tringle");
        System.out.println("____________");
    }
}