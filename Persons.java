//Class Preson 
public class Persons {
    private String Name;
    private int Age;
    private String UniversityName;
    private String Specialization;
    private int Salary;
    
    public Persons(){

    }//End  Default constructors
    
    public Persons(String Name,int Age, String UniversityName, String Specialization,int Salary){
      this.Name = Name;
      this.Age = Age;
      this.UniversityName = UniversityName;
      this.Specialization = Specialization;
      this.Salary = Salary;
    }//End  constructors with out arguments
    
    public String getName(){
        return Name;
    }//End Accessor :Method getName
    
    public void setName(String Name){
        this.Name = Name;
    }//End Mutatuors :Method setName
    
    public int getAge(){
        return Age;
    }//End Accessor :Method getAge
    
    public void setAge(int Age){
        this.Age = Age;
    }//End Mutatuors :Method setAge
    
    public String getUniversityName(){
        return UniversityName;
    }//End Accessor :Method getUniversityName
    
    public void setUniversityName(String universityName){
        this.UniversityName = UniversityName;
    }//End Mutatuors :Method setUniversityName
    
    public String getSpecialization(){
        return Specialization;
    }//End Accessor :Method getSpecialization
    
    public void setSpecialization(String specialization){
        this.Specialization = Specialization;
    }//End Mutatuors :Method setSpecialization
    
    public int getSalary(){
        return this.Salary;
    }//End Accessor :Method getSalary
    
    public void setSalary(int Salary){
        this.Salary = Salary;
    }//End Mutatuors :Method setSalary
    
    public void display(){
        System.out.print(this.Name + "\t" + this.Age + "\t" + this.UniversityName+ "\t" + this.Specialization +"\t"+this.Salary);
    }//End Method display
    
}//End Class Person