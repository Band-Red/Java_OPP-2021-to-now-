//This is Subclass 
public class Student extends Person {
   // Field 
    private int Sid;

    //Call the Method among to print information
    public Student(String name, String adress, int age, int id){
        // this is input to want stored value him 
        super(name, adress, age);
        this.Sid = id;
    }//End Constructors with out arguments
    
    //Call the Method among to print information
    @Override
    public void display(){
        System.out.println("Name: " + super.name);
        System.out.println("Address: " + super.address);
        System.out.println("Age: " + super.age);
        System.out.println("ID: " + this.Sid);
    }//End method display 
    
    //Call the Method among to print information
    @Override
    public void Show(){
        System.out.println("Name: " + super.name + "\t" + "Address: " + super.address + "\t" + "Age : " + super.age + "\t" + "ID: " + this.Sid);
    }//End method Show
}
