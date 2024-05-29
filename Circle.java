//Sub class 
public class Circle extends Digram implements HashName, HashColor 
{
    
    //Constractor with out argement
    public Circle(){
        super(0,"Circle");
    }
    
    //Uses Method found in interface HashName
    public void printName(){
        System.out.println(super.name);
    }
    
    //Uses Method found in interface HashColor
    public void printColor(){
        System.out.println("grain");
    }
    
    //Recall Method Drow found in Super class Digram
    @Override
    public void Drow(){
        System.out.println("Drow Tringle");
        System.out.println("____________");
    }
}