import java.lang.String;

public class Stringdemo{
public static void main(String [] arge){
    String s1=new String("where are you");
    String s2="WHERE ARE YOU";
    System.out.println(" The string s1 is : " +s1);
    System.out.println(" The string s2 is : " +s2);
    System.out.println(" Length of the string s1 is : " +s1.length());
    System.out.println(" The first appearing of a is at the position : " +s1.indexOf('a'));
    System.out.println(" Length of the string s2 is : " +s2.length());
    System.out.println(" The first appearing of R is at the position : " +s2.indexOf('R'));
    System.out.println(" The String in Upper Case : " +s1.toUpperCase());
    System.out.println(" The String in Lower Case : " +s1.toLowerCase());
    System.out.println(" s1 equals to s2 : " +s1.equals(s2));
    System.out.println(" s1 equals ignore case to s2 : " +s1.equalsIgnoreCase(s2));
    
    int result=s1.compareTo(s2);
    System.out.println("After compareTo()");
    
    if(result==0)
    System.out.println( s1 + " is equal to "+s2);
    
    else if(result>0)
    System.out.println( s1 + " is greather than to "+s2);
    
    else
    System.out.println( s1 + " is smaller than to "+s2);
    System.out.println(" Character at an index of 6 is :" +s1.charAt(6));
    
    String s3=s1.substring(2,8);
    System.out.println(" Extracted substring is :"+s3);
    System.out.println(" After Replacing g with i in s1 : " + s1.replace('i' ,'g'));
    
    String s4=" This is a book ";
    System.out.println(" The string s4 is :"+s4);
    System.out.println(" After trim() :"+s4.trim());
    }
}