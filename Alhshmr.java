import java.util.ArrayList;
import java.util.LinkedList;               
import java.util.HashSet;
import java.util.HashMap;
import java.util.Random;

public class Alhshmr{                                                   //Start Class Alhshmr
    public static void main(String[] arge){                             //start Main class
        String line = " Object orinted Programming comp 314 ";          //create object Type: String  and name him  line

        //First Step: Used ArrayList 
        System.out.println("First:ArrayList ");
        ArrayList<String> Alist = new ArrayList<>();
        Alist.add(line);
        Alist.add(" Mutimedia Teqm-242 ");
        System.out.println("Position word {orinted}: " + Alist.indexOf(" orinted "));
        System.out.println("Is there a word [object] in Array? " + Alist.contains("Object"));
        System.out.println("Position word {orinted}: " + Alist.indexOf(" Multimedia "));
        System.out.println("Size ArrayList: " + Alist.size());
        
        //Printing a elements stored in ArrayList by for each
        System.out.println("\n" +"First Way: Printing by for each");
        for(String one: Alist){
            System.out.println(one);
        }
        
        //Printing a elements stored in ArrayList by While loop
        System.out.println("\n" +"Second Way: Printing by while-loop");
        int a = 0;
        while(a<Alist.size()){
            System.out.println(Alist.get(a));
            a++;
        }
        System.out.println("__________________________________________________________________________________________");
        
        
        //second step: Used LinkedList
        System.out.println("\n \n" +"Second: LinkedList");
        LinkedList<String> list = new LinkedList<>();
        list.add(line);
        list.add("Mutimedia Teqm-242");
        System.out.println("Position Word {Program}: "+list.indexOf("Program"));
        System.out.println("Size LinkedList: " + list.size());
        
        //Printing a elements stored in LinkedList by for each
        System.out.println("\n" +"First Way: Printing by for each");
        for(String two: list){
            System.out.println(two);
        }
        
        //Printing a elements stored in LinkedList by While loop
        System.out.println("\n" +"Second Way: Printing by while loop");
        int H = 0;
        while(H<list.size()){
            System.out.println(list.get(H));
            H++;
        }
        System.out.println("__________________________________________________________________________________________");
        
        
        //Third Step: Used HashSet
        System.out.println("\n \n" +"Third: HashSet");
        HashSet<String> addSet = new HashSet<>();
        addSet.add(line);
        addSet.add("Mutimedia Teqm-242");
        System.out.println("Is there a word {comp}? "+ addSet.contains("comp"));
        System.out.println("Size ArrayList: " + addSet.size());
        System.out.println("add Set is : " + addSet);
        
        //Printing a elements stored in HashSet by for each
        System.out.println("\n" +"Printing by for each");
        for (String three : addSet){
            System.out.println(three);
        }
        System.out.println("__________________________________________________________________________________________");
        
        
        //Forth Step: Used HashMap 
        System.out.println("\n \n" +"Fourth: HashMap");
        HashMap<String,Integer> mobileMap = new HashMap<>();
        String [] words = line.trim().toLowerCase().split(" ");
        mobileMap.put("Hammad", 983489291);
        mobileMap.put("Yahya", 93774);
        mobileMap.put("Ahmed", 10935);
        mobileMap.put("Bader", 37482);
        mobileMap.replace("Hammad",746728);
        mobileMap.containsKey(0);
        System.out.println("Size ArrayList: " + mobileMap.size());

        int x  = mobileMap.size();
        System.out.println(x);
        
        //Printing a elements stored in Array name him words by for each
        System.out.println("\n" +"Printing by for each");
        for (String S : words){
            System.out.println(S);
        }
        System.out.println("__________________________________________________________________________________________");

        
        //Fifth Step: Used Random 
        System.out.println("\n \n" +"Fifth: Random");
        Random r = new Random();
        
        System.out.println("\n" +"Printing by for each");
        for(int i =1 ; i<=5; i++){
            boolean N =r.nextBoolean();
            System.out.println(N);
        }
    } //end Main Class
}//end class Alhshmr
 