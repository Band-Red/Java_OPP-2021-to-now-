public class S{
    public static void main(String[] args){
        String str = "FhD";
        System.out.println("FhD");
        
        String t = "ABC";
        System.out.println(t + "FhD");
        
        String c = "FhD".substring(2,3);
        System.out.println(c);
        
        String e = t.substring(1,2);
        System.out.println(e);
        
        boolean startsWith1 = str.startsWith("a");
        System.out.println(startsWith1);
        
        boolean startsWith2 = str.startsWith("F");
        System.out.println(startsWith2);
        
        System.out.println(str.contains("h"));
        
        boolean EndWith1 = t.endsWith("C");
        System.out.println(EndWith1);
        
        boolean EndWith2 = t.endsWith("D");
        System.out.println(EndWith2);
        
        System.out.println(str.indexOf("D"));
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.trim());
    }    
}

