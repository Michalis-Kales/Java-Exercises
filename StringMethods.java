
package stringmethods;


public class StringMethods {

    public static void main(String[] args) {
        
       //------------substring()-----------------
       
       String name="Stefanos";
       
      String subVar =name.substring(5, 8);
      
        System.out.println("The requested substring is : "+ subVar);
       
      //------------- endsWith()------------------
       boolean hasNameEnd1 =  name.endsWith("Stef");
        System.out.println(hasNameEnd1);
        
       boolean hasNameEnd2 =  name.endsWith("os");
       System.out.println(hasNameEnd2);
       
       //--------------startsWith()----------------
       
       boolean hasNameStart1 = name.startsWith("Ste");
        System.out.println(hasNameStart1);
        
       boolean hasNameStart2 = name.startsWith("ste");
        System.out.println(hasNameStart2);
        
        //---------------compareTo()----------------
       
    int comparison1 =  name.compareTo("Aggelos");
        System.out.println(comparison1);
        
    int comparison2 =  name.compareTo("Anthimos");
        System.out.println(comparison2);
    //----------------equalsIgnoreCase()-------------
    
    boolean isNameEq = name.equalsIgnoreCase("sTeFanOS");
    
        System.out.println(isNameEq);
    //-----------------------------------------------
    
    }
    
}
