//This is Subclass 
public class Employee extends Person {
   // Field 
    private int Eid;
    private int salary;

    //Call some the Methods among to print information
    public Employee(String name, String adress, int age, int Id){
        // this is input to want stored value him 
        super(name, adress, age);
        this.Eid = Id;
    }//End Constructors with out arguments
    
    //Call the Method among to print information
    @Override
    public void display(){
        System.out.println("Name: " + super.name);
        System.out.println("Address: " + super.address);
        System.out.println("Age: " + super.age);
        System.out.println("ID Employee: " + this.Eid);
    }//End method display 
    
    //Call the Method among to print information
    @Override
    public void Show(){
        System.out.println("Name: " + super.name + "\t" + "Address: " + super.address + "\t" + "Age : " + super.age + "\t" + "ID Employee: " + this.Eid);
    }//End method Show
    
    public int addSalary(int discount, int base_salary){
        return base_salary - discount; 
    }
    
    public int addSalary(){
        return 4000-500; 
    }
    
    public String addSalary(String base_salary, int discount){
        return  base_salary + "\t discount: "+ discount; 
    }
    
    public String addSalary(int discount, String base_salary){
        return  base_salary +  "\t discoun: " + discount; 
    }
    
    public double addSalary(double discount, int base_salary){
        return base_salary - discount; 
    }

}

