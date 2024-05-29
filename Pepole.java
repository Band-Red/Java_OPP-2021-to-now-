
public class Pepole
{
    private String Name;
    private int ID;

    public Pepole(){
      
    }
    
    public Pepole(String Name, int ID){
        this.Name = Name;
        this.ID = ID;
    }
    
    public String getName(){
        return Name;
    }
    
    public int getID(){
        return ID;
    }
    
    public void setName(String Name){
         this.Name = Name;
    }
    
    public void setID(int ID){
        this.ID = ID;
    }
    
    public void display(){
        System.out.println(this.Name + this.ID);
    }
}
