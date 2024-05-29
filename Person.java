//Super class Person
abstract class Person{
    // Field 
    protected String name;
    protected String address;
    protected int age;

    //Constructors with out arguments
    public Person(String name, String adress, int age){
        // this is input to want stored value him 
      this.name = name;
      this.address = adress;
      this.age = age;
    }//End Constructors with out arguments
    
    //Create abstract type method
    
    public abstract void display();
    
    /*{
        System.out.println("Name: " + this.name);
        System.out.println("Address: " + this.address);
        System.out.println("Age: " + this.age);
    }//End method display */
    
    //Create abstract type method
    public abstract void Show();
    
    /*{
        System.out.println("Name: " + this.name + "\t" + "Address: " +this.address + "\t" +"Age : " + this.age);
    }//End method Show*/
}
