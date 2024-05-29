//Main Class 
public class Main {
    public static void main(String [] args){
        Tringle x;                 // add Object name it x, and return Type Tringle.
        x = new Tringle();        // operation create Object.
        x.printName();           // Uses method printName to print vlaues found in x. 
        x.Drow();                    // Uses method Drow to print vlaues found in t.
        System.out.println("\n \n");
        
        Digram v;                   // add Object name it v, and return Type Digram.
        v = new Tringle();         // operation create Object.
        v.Drow();                 // Uses method Drow to print vlaues found in v.
        System.out.println("\n \n");
        
        Tringle t ;
        t = new Tringle();  // operation create Object.
        t.printName();             // Uses method printName to print vlaues found in t.
        t.printColor();           // Uses method printColor to print vlaues found in t.
        t.Drow();
        System.out.println("\n \n");
        
        Circle c = new Circle();    // operation create Object.
        c.printName();             // Uses method printName to print vlaues found in c.
        c.printColor();           // Uses method printColor to print vlaues found in c.
        c.Drow();
        System.out.println("\n \n");
        
        Line l = new Line();      // operation create Object.
        l.printName();           // Uses method printName to print vlaues found in l.        
        l.Drow();               // Uses method printName to print vlaues found in l.
        System.out.println("The defualt color of line is: ");
        HashColor.defualtColor();
    }
}