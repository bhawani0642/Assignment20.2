import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
/*
 * Created a class CopySet
 */
public class CopySet {
	public static void main(String args[]) {
		
		  
        //Creating an object of set and populating it, this is set1
        Set<String> set1 = new HashSet<String>();
        set1.add("Ram");
        set1.add("Rohan");
        set1.add("Suresh");
        
        //Creating another object of set and populating it, this is set2
        Set<String> set2 = new HashSet<String>();
        set2.add("Shayam");
        set2.add("Rounak");
        set2.add("Neha");
      
      // The print statements
       System.out.println("Set1 has:" + set1);
       System.out.println("Set2 has:" + set2);
       
       //Adding all elements of set2 to set1
       set1.addAll(set2);
     // The print statement
       System.out.println("Adding both sets:" + set1);
        
      


}
}