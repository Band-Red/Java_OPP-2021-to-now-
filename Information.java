import java.util.ArrayList;
import java.util.Iterator;
public class Information{
    public static void main(String[] args){
        Persons p1 = new Persons("Ahmed",19,"Najran","CS",990);
        p1.display();
        System.out.println("\n_______________________________________");
        
        //Use Array List with class Person
        ArrayList<Persons> list = new ArrayList<>();
        list.add(new Persons("Ali",20,"Jazan","IT",990));
        Persons F = new Persons("Bader",23,"Riyadh","CS",990);
        list.add(F);
        list.add(p1);
        list.add(new Persons("Hammed",18,"Abha","CS",990));
        list.remove(F);
        
        //Use for each to print value in Array List
        System.out.println("Printing the collection using for each");
        for(Persons H : list){
            System.out.println("\n");
            H.display();
        }//End for each
        System.out.println("\n--------------------------------------------");

        
        //Use while loop to print value in Array List
        System.out.println("Printing the collection using while loop");
        int i = 0;
        while(i<list.size()){
            System.out.println("\n");
            list.get(i).display();
            i++;
        }//End while loop
        System.out.println("\n____________________________________________");
        
        //Use Iterator to display Information
        System.out.println("Printing the collection using Iterator");
        Iterator <Persons> In =  list.iterator();
        while(In.hasNext()){
            System.out.println("\n________________________________________");
            Persons PN = In.next();
            PN.display();
        }//End while loop Iterator
        
    }//End main Method
}//End Class