import java.util.HashSet;

public class ToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet <String> l = new HashSet <String>();
		
		l.add("Red");
		l.add("Green");
		l.add("Black");
		l.add("White");
		l.add("Pink");
		l.add("Yellow");
		
		System.out.println("Original Hash Set: " + l);
		
		String[] new_array = new String[l.size()];
	      l.toArray(new_array);
	 
	     // Displaying Array elements
	     System.out.println("Array elements: ");
	      for(String element : new_array){
	        System.out.println(element);

	}

}
}
