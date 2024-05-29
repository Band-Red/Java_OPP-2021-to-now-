//Class Store 
public class Store {        //Create Fields
    private String Name;
    private int ID;
    private int Salary;
    
    //Create Default Constructors
    public Store(){

    }//End  Default Constructors
    
    //Create Constructors with arguments
    public Store(String Name,int ID, int Salary){
      this.Name = Name;
      this.ID = ID;
      this.Salary = Salary;
    }//End  constructors with out arguments
    
    //Create Accessor and Mutatours
    public String getName(){
        return Name;
    }//End Accessor:Method getName
    
    public void setName(String Name){
        this.Name = Name;
    }//End Mutatuors:Method setName
    
    public int getID(){
        return ID;
    }//End Accessor:Method getID
    
    public void setID(int ID){
        this.ID = ID;
    }//End Mutatuors:Method setID
    
    public int getSalary(){
        return this.Salary;
    }//End Accessor :Method getSalary
    
    public void setSalary(int Salary){
        this.Salary = Salary;
    }//End Mutatuors :Method setSalary
    
    //Create Methods Display information
    public void display(){
        System.out.println(this.Name + "\t" + this.ID +"\t"+this.Salary);
    }//End Method display
    
    public void Show(){
        System.out.print(this.Name);
        System.out.print("\t"+this.ID);
        System.out.print("\t"+this.Salary+"\n");
    }//End Method Show
    
}//End Class Store