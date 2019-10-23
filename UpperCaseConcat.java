
package uppercaseconcat;


public class UpperCaseConcat {

    
    public static void main(String[] args) {
        
        
        String name1="Nick";
        String name2="George";
        
        String conName  =  name1.concat(" "+name2);
        
        System.out.println("The concatenated string is: "+ conName);
        
        String  upperConName =conName.toUpperCase();
        
        System.out.println("After uppercase string becomes: "+ upperConName);
        
    }
    
}
