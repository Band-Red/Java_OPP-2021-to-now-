import java.util.ArrayList;
import java.util.Iterator;

public class San{
   public static void main(String [] arge){
       Pepole P1 =new Pepole("Ali",2029938);
       
       ArrayList<Pepole> list = new ArrayList<>();
       list.add(P1);
       
       for(Pepole P : list){
           P.display();
       }
       
       int i=0;
       while(i<list.size()){
           list.get(i).display();
           i++;
       }
       
       Iterator<Pepole> it = list.iterator();
       
       while(it.hasNext()){
           System.out.println("\n");
           Pepole Pm =it.next();
           Pm.display();
       }
       
    }
}