import java.util.Random;
public class Example {
    public static void main(String[] args) {
        Random r = new Random();
        for(int i=1; i<=8;i++){
          int N = r.nextInt(9);
          System.out.print(N); 
        }
        
        System.out.println("\n "+"___________________________________");
        for(int i=1; i<=8;i++){
          char t = (char) (r.nextInt(26) + 'a');
          System.out.print(t); 
        }
        
        System.out.println("\n "+"___________________________________");
        
        String p= "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for (int i = 0; i < 10; i++) {
            char Password = p.charAt(r.nextInt(p.length()));
            System.out.print(Password);
        }
    }
}