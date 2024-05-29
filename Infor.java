// class Infor
public class Infor {
    public static void main(String [] arge){
        Person p = new Employee ("Hamad", "Jazan",19,236643);
        System.out.println("Print using Method display");
        p.display();
        System.out.println("\n" + "Print using Method Show");
        p.Show();
        System.out.println("\n"+"_____________________________________________________________");
        
        Person a = new Student ("hamed", "Abu-Arish", 21,2907872);
        System.out.println("Print using Method display");
        a.display();
        System.out.println("\n" + "Print using Method Show");
        a.Show();
        System.out.println("\n"+"_____________________________________________________________");
        
        Student s = new Student ("Ahmed", "Abu-Arish", 22,2984872);
        System.out.println("\n" + "Print using Method display");
        s.display();
        System.out.println("\n" + "Print using Method Show");
        s.Show();
        System.out.println("\n"+"_____________________________________________________________");
                
        Employee e = new Employee ("Hassan", "Riyadh", 20, 2098449);
        System.out.println("\n" + "Print using Method Show");
        e.Show();
        System.out.println("\n \n");
        System.out.println("Salary: " + e.addSalary(1000,4000));
        System.out.println("Salary: " + e.addSalary("four thousand", 200));
        System.out.println("Salary: " + e.addSalary(100,"four thousand"));
        System.out.println("Salary: " + e.addSalary(220.14, 5000));
        System.out.println("Salary: " + e.addSalary());
        
        /*System.out.println("\n" + "\n" + "Print using Method display");
        e.display();*/
    }
}//End Class Infor
